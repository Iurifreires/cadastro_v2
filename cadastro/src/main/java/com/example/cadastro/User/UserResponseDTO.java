package com.example.cadastro.User;

import java.time.LocalDate;

public record UserResponseDTO(Long id, String name, Boolean ativo, LocalDate datanasc, String login, LocalDate datacad, String senha) {

 public UserResponseDTO(User user){
        this(user.getId(), user.getName(), user.getAtivo(), user.getDatanasc(), user.getLogin(), user.getDatacad(), user.getSenha());

    }

}

