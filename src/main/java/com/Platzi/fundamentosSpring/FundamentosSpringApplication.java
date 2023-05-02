package com.Platzi.fundamentosSpring;


import com.Platzi.fundamentosSpring.repository.PostRepository;
import com.Platzi.fundamentosSpring.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {



	public FundamentosSpringApplication(
			UserRepository userRepository, PostRepository postRepository) {


	}

	public static void main(String[] args) {

		SpringApplication.run(FundamentosSpringApplication.class, args);
	}





	@Override
	public void run(String... args) throws Exception {




	}
}
