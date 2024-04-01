package com.example.cadastro.Controller;

import com.example.cadastro.Model.User;
import com.example.cadastro.Model.UserRepository;
import com.example.cadastro.Model.UserRequestDTO;
import com.example.cadastro.Model.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository repository;
       @GetMapping
        public List<UserResponseDTO> getAll(){
            List<UserResponseDTO> UserList = repository.findAll().stream().map(UserResponseDTO::new).toList();
            return UserList;

        }
        @PostMapping
        public void saveUser(@RequestBody UserRequestDTO data){
           User userData = new User(data);
           repository.save(userData);

    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserRequestDTO data) {
        Optional<User> optionalUser = repository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            repository.save(user);
        } else {

         }
       }
}
