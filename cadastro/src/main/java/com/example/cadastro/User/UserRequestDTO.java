package com.example.cadastro.User;

import java.time.LocalDate;

public record UserRequestDTO(String name, Boolean ativo, LocalDate datanasc, String login, LocalDate datacad, String senha) {
}
