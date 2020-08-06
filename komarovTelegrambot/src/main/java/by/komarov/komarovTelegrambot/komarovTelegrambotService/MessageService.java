package by.komarov.komarovTelegrambot.komarovTelegrambotService;

import by.komarov.komarovTelegrambot.IngvarKomarovBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



    @Service
    public class MessageService {

        @Autowired
        IngvarKomarovBot IngvarKomarovBot;

        public void SendMessage(Message message, String text) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId().toString());
            sendMessage.setText(text);
            try {
                IngvarKomarovBot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


