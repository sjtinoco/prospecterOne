package com.prospecti.prospecterOne.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.prospecti.prospecterOne.entities.User;
import com.prospecti.prospecterOne.repositories.UserRepository;

@Configuration  // para indicar que é uma classe de configuração
@Profile("test") //o nome que esta dentro dos parênteses deve ser igual que está em application.properties em "spring.profiles.active=test"
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
