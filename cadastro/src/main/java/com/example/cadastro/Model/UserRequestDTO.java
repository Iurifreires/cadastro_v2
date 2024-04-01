package com.example.cadastro.Model;

import java.util.Date;

public record UserRequestDTO(String name, Boolean ativo, Date datanasc, String login, Date datacad, String senha) {
}
