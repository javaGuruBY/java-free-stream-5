package by.jrr.mikhalchenko.StudyJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class StudyJavaApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(StudyJavaApplication.class, args);
	}

}
