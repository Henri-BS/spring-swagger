package com.pasifcode.spring_swagger.repository;

import com.pasifcode.spring_swagger.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário no repository");
        else System.out.println("UPDATE - Recebendo o usuário no repository");
        System.out.println(usuario);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando usuários do sistema");
        List<Usuario> usuarios =  new ArrayList<>();
        usuarios.add(new Usuario("Jack", "jack123"));
        usuarios.add(new Usuario("Helena", "helena123"));
        return  usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println("FIND/id - Recebendo o id: %d para localizar um usuário");
        return new Usuario("Jack", "Jack123");
    }

    public Usuario findByUsername(String username){
        System.out.println("FIND/username - recebendo o username: %s para localizar um usuário");
        return new Usuario("jack", "jack123");
    }

    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

}
