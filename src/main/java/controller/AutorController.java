package controller;

import Repository.AutorRepository;
import Service.AutorService;
import Service.UsuarioService;
import entity.Autor;
import entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    @Autowired
    private AutorService autorServiceService;

    // Endpoint para adicionar um novo Autor
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Autor> create(@RequestBody Autor autor) {
        Autor autorCriado = AutorService.create(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(autorCriado);
    }
    @GetMapping ("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Autor> findAll() {
        return autorServiceService.listartodod();
    }


    // Endpoint para remover
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        AutorService.delete(id);
    }

}
