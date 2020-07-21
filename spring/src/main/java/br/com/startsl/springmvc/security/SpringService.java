package br.com.startsl.springmvc.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.startsl.springmvc.dominios.Usuario;
import br.com.startsl.springmvc.repositorios.RepositorioUsuario;


//usado para verificar qual o perfil esta tentando acessar os nossos dados
public class SpringService implements UserDetailsService {

	@Autowired
	private RepositorioUsuario repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = repositorio.findByUserName(username);

		//Verifica se o usuario é nulo se sim lança uma execption
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario nao encontrado");
			
		}
		
		//Verifica qual o perfil de usuario que tentou acessar
		Set<GrantedAuthority> perfis = new HashSet<GrantedAuthority>();

		perfis.add(new SimpleGrantedAuthority(usuario.getRole()));
							
		return new User(usuario.getUsername(), usuario.getPassword(),perfis);
	}

}
