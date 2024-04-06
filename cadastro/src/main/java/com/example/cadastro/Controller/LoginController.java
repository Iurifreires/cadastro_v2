package com.example.cadastro.Controller;


import com.example.cadastro.User.User;
import com.example.cadastro.User.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("login")
@RestController
public class LoginController {


    private UserRepository userRepository;

    @GetMapping
    public String ShowLoginForm(){
        return "login/index";
    }

    @PostMapping
    public String processLogin(String login, String senha, Model model) {
        User user = userRepository.findByLogin(login);
        if (user != null && user.getSenha().equals(senha)) {
            return "redirect:/";
        } else {
            model.addAttribute("error", "Login ou senha inválido");
            return "login";
        }

    }
}
