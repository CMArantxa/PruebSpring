package com.ceica.PruebaSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Optional;


@SpringBootApplication
public class PruebaSpringApplication {
	private static final Logger log = LoggerFactory.getLogger(PruebaSpringApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(PruebaSpringApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(UserRepository userRepository,RolRepository rolRepository,TaskRepository taskRepository) {
		return (args) -> {

			/*Optional<User>user=userRepository.findById(2);
			if (user.isPresent())
			System.out.println(user.get().toString());*/

			/*Iterable<User> user=userRepository.findAll();
			System.out.println(user);*/

			User user=userRepository.findAllByUsername("pepe");
			System.out.println(user);


			/*User user=new User();
			user.setUsername("prueba1");
			user.setPassword("1234");
			user.setIdrol(1);
			userRepository.save(user);*/

			/*Rol rol=new Rol();
			rol.setDescription("ok");
			rolRepository.save(rol);*/

			/*Task task=new Task();
			task.setTitle("bailar");
			task.setDescription("hasta que el cuerpo aguante");
			task.setCreate_date(LocalDate.ofEpochDay(2024-03-18));
			task.setDeadline(LocalDate.ofEpochDay(2024-03-20));
			task.setStatus(String.valueOf(1));
			task.setIduser(2);
			taskRepository.save(task);*/

		};
	}
}
