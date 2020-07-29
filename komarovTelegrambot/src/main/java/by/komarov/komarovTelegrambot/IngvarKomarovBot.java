package by.komarov.komarovTelegrambot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class IngvarKomarovBot extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "1240356999:AAHAvcsO3NJiMg-8voYyz7YBSCyynMf0Au0";
    }

    @Override
    public String getBotUsername() {
        return "IngvarKomarovBot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                String text = message.getText();       
                if(text.equals("/Что это?")){
                    String response = "Это бот. Можно что то спрашивать, но пока он ничего толком не ответит)";
                    sendMsg(message, response);
                }
            }
        }
        
    }
    public void sendMsg (Message message, String response){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
