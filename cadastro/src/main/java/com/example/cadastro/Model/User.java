package com.example.cadastro.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity (name = "user")
@Table (name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String name;
    private Date datanasc;
    private Boolean ativo;
    private String senha;
    private Date datacad;


    public User(UserRequestDTO data){
      this.login = data.login();
      this.name = data.name();
      this.datanasc = data.datanasc();
      this.datacad = data.datacad();
      this.ativo = data.ativo();
      this.senha = data.senha();
    }

}
