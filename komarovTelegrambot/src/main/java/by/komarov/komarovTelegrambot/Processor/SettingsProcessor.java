package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;

@Service
public class SettingsProcessor implements Processor {

    @Override
    public String run() {

        return "Пока что нечего настраивать";
    }
}
