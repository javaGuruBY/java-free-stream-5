package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Sorry, currently all operators are busy";
    }
}
