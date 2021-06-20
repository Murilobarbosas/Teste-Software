package apibiblioteca.biblioteca.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apibiblioteca.biblioteca.Models.Livros;
import apibiblioteca.biblioteca.Repository.LivroRepository;

@Service
public class BibliotecaService {

    @Autowired
    LivroRepository livroRepository;

    public String tituloRetorno(String nome) {
        Optional<Livros> lOptional = livroRepository.findByReserveName(nome);
        return lOptional.get().getTitulo().toString();
        
    }

}
