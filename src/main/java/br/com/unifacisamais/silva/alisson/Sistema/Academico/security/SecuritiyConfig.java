package br.com.unifacisamais.silva.alisson.Sistema.Academico.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecuritiyConfig{
	
	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.csrf(csrf -> csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy
						(SessionCreationPolicy.STATELESS)).authorizeHttpRequests(authorize -> authorize.requestMatchers(HttpMethod.POST,"/auth/login")
								.permitAll().requestMatchers(HttpMethod.GET,"/users").hasRole("ADMIN").
								requestMatchers(HttpMethod.GET,"/students").hasRole("ADMIN").requestMatchers(HttpMethod.GET,"/students/{id}").hasRole("ADMIN").
								requestMatchers(HttpMethod.GET, "/punctuations/{cardId}/list").hasAnyRole("STUDENT","ADMIN").
								requestMatchers(HttpMethod.GET, "/teachers").hasRole("ADMIN").requestMatchers(HttpMethod.GET,"/punctuations/{cardId}/list").hasRole("TEACHER")
								.requestMatchers(HttpMethod.POST, "/auth/register").hasRole("ADMIN").
								requestMatchers(HttpMethod.POST,"/punctuations").hasRole("TEACHER")
								.requestMatchers(HttpMethod.POST, "/disciplines").hasRole("ADMIN").anyRequest().authenticated()).build();		
	}
							
	
	/*@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.csrf(csrf -> csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy
						(SessionCreationPolicy.STATELESS)).build();
	}*/
	
	@Bean	
	public AuthenticationManager autheticationManager ( AuthenticationConfiguration authenticationConfiguration) throws Exception{
			return authenticationConfiguration.getAuthenticationManager();
		}
	
	@Bean
	public PasswordEncoder passwordEncoder () {
		return new BCryptPasswordEncoder();
	}
}
 