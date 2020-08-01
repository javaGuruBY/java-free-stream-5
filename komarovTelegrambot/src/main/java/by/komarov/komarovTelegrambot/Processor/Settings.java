package by.komarov.komarovTelegrambot.Processor;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
public class SettingsProcessor implements Processor {

    @Override
    public String run() {
        return "Nothing you can set now, sorry...";
    }
}
@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Sorry, currently all operators are busy";
    }
}
@Service
public class StartProcessor implements Processor{
    @Override
    public String run() {
        Message message = new Message();
        return "Привет, " + message.getFrom().getFirstName() + ". Это бот. Можно что то спрашивать, но пока он ничего толком не ответит)";
    }
}
@Service
public class NoneProcessor implements Processor {

    @Override
    public String run() {
        return "none";
    }
}




