package by.komarov.komarovTelegrambot.komarovTelegrambotService;

import by.komarov.komarovTelegrambot.BotCommand;
import by.komarov.komarovTelegrambot.Processor.HelpProcessor;
import by.komarov.komarovTelegrambot.Processor.NoneProcessor;
import by.komarov.komarovTelegrambot.Processor.SettingsProcessor;
import by.komarov.komarovTelegrambot.Processor.StartProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class RequestDispatcher {
    @Autowired
   MessageService messageService;
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
                messageService.SendMessage(update.getMessage(), startProcessor.run(update.getMessage()));
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
