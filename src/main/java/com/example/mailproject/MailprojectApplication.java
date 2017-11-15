package com.example.mailproject;

import com.example.mailproject.entity.User;
import com.example.mailproject.entity.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MailprojectApplication {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(MailprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(UserRepository repository) {
		return (args)->{
			repository.save(new User(1L, "Jack", "shiny777@bk.ru"));
			repository.save(new User(2L, "Chloe", "chloe@chloe.com"));
			repository.save(new User(3L, "Ron", "ron@example.com"));
			repository.save(new User(4L, "Kate", "kate.strong@mule.com"));
		};
	}
}
