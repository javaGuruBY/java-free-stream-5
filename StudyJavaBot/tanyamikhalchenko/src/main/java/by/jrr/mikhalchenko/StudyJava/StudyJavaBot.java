package by.jrr.mikhalchenko.StudyJava;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Objects;

@Component
public class StudyJavaBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "StudyJavaBot";
    }

    @Override
    public String getBotToken() {
        return "1285998012:AAGmj9LIwjgs-y0mHZ-L2e_eZyALDwoawm0";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message message = update.getMessage();
            if (message.hasText()){
                String text = message.getText();
                if (text.equals("/hello")){
                    String responce = "Hello " + message.getFrom().getFirstName() + " " + message.getFrom().getLastName();
                    sendMesg(message, responce);
                } else if(text.equals("/start")) {
                    String responce = "Can I help you?";
                    sendMesg(message, responce);
                } else if(text.equals("/help")) {
                    String responce = "If you ask me I'll tell you about Java, Google, JVM, JRE, JDK. Write the word /say and your question.";
                    sendMesg(message, responce);
                } else if(text.equals("/bye")) {
                    String responce = "Bye  " + message.getFrom().getFirstName() + " " + message.getFrom().getLastName();
                    sendMesg(message, responce);

                }else if(text.startsWith("/say")) {
                   String question = text.substring(text.indexOf("/say") + "/say".length()).trim();

                   if (question.equals("What is name?")) {
                       String responce = "I'm StudyJavaBot";
                       sendMesg(message, responce);
                    } else if (question.contains("Google")) {
                       String responce = "Maxim will tell you how to get into Google https://www.instagram.com/p/CDMJ8iRnCwd/?igshid=17dschfurrip0";
                       sendMesg(message, responce);

                   }else if (question.contains("Java")) {
                       String responce = "Come to the school of Java Guru for intensive https://javaguru.by/";
                       sendMesg(message, responce);
                   }else if (question.contains("JDK")) {
                       String responce = "Java Development Kit (JDK) is a superset of a JRE and contains tools for Java programmers, e.g. a java compiler.";
                       sendMesg(message, responce);
                   }else if (question.contains("JRE")) {
                       String responce = "Java Runtime Environment (JRE) is a software package that contains what is required to run a Java program.";
                       sendMesg(message, responce);
                   }else if (question.contains("JVM")) {
                       String responce = "Java Virtual Machine (JVM) is an abstract computing machine that enables computer to run a Java program. ";
                       sendMesg(message, responce);
                   }
                   else if (!question.contains("JRE") || !question.contains("JDK") || !question.contains("JVM") || !question.contains("Google") || !question.contains("Java")) {
                       String responce = "I don't know yet, but you can find the answer here https://javaguru.by/";
                       sendMesg(message, responce);
                   }

                   }
            }
        }
    }
    public void sendMesg(Message message,String responce){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(responce);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
