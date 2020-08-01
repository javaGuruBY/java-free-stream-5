package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
public class StartProcessor implements Processor {
    @Override
    public String run() {
        Message message = new Message();
        return "Привет, " + message.getFrom().getFirstName() + ". Это бот. Можно что то спрашивать, но пока он ничего толком не ответит)";
    }
}
