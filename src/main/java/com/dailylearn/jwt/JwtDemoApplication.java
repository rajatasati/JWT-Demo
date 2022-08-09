package com.dailylearn.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		// PasswordEncoder for Dummy user
		return NoOpPasswordEncoder.getInstance();

		// PasswordEncoder for fetched user from database
		//return new BCryptPasswordEncoder(11);
	}
}
