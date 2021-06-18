package apibiblioteca.biblioteca.Resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apibiblioteca.biblioteca.Models.Livros;
import apibiblioteca.biblioteca.Repository.LivroRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class LivrosResources {
    
    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/livros")
    public List<Livros> listaLivros(){
        return livroRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public Livros listaLivro(@PathVariable(value = "id") long id){
        return livroRepository.findById(id);
    }

    @DeleteMapping("/livro")
    public void deletaLivro(@RequestBody @Valid Livros livros){
        livroRepository.delete(livros);
    }

    @PostMapping("/livro")
    public Livros salvarLivros(@RequestBody @Valid Livros livros){
        return livroRepository.save(livros);
    }

    @PutMapping("livros")
    public Livros atualizarLivros(@RequestBody @Valid Livros livros){
        return livroRepository.save(livros);
    }
}
