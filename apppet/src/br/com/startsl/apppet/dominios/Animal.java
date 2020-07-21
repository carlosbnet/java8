package br.com.startsl.apppet.dominios;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_animais")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
 //   @NotNull(message = "Campo não pode ser nulo!")
 //   @NotEmpty(message = "Campo nao pode ser vazio!")
    private String nome;

  //  @NotNull(message = "Campo não pode ser nulo!")
 //   @NotEmpty(message = "Campo nao pode ser vazio!")
    private Integer idade;

  //  @NotNull(message = "Campo não pode ser nulo!")
  //  @NotEmpty(message = "Campo nao pode ser vazio!")
    private String raca;

  //  @NotNull(message = "Campo não pode ser nulo!")
  //  @NotEmpty(message = "Campo nao pode ser vazio!")
    private String dono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
