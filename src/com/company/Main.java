package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        Bot bot = new Bot();
        bot.init();
    }

    public static void downloadImg(String url) throws IOException {
        String fileName = "./src/img/waifu.jpg";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(url).openStream());
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
