package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Ничем пока не помогу, я еще маленький. Но можешь спросить /Какой фильм глянуть или /Что сделать на ужин)";
    }
}
