package com.pasifcode.spring_swagger.repository;

import com.pasifcode.spring_swagger.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário no repository");
        else System.out.println("UPDATE - Recebendo o usuário no repository");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando usuários do sistema");
        List<Usuario> usuarios =  new ArrayList<>();
        usuarios.add(new Usuario("Jack", "jack123"));
        usuarios.add(new Usuario("Helena", "helena123"));
        return  usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário"));
        return new Usuario("Jack", "Jack123");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar um usuário"));
        return new Usuario("jack", "jack123");
    }
}
