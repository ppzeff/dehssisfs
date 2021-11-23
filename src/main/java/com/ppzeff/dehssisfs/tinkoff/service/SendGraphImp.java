package com.ppzeff.dehssisfs.tinkoff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;

import static javax.management.timer.Timer.ONE_WEEK;

public class SendGraphImp implements SendGraph{

    @Autowired
    MakeGraphServiceImp makeGraphService;

    @Override
    public void sendGraph(String  str) {
        if (str.equals("/week840")) {
//
//            long start = System.currentTimeMillis();
//            String fileName = makeGraphService.makeGraph(840,ONE_WEEK)+".jpg";
//            SendPhoto photo = new SendPhoto();
//            photo.setChatId(chatId);
//            photo.setPhoto(new InputFile(new File(fileName)));
//            photo.setCaption("График сформирован за: " +  (System.currentTimeMillis()-start) + "милисекунд");
//            try {
//                execute(photo);
//                new File(fileName).delete();
////                execute(messageBuilder.build());
//            } catch (TelegramApiException e) {
//                System.out.println(e.toString());
//            }
        }
    }
}
