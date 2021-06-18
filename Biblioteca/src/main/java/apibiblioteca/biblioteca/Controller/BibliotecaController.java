package apibiblioteca.biblioteca.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import apibiblioteca.biblioteca.Models.Livros;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaController {
    @GetMapping
    @ResponseBody
    public String getAll(){
        return "Ok";
    }

    @PostMapping
    public ResponseEntity<Livros> save(Livros livros){
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }
}
