package com.pasifcode.spring_swagger.controller;

import com.pasifcode.spring_swagger.entity.Usuario;
import com.pasifcode.spring_swagger.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/save")
    public void saveUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> findUsers(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findUserById(@PathVariable Integer id){
        return usuarioRepository.findById(id);
    }

    @GetMapping("/username/{username}")
    public Usuario findUserByUsername(@PathVariable String username){
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioRepository.deleteById(id);
    }

}
