package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;

public class AuthorizartionService implements  UserDetailsService {
	
	@Autowired
	UserRepository userRepository; 
	
	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
