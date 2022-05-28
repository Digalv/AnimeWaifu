package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
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
        System.out.println(update.getMessage().getFrom().getUserName());
        System.out.println(update.getMessage().getFrom().getId());
            if (update.getMessage().getText().equals("/waifu") || update.getMessage().getText().equals("/waifu@RandomWaifuDigalv_bot")  ){
                JSONGetter jsonGetter = new JSONGetter();
                JSONGetter.url = "https://api.waifu.im/random";
                jsonGetter.run();
                System.out.println("2");
                try {
                    Main.downloadImg(new ObjectMapper().readValue(jsonGetter.jsonIn, Waifu.class).getImages().get(0).getUrl());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //SendDocument sendDocument = new SendDocument(update.getMessage().getChatId().toString(),new InputFile(new File("./src/img/waifu.jpg")));
                SendPhoto sendPhoto = new SendPhoto(update.getMessage().getChatId().toString(),new InputFile(new File("./src/img/waifu.jpg")));
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getMessage().getText().equals("/waifuNSFW") || update.getMessage().getText().equals("/waifuNSFW@RandomWaifuDigalv_bot")){
                JSONGetter jsonGetter = new JSONGetter();
                JSONGetter.url = "https://api.waifu.pics/nsfw/waifu";
                jsonGetter.run();
                try {
                    Main.downloadImg(new ObjectMapper().readValue(jsonGetter.jsonIn, WaifuNSFW.class).getUrl());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                SendPhoto sendPhoto = new SendPhoto(update.getMessage().getChatId().toString(),new InputFile(new File("./src/img/waifu.jpg")));
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
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
