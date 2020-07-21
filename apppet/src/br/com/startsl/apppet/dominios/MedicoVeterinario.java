package br.com.startsl.apppet.dominios;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_medico_veterinario")
public class MedicoVeterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  //  @NotEmpty
 //   @NotNull
    private String nome;

 //   @NotEmpty
 //   @NotNull
    private String especialidade;

  //  @NotEmpty
  //  @NotNull
    private Integer num_crv;




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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getNum_crv() {
        return num_crv;
    }

    public void setNum_crv(Integer num_crv) {
        this.num_crv = num_crv;
    }
}
