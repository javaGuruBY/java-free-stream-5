package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;

@Service
public class NoneProcessor implements Processor {

    @Override
    public String run() {
        return "Спроси позже...через пару месяцев";
    }
}




