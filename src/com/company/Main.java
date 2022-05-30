package com.company;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        //downloadMedia("https://nekos.best/api/v2/sleep/005.gif", "gif.gif");
        Bot bot = new Bot();
        bot.init();
    }

    public static void downloadMedia(String url, String imageName) throws IOException {
            String fileName = "./src/img/" + imageName;
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
