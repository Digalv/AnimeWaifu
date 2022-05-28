package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;
import java.io.IOException;

public class Bot  extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if(update.getMessage().getFrom().getUserName().equals("Nerfayxd")){
            System.out.println("Женя сосет бибу");
        }
        else{
            if (update.getMessage().getText().equals("/waifu") || update.getMessage().getText().equals("/waifu@RandomWaifuDigalv_bot")  ){
                System.out.println(update.getMessage().getFrom().getFirstName());
                try {
                    Main.downloadImg();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                SendPhoto sendPhoto = new SendPhoto(update.getMessage().getChatId().toString(),new InputFile(new File("./src/img/waifu.jpg")));
                //sendPhoto.setChatId(update.getMessage().getChatId().toString());
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "RandomWaifuDigalv_bot";
    }

    @Override
    public String getBotToken() {
        return "5416862989:AAFOB3Aj9Ac97MaGu8ASVB43Q_Oy3EZGJlA";
    }

    public void init(){
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(this);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
