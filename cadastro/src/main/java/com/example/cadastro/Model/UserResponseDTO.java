package com.example.cadastro.Model;

import java.util.Date;

public record UserResponseDTO(Long id, String name, Boolean ativo, Date datanasc, String login, Date datacad, String senha) {

 public UserResponseDTO(User user){
        this(user.getId(), user.getName(), user.getAtivo(), user.getDatanasc(), user.getLogin(), user.getDatacad(), user.getSenha());

    }

}

