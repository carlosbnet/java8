package br.com.startsl.apppet.dominios;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tbl_prontuarios")
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @NotEmpty
  //  @NotNull
    private String atend_veterinario;

  //  @NotEmpty
  //  @NotNull
    private String animal_atend;

  //  @NotEmpty
  //  @NotNull
  //  @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_atendimnento;

    @Column(length = 255)
    private String observacao;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAtend_veterinario() {
        return atend_veterinario;
    }

    public void setAtend_veterinario(String atend_veterinario) {
        this.atend_veterinario = atend_veterinario;
    }

    public String getAnimal_atend() {
        return animal_atend;
    }

    public void setAnimal_atend(String animal_atend) {
        this.animal_atend = animal_atend;
    }

    public Date getData_atendimnento() {
        return data_atendimnento;
    }

    public void setData_atendimnento(Date data_atendimnento) {
        this.data_atendimnento = data_atendimnento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
