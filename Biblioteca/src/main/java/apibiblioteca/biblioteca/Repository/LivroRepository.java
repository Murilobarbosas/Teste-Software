package apibiblioteca.biblioteca.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import apibiblioteca.biblioteca.Models.Livros;

public interface LivroRepository extends JpaRepository<Livros, Long>{
    Livros findById(long id);
    Optional<Livros> findByReserveName(String name);
}
