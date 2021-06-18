package apibiblioteca.biblioteca.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "bibliotecas")
public class Livros implements Serializable{
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String titulo;

    @NotNull
    private String autor;

    @NotNull
    private String descricao;

    @NotNull
    private String data;

    @NotNull
    private BigDecimal quantidade;

    @NotNull
    private BigDecimal valor;

    public Livros(long l, String string, String string2, String string3, String string4, int i, double d) {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
