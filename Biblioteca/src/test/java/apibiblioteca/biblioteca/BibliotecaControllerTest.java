package apibiblioteca.biblioteca;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import apibiblioteca.biblioteca.Models.Livros;

@SpringBootTest
@AutoConfigureMockMvc
public class BibliotecaControllerTest {
    
    @Autowired
    MockMvc mockMvc;
    
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void bibliotecaTestGetAll() throws Exception{
        mockMvc.perform(get("/bibliotecas"))
            .andExpect(status().isOk());
    }

    @Test
    public void bibliotecaTestSave() throws Exception{
        Livros livros = new Livros(1L, "Harry Potter", "JK Rowling", "Livros de magia", "12/04/1997", 5, 65);

        mockMvc.perform(post("/bibliotecas"))
            .contentType("application/json")
            .content(objectMapper.writeValueAsString(livros))
            .andExpect(status().isOk());
    }
}
