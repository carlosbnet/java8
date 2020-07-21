package br.com.startsl.apppet.security;

import br.com.startsl.apppet.dominios.Usuario;
import br.com.startsl.apppet.repositorios.RepositorioUsuario;
import org.hibernate.jpa.internal.schemagen.ScriptTargetOutputToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
     private RepositorioUsuario repositorioUsuario;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

         Usuario user  = repositorioUsuario.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Usuario "+username+" não encontrado!");
        }


        return new UserPrincipal(user);

    }
}
