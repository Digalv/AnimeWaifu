package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        /*JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://api.waifu.im/random";
        jsonGetter.run();
        Waifu waifu = new ObjectMapper().readValue(jsonGetter.jsonIn, Waifu.class);
        System.out.println(waifu.getImages().get(0).getUrl());
        downloadImg(new ObjectMapper().readValue(jsonGetter.jsonIn, Waifu.class).getImages().get(0).getUrl());*/

        Bot bot = new Bot();
        bot.init();
    }

    public static void downloadImg() throws IOException {
        String fileName = "./src/img/waifu.jpg";
        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://api.waifu.im/random";
        jsonGetter.run();
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(new ObjectMapper().readValue(jsonGetter.jsonIn, Waifu.class).getImages().get(0).getUrl()).openStream());
            byte[] data = new byte[1000000];
            int count;
            while ((count = bufferedInputStream.read(data, 0, 1000000)) != -1){
                fileOutputStream.write(data, 0, count);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            bufferedInputStream.close();

    }
}
