package br.com.startsl.apppet.dominios;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;


@Entity
@Table(name = "tbl_usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String roler;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoler() {
        return roler;
    }

    public void setRoler(String roler) {
        this.roler = roler;
    }
}
