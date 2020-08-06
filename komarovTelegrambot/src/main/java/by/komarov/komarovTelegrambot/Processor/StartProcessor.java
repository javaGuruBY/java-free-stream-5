package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;


@Service
public class StartProcessor {

    public String run(Message message) {


        return "Привет, " + message.getFrom().getFirstName() + ". Это бот. Введи /help";
    }

}


