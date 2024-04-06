package com.example.cadastro.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private LocalDate datanasc;
    private Boolean ativo;
    private String senha;
    private LocalDate datacad = LocalDate.now();


    public User(UserRequestDTO data){
      this.login = data.login();
      this.name = data.name();
      this.datanasc = data.datanasc();
      this.datacad = LocalDate.now();
      this.ativo = data.ativo();
      this.senha = data.senha();
    }

}
