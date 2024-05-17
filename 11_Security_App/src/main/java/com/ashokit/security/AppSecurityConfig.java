package com.ashokit.security;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

//	 @Bean
	public SecurityFilterChain securityInfo(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req) -> req
								 .requestMatchers("/contact", "/about").permitAll()
								 .anyRequest()
							     .authenticated())
								 .formLogin();
		return http.build();
}

	 public InMemoryUserDetailsManager inMem(){
		UserDetails u1 = User.withDefaultPasswordEncoder()
										.username("john")
										.password("john111")
										.roles("Admin")
										.build();
				
			UserDetails u2 =User.withDefaultPasswordEncoder()
													.username("rahul")
													.password("rahul000")
													.roles("User")
													.build();
				
		 return new InMemoryUserDetailsManager(u1,u2);
	 }
	 
	 
}
