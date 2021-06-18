package apibiblioteca.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import apibiblioteca.biblioteca.Models.Livros;
import apibiblioteca.biblioteca.Repository.LivroRepository;
import apibiblioteca.biblioteca.Service.BibliotecaService;

@RunWith(SpringRunner.class)
public class BibliotecaServiceTest {
    
    @TestConfiguration
    static class BibliotecaServiceTestConfiguration{
        
        @Bean
        public BibliotecaService bService(){
            return new BibliotecaService();
        }
    }

    @Autowired
    BibliotecaService bibliotecaService;

    @MockBean
    LivroRepository livroRepository;

    @Test
    public void BibliotecaServiceDados(){
        String nome = "Harry Potter";
        String index = bibliotecaService.tituloRetorno(nome);

        Assertions.assertEquals(index, "Harry Potter");
    }

    @Before
    public void setup(){
        Livros livros =new Livros(1L, "Harry Potter", "JK Rowling",
         "Livro de magia", "12/12/1997", 5, 65.5);

         Mockito.when(livros.getTitulo().toString()).thenReturn(livros.getTitulo());
    }
}
