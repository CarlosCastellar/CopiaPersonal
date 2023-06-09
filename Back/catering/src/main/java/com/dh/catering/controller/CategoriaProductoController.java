package com.dh.catering.controller;

import com.dh.catering.dto.CategoriaProductoDto;
import com.dh.catering.exceptions.AsignacionException;
import com.dh.catering.exceptions.NombreDuplicadoException;
import com.dh.catering.exceptions.RecursoNoEncontradoException;
import com.dh.catering.service.CategoriaProductoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@Tag(name = "Categorias")
@Slf4j
public class CategoriaProductoController {

    @Autowired
    private CategoriaProductoService categoriaProductoService;

    @Autowired
    private ObjectMapper mapper;

    @PostMapping(value = "/registrar", consumes = {"multipart/form-data", "application/octet-stream"})
    @Operation(summary = "Registrar una categoria", security = @SecurityRequirement(name = "bearerAuth"))
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> registrar(@RequestParam("categoriaDto")String categoriaProductoDto,
                                            @RequestParam("imgFile")MultipartFile multipartFile) throws JsonProcessingException, NombreDuplicadoException {
        CategoriaProductoDto dtoObtenido = mapper.readValue(categoriaProductoDto,CategoriaProductoDto.class);
        return categoriaProductoService.save(dtoObtenido,multipartFile)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.internalServerError().build());
    }

    @GetMapping("/todos")
    @Operation(summary = "Listar todas las categorias")
    public ResponseEntity<List<CategoriaProductoDto>> listarTodos(){
        return ResponseEntity.ok(categoriaProductoService.findAll());
    }

    @GetMapping("/id/{id}")
    @Operation(summary = "buscar categoria por su id")
    public ResponseEntity<CategoriaProductoDto> buscarPorId(@PathVariable Long id) throws RecursoNoEncontradoException {
        return categoriaProductoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nombre/{nombre}")
    @Operation(summary = "buscar categoria por su nombre")
    public ResponseEntity<CategoriaProductoDto> buscarPorNombre(@PathVariable String nombre) throws RecursoNoEncontradoException {
        return categoriaProductoService.getByNombre(nombre)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Eliminar una categoria por su id", security = @SecurityRequirement(name = "bearerAuth"))
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> eliminarPorId(@PathVariable Long id) throws RecursoNoEncontradoException, AsignacionException {
        return categoriaProductoService.deleteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping(value = "/actualizar/{id}", consumes = {"multipart/form-data", "application/octet-stream"})
    @Operation(summary = "Actualizar una categoria por su id", security = @SecurityRequirement(name = "bearerAuth"))
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> actualizarPorId(@PathVariable Long id,@RequestParam("categoriaDto") String categoriaDto,@RequestParam("imgFile") MultipartFile file) throws JsonProcessingException, RecursoNoEncontradoException, AsignacionException, NombreDuplicadoException {
        CategoriaProductoDto categoriaProductoDto = mapper.readValue(categoriaDto, CategoriaProductoDto.class);
        return categoriaProductoService.updateById(id,categoriaProductoDto,file)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().build());
    }

}
