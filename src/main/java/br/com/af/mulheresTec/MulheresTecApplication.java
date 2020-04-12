package br.com.af.mulheresTec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MulheresTecApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulheresTecApplication.class, args);
	}

}
