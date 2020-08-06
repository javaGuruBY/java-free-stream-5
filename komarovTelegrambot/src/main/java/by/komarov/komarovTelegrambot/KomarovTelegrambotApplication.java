package by.komarov.komarovTelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class KomarovTelegrambotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(KomarovTelegrambotApplication.class, args);
	}

}
