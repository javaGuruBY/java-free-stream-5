package by.komarov.komarovTelegrambot.komarovTelegrambotService;

import by.komarov.komarovTelegrambot.BotCommand;
import by.komarov.komarovTelegrambot.IngvarKomarovBot;
import by.komarov.komarovTelegrambot.Processor.HelpProcessor;
import by.komarov.komarovTelegrambot.Processor.NoneProcessor;
import by.komarov.komarovTelegrambot.Processor.SettingsProcessor;
import by.komarov.komarovTelegrambot.Processor.StartProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class RequestDispatcher{
    @Autowired
    komarovTelegrambotService.MessageService messageService;
    @Autowired
    HelpProcessor helpProcessor;
    @Autowired
    SettingsProcessor settingsProcessor;
    @Autowired
    StartProcessor startProcessor;
    @Autowired
    NoneProcessor noneProcessor;


    public void dispatch(Update update) {
        switch (getCommand(update)) {
            case HELP:
                messageService.SendMessage(update.getMessage(), helpProcessor.run());
                break;
            case START:
                messageService.SendMessage(update.getMessage(), startProcessor.run());
                break;
            case SETTING:
                messageService.SendMessage(update.getMessage(), settingsProcessor.run());
                break;
            case NONE:
                messageService.SendMessage(update.getMessage(), noneProcessor.run());
                break;
        }
    }

    private BotCommand getCommand(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                String msgText = message.getText();
                if (msgText.startsWith(BotCommand.HELP.getCommand())) {
                    return BotCommand.HELP;
                } else if (msgText.startsWith(BotCommand.START.getCommand())) {
                    return BotCommand.START;
                } else if (msgText.startsWith(BotCommand.SETTING.getCommand())) {
                    return BotCommand.SETTING;
                }
            }
        }
        return BotCommand.NONE;
    }
}


public class komarovTelegrambotService {
    @Service
    public class MessageService {


        @Autowired
        IngvarKomarovBot IngvarKomarovBot;

        public void SendMessage(Message message, String text) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId().toString());
            sendMessage.setText();
            try {
                IngvarKomarovBot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

}
