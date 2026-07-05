package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Toliq extends TelegramLongPollingBot {
    @Override

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();
        System.out.println(message.getPhoto());

        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId1 = update.getMessage().getChatId();

            // 2. Har qanday xabar kelganda birinchi shu metodga jo'natamiz
            sendAkrill(chatId, messageText);
            sendMdf(chatId, messageText);
            sendDsp(chatId, messageText);


        }

        switch (text) {
            case "/start" -> sendStart(chatId, "Assalomu Aleykum botga hush kebsiz");
            case "Sp Kampilekt" ->
                    sendSpanlikampilekt1chirasm(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                            "©Firma nomi:   Joziba Mebel\n" +
                            "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                            "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                            "\uD83D\uDCDE Telefon: +998882220014\n" +
                            "\uD83D\uDCDE Telefon: +998915780014\n" +
                            "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                            "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Shkaf" -> sendShkaflar(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");

            case "Stol Stul" -> sendStolstul(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Divanlar" -> sendDivanlar(chatId, "");
            case "1 kishilik divan" -> send1kishilik(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Ortga" -> sendStart(chatId, "");
            case "2 kishilik divan" -> send2kishilik(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Eshiklar" -> sendEshik(chatId, "");
            case "Kuxni" ->
                    sendKuxniMatrial(chatId, "Xurmatli Foydalanuvchi Sizga Hozir Qaysi matrialni Tanlasangiz Sizga Tushuntrib beraman qanqa bo'lishini");
            case "Dsp" -> sendDsp(chatId, "");
            case "Akril" -> sendAkrill(chatId, "");
            case "Mdf" -> sendMdf(chatId, "");
            case "Rasm va Narxlari" -> sendKuxniNarxlari(chatId, "");
            case "Akril Narxi" -> sendAkrilNarxi(chatId, "\uD83D\uDD39 Model : Akril\n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "Narxi :Akrilni Metri 1600 Ming \n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Dsp Narxi" -> sendDspnarxi(chatId, "\uD83D\uDD39 Model : Dsp\n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "Narxi :Dsp Metri 1100 ming Ming \n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");

            case "Mdf Narxi" -> senMdfnarxi(chatId, "\uD83D\uDD39 Model : Dsp\n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "Narxi :Dsp Metri 1800  Ming \n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Biz xaqimizda Malu'mot" ->
                    sendBizxaqizda(chatId, "\uD83D\uDCBC \"Joziba Mebel\" — Surxondaryodagi 1-raqamli mebel fabrikasi!\n" +
                            "\n" +
                            "Mebel biznesida 25 yildan ortiq tajribaga ega bo‘lgan fabrikamiz sizga yotoqxona, oshxona, mehmonxona va ofis mebellarining eng zamonaviy hamda sifatli namunalarini taklif etadi. \n" +
                            "\n" +
                            "25 yil davomida biz faqatgina mebel ishlab chiqarmadik, balki minglab xonadonlarga shinamlik va baxt olib kirdik. Surxondaryodagi eng yirik fabrika sifatida biz har doim sifatingiz xizmatidamiz!\n" +
                            "\n" +
                            "\uD83D\uDCD0 Sifat va vaqt sinovidan o'tgan mebellar faqat bizda!");

            case "Shkaf va Perexoshka" -> sendShkafandperexoshka(chatId, "");
            case "Perexoshka" -> sendPerehoshka(chatId, "Narxini Bilish uchun lichkaga yozsiz  \n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
            case "Yumshoq Mebel" -> sendYumoshoqmebel(chatId, "\uD83D\uDD39 Model : Yumshoq Mebel\n" +
                    "©Firma nomi:   Joziba Mebel\n" +
                    "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                    "Narxini bilish uchun lichkaga\n" +
                    "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                    "\uD83D\uDCDE Telefon: +998882220014\n" +
                    "\uD83D\uDCDE Telefon: +998915780014\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                    "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                    "\n" +
                    "\n" +
                    "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
        }
    }

    @Override
    public String getBotUsername() {
        return "@JozibaMebelbot";
    }

    @Override
    public String getBotToken() {
        return "7995346950:AAFfnACA91BrFiWEa1XtezM5Y1bv6k_XQaE";
    }

    private void sendStart(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton("Sp Kampilekt");
        KeyboardButton button2 = new KeyboardButton("Stol Stul");
        KeyboardButton button3 = new KeyboardButton("Eshiklar");
        KeyboardButton button4 = new KeyboardButton("Yumshoq Mebel");
        KeyboardButton button5 = new KeyboardButton("Kuxni");
        KeyboardButton button6 = new KeyboardButton("Shkaf va Perexoshka");
        KeyboardButton button7 = new KeyboardButton("Divanlar");
        KeyboardButton button8 = new KeyboardButton("Biz xaqimizda Malu'mot");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);

        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(row1);
        qatorlar.add(row2);
        qatorlar.add(row3);
        qatorlar.add(row4);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        markup.setSelective(false);
        markup.setIsPersistent(true);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu Aleykum Joziba Mebel Botiga xushkelibsiz!");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSpanlikampilekt1chirasm(long chatId, String text) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/photo_2024-08-30_20-07-42.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/photo_2024-11-05_10-57-18.jpg")));
        photo1.setCaption(text); // Agar caption kerak bo'lsa


        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/photo_2024-11-09_21-15-18.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/photo_2024-11-11_10-51-54.jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/photo_2024-11-17_17-42-33.jpg")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/photo_2024-12-15_14-26-18.jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/photo_2025-01-20_14-34-54.jpg")));
        photo6.setCaption(text);


        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/photo_2025-07-08_16-38-10.jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/photo_2025-03-22_09-54-40.jpg")));
        photo8.setCaption(text);


        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/photo_2025-03-03_12-32-17.jpg")));
        photo9.setCaption(text);

        try {
            execute(photo3);
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);


        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }



    }

    private void sendShkaflar(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/Sophisticated 94_5&amp;#8243; Tall Wardrobe with Fluted Glass Doors &amp;#038; Integrated LED Lighting, E0 Eco-Friendly Modern Armoire for Luxurious Bedroom Storage.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/Без названия (13).webp")));
        photo1.setCaption(text); // Agar caption kerak bo'lsa


        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Без названия (14).jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-02_14-42-28.jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Wooden Modern Wardrobe Design Trends 2026.jpg")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/Без названия (6).jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/photo_2025-10-06_22-45-39.jpg")));
        photo6.setCaption(text);


        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/photo_2025-09-29_20-51-52.jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Без названия (5).jpg")));
        photo8.setCaption(text);


        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/photo_2025-08-04_10-37-43.jpg")));
        photo9.setCaption(text);


        SendPhoto photo10 = new SendPhoto();
        photo10.setChatId(chatId);
        photo10.setPhoto(new InputFile(new File("src/main/resources/photo_2024-10-21_20-43-01.jpg")));
        photo10.setCaption(text);

        SendPhoto photo11 = new SendPhoto();
        photo11.setChatId(chatId);
        photo11.setPhoto(new InputFile(new File("src/main/resources/wardrobe.jpg")));
        photo11.setCaption(text);

        SendPhoto photo12 = new SendPhoto();
        photo12.setChatId(chatId);
        photo12.setPhoto(new InputFile(new File("src/main/resources/Home - Arredo Casa Group.jpg")));
        photo12.setCaption(text);

        SendPhoto photo13 = new SendPhoto();
        photo13.setChatId(chatId);
        photo13.setPhoto(new InputFile(new File("src/main/resources/Virtuves un skapji pēc pasūtījuma _ ALANDEKO.jpg")));
        photo13.setCaption(text);



        try {
            execute(photo3);
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);
            execute(photo10);
            execute(photo11);
            execute(photo12);
            execute(photo13);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    private void sendStolstul(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/71_ Marble Dining Room Table Sintered Stone Table Top for Kitchen with Metal Gold Finish Legs.jpg")));
        photo.setCaption(text);

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Без названия.webp")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Без названия (1).webp")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Без названия (7).jpg")));
        photo4.setCaption(text);

        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/JG Mobiliário Interiores on Instagram_ _\uD83E\uDDE1_.jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/Без названия (8).jpg")));
        photo6.setCaption(text);

        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/Без названия (2).webp")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Salle à manger.webp")));
        photo8.setCaption(text);


        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/Без названия (3).webp")));
        photo9.setCaption(text);

        SendPhoto photo10 = new SendPhoto();
        photo10.setChatId(chatId);
        photo10.setPhoto(new InputFile(new File("src/main/resources/Any's Amazon Page.jpg")));
        photo10.setCaption(text);


        SendPhoto photo11 = new SendPhoto();
        photo11.setChatId(chatId);
        photo11.setPhoto(new InputFile(new File("src/main/resources/How beautiful does the Oregon Table with 8 Florida Chairs look like styled in @amatullaaah_k home ❤\uFE0F.jpg")));
        photo11.setCaption(text);


        SendPhoto photo12 = new SendPhoto();
        photo12.setChatId(chatId);
        photo12.setPhoto(new InputFile(new File("src/main/resources/6 seater dining set_N1_1 million.jpg")));
        photo12.setCaption(text);


        try {
            execute(photo3);
            execute(photo);
            execute(photo2);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);
            execute(photo10);
            execute(photo11);
            execute(photo12);


        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }

    private void sendDivanlar(long chatId, String text) {

        KeyboardButton button1 = new KeyboardButton("1 kishilik divan");
        KeyboardButton button2 = new KeyboardButton("2 kishilik divan");
        KeyboardButton button3 = new KeyboardButton("Ortga");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);

        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(row1);
        qatorlar.add(row2);


        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        markup.setSelective(false);
        markup.setIsPersistent(true);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("BU yerda Ozingizga kerakli qatorni tanlashingiz mumkun");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }

    private void send1kishilik(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/photo_2025-12-20_16-23-51.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/photo_2026-05-30_13-10-40.jpg")));
        photo1.setCaption(text);


        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/photo_2025-12-20_16-24-20.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/photo_2025-08-28_14-32-38.jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/photo_2025-07-25_19-03-10.jpg")));
        photo4.setCaption(text);

        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/photo_2025-02-05_22-20-04.jpg")));
        photo5.setCaption(text);

        try {
            execute(photo3);
            execute(photo);
            execute(photo2);
            execute(photo4);
            execute(photo5);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void send2kishilik(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/photo_2026-05-29_15-36-11.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/photo_2026-03-16_22-46-06.jpg")));
        photo1.setCaption(text);

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/photo_2025-03-05_22-20-48.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/photo_2025-01-13_21-08-29.jpg")));
        photo3.setCaption(text);


        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/photo_2024-12-15_14-26-18.jpg")));
        photo4.setCaption(text);
        try {
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo3);
            execute(photo4);


        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }

    private void sendEshik(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/photo_2026-01-06_20-34-02.jpg")));
        photo.setCaption("\uD83D\uDD39 Model Nora \n" +
                "©Firma nomi:   Joziba Mebel\n" +
                "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                "\uD83E\uDD1D Savdolashamiz\n" +
                "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                "\uD83D\uDCDE Telefon: +998882220014\n" +
                "\uD83D\uDCDE Telefon: +998915780014\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                "\n" +
                "\n" +
                "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");

        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/photo_2025-07-02_10-24-18.jpg")));
        photo1.setCaption("\uD83D\uDD39 Model Zoe\n" +
                "©Firma nomi:   Joziba Mebel\n" +
                "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                "\uD83E\uDD1D Savdolashamiz\n" +
                "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                "\uD83D\uDCDE Telefon: +998882220014\n" +
                "\uD83D\uDCDE Telefon: +998915780014\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                "\n" +
                "\n" +
                "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-02_20-08-02.jpg")));
        photo2.setCaption("\uD83D\uDD39 Model Abror Rich\n" +
                "©Firma nomi:   Joziba Mebel\n" +
                "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                "\uD83E\uDD1D Savdolashamiz\n" +
                "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                "\uD83D\uDCDE Telefon: +998882220014\n" +
                "\uD83D\uDCDE Telefon: +998915780014\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                "\n" +
                "\n" +
                "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-02_20-09-48.jpg")));
        photo3.setCaption("\uD83D\uDD39 Model Mir\n" +
                "©Firma nomi:   Joziba Mebel\n" +
                "\uD83D\uDE9B Dostavka: O'rnatish bepul\n" +
                "\uD83E\uDD1D Savdolashamiz\n" +
                "\uD83D\uDCF1 Murojaat uchun: \uD83D\uDC47\n" +
                "\uD83D\uDCDE Telefon: +998882220014\n" +
                "\uD83D\uDCDE Telefon: +998915780014\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram:@Joziba_meb\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Telegram: @bakhodirivccc\n" +
                "\n" +
                "\n" +
                "\uD83D\uDC8E Joziba Mebel – nafislik va sifat uyg‘unligi!");
        try {
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo3);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendKuxniMatrial(long chatId, String text) {

        KeyboardButton button1 = new KeyboardButton("Akril");
        KeyboardButton button2 = new KeyboardButton("Dsp");
        KeyboardButton button3 = new KeyboardButton("Mdf");
        KeyboardButton button4 = new KeyboardButton("Ortga");
        KeyboardButton button5 = new KeyboardButton("Rasm va Narxlari");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        row2.add(button5);
        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(row1);
        qatorlar.add(row2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        markup.setSelective(false);
        markup.setIsPersistent(true);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("BU yerda Ozingizga kerakli qatorni tanlashingiz mumkun");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private final Map<Long, Boolean> akrilTanlanganlar = new HashMap<>();


    private void sendAkrill(long chatId, String text) {
        try {
            String cleanText = text.replace(",", ".");
            double metr = Double.parseDouble(cleanText);

            // Agar son bo'lsa va foydalanuvchi oldin "Akril" tugmasini bosgan bo'lsa
            if (metr > 0 && akrilTanlanganlar.getOrDefault(chatId, false)) {
                long birMetrNarxi = 1700000; // 1 mln 600 ming so'm
                double jamiNarx = metr * birMetrNarxi;

                // Raqamlarni chiroyli formatlash (masalan: 4 800 000)
                DecimalFormat df = new DecimalFormat("#,###");
                String formatlanganNarx = df.format(jamiNarx).replace(",", " ");

                String javobMatni = "✨ *Joziba Mebel — Sifat va Nafislik Uyg'unligi!* ✨\n\n" +
                        "📐 *Akril oshxona mebeli hisob-kitobi:*\n" +
                        "▪️ *Buyurtma o'lchami:* " + metr + " metr\n" +
                        "▪️ *1 metr narxi:* 1 700 000 so'm\n\n" +
                        "💰 *JAMI HISOBLANGAN NARX:* `" + formatlanganNarx + "` so'm\n\n" +
                        "--- \n" +
                        "🚚 *Dastavka (Yetkazib berish):* MUTLAQO BEPUL! ✅\n" +
                        "🛠 *O'rnatib berish xizmati:* MUTLAQO BEPUL! ✅\n\n" +
                        "✨ Professional ustalarimiz tomonidan chotki va tekis qilib o'rnatib beriladi.";

                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText(javobMatni);
                message.setParseMode("Markdown");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                akrilTanlanganlar.remove(chatId); // Hisoblab bo'lingach xotirani tozalaymiz
                return; // Kod shu yerda to'xtaydi, pastdagi rasm qismiga o'tmaydi
            }
        } catch (NumberFormatException e) {
            // Agar son bo'lmasa, xatolik bermaydi va pastdagi tugma tekshirishga o'tadi
        }

        // B) Agar "Akril" tugmasi bosilgan bo'lsa
        if (text.equals("Akril")) {
            akrilTanlanganlar.put(chatId, true); // Ushbu foydalanuvchi Akrilni tanladi deb belgilaymiz

            SendPhoto photo = new SendPhoto();
            photo.setChatId(chatId);
            photo.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-02_20-29-16.jpg")));
            photo.setCaption("🌟 *Akrilning afzalliklari (Plyuslari)*\n" +
                    "Mukammal glyans (Yaltiroqlik): Akril o‘zining oynasimon, juda tekis va yaltiroq yuzasi bilan ajralib turadi. U yorug‘likni juda yaxshi qaytaradi va hatto kichik oshxonalarni ham vizual ravishda kengroq ko‘rsatadi.\n\n" +
                    "Ekologik toza va xavfsiz: Akril tarkibida inson salomatligi uchun zararli bo‘lgan toksik moddalar yoki smolalar bo‘lmaydi. Oshxonada ovqat tayyorlanganda mutlaqo xavfsiz.\n\n" +
                    "Ranglarning yorqinligi: Vaqt o‘tishi bilan, hatto quyosh nuri (ultrabinafsha nurlar) to‘g‘ridan-to‘g‘ri tushganda ham ranglar o‘z jozibasini yo‘qotmaydi, o‘chib ketmaydi.\n\n" +
                    "Namlik va issiqlikka chidamlilik: Oshxonadagi bug‘, suv sachrashi va yuqori haroratga yaxshi bardosh beradi. Fasadlar shishib ketmaydi yoki deformatsiyaga uchramaydi.\n\n" +
                    "Chizilishlarga chidamlilik va tiklanish: Oddiy kraska yoki plyonkalarga qaraganda akril tirnalishlarga ancha chidamli. Agar mayda chiziqlar tushsa ham, maxsus pastalar yordamida polirovka (silliqlash) qilib, yana eski holatiga keltirish mumkin.");

            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText("📐 *Joziba Mebel*\n\nIltimos, oshxonangizni razmerini bera olasizmi? (Faqat metrini son bilan kiriting, masalan: 4 yoki 3.5)");
            msg.setParseMode("Markdown");

            try {
                execute(photo);
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    private final Map<Long, Boolean> dspTanlanganlar = new HashMap<>();
    private void sendDsp(long chatId, String text) {
        try {
            String cleanText = text.replace(",", ".");
            double metr = Double.parseDouble(cleanText);

            // Agar son bo'lsa va foydalanuvchi oldin "DSP" tugmasini bosgan bo'lsa
            if (metr > 0 && dspTanlanganlar.getOrDefault(chatId, false)) {
                long birMetrNarxi = 1200000; // DSP metri 1 mln 100 ming so'm
                double jamiNarx = metr * birMetrNarxi;

                // Raqamlarni chiroyli formatlash (masalan: 3 300 000)
                DecimalFormat df = new DecimalFormat("#,###");
                String formatlanganNarx = df.format(jamiNarx).replace(",", " ");

                String javobMatni = "✨ *Joziba Mebel — Sifat va Nafislik Uyg'unligi!* ✨\n\n" +
                        "📐 *DSP oshxona mebeli hisob-kitobi:*\n" +
                        "▪️ *Buyurtma o'lchami:* " + metr + " metr\n" +
                        "▪️ *1 metr narxi:* 1 200 000 so'm\n\n" +
                        "💰 *JAMI HISOBLANGAN NARX:* `" + formatlanganNarx + "` so'm\n\n" +
                        "--- \n" +
                        "🚚 *Dastavka (Yetkazib berish):* MUTLAQO BEPUL! ✅\n" +
                        "🛠 *O'rnatib berish xizmati:* MUTLAQO BEPUL! ✅\n\n" +
                        "✨ Professional ustalarimiz tomonidan chotki va tekis qilib o'rnatib beriladi.";

                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText(javobMatni);
                message.setParseMode("Markdown");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                dspTanlanganlar.remove(chatId); // Hisoblab bo'lingach xotirani tozalaymiz
                return; // Son bo'lsa hisobladi va pastdagi rasm qismiga o'tmaydi
            }
        } catch (NumberFormatException e) {
            // Agar son bo'lmasa, xatolik bermaydi va pastdagi tugma shartiga o'tadi
        }

        // B) Agar foydalanuvchi "Dsp" (yoki menyudagi tugmani) bosgan bo'lsa
        if (text.equalsIgnoreCase("Dsp") || text.equals("Dsp narxi")) {
            dspTanlanganlar.put(chatId, true); // Ushbu foydalanuvchi DSPni tanladi deb belgilaymiz

            SendPhoto photo = new SendPhoto();
            photo.setChatId(chatId);
            // O'zingizda bor bo'lgan rasmlardan birining yo'lini yozing
            photo.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-02_20-46-14.jpg")));
            photo.setCaption("🌟 *DSP mebellarning afzalliklari (Plyuslari)*\n" +
                    "Hamyonbop narx: DSP eng arzon va ommabop materiallardan biri bo'lib, byudjetni sezilarli darajada tejaydi.\n\n" +
                    "Yengil va amaliy: Oshxona javonlari va ichki qismlari uchun juda qulay va og'irligi yengil material.\n\n" +
                    "Turli xil ranglar: Laminatsiyalangan yuzasi tufayli juda ko'p xildagi yog'och teksturali dizaynlarni tanlash imkoniyati mavjud.");

            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText("📐 *Joziba Mebel*\n\nIltimos, DSP oshxonangizni razmerini bera olasizmi? (Faqat metrini son bilan kiriting, masalan: 3 yoki 4)");
            msg.setParseMode("Markdown");

            try {
                execute(photo);
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    private final Map<Long, Boolean> mdfTanlanganlar = new HashMap<>();
    private void sendMdf(long chatId, String text) {
        try {
            String cleanText = text.replace(",", ".");
            double metr = Double.parseDouble(cleanText);

            // Agar son bo'lsa va foydalanuvchi oldin "MDF" tugmasini bosgan bo'lsa
            if (metr > 0 && mdfTanlanganlar.getOrDefault(chatId, false)) {
                long birMetrNarxi = 1900000; // MDF metri 1 mln 800 ming so'm
                double jamiNarx = metr * birMetrNarxi;

                // Raqamlarni chiroyli formatlash (masalan: 5 400 000)
                DecimalFormat df = new DecimalFormat("#,###");
                String formatlanganNarx = df.format(jamiNarx).replace(",", " ");

                String javobMatni = "✨ *Joziba Mebel — Sifat va Nafislik Uyg'unligi!* ✨\n\n" +
                        "📐 *MDF oshxona mebeli hisob-kitobi:*\n" +
                        "▪️ *Buyurtma o'lchami:* " + metr + " metr\n" +
                        "▪️ *1 metr narxi:* 1 900 000 so'm\n\n" +
                        "💰 *JAMI HISOBLANGAN NARX:* `" + formatlanganNarx + "` so'm\n\n" +
                        "--- \n" +
                        "🚚 *Dastavka (Yetkazib berish):* MUTLAQO BEPUL! ✅\n" +
                        "🛠 *O'rnatib berish xizmati:* MUTLAQO BEPUL! ✅\n\n" +
                        "✨ Professional ustalarimiz tomonidan chotki va tekis qilib o'rnatib beriladi.";

                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText(javobMatni);
                message.setParseMode("Markdown");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                mdfTanlanganlar.remove(chatId); // Hisoblab bo'lingach xotirani tozalaymiz
                return; // Son bo'lsa hisobladi va pastdagi rasm yuborish qismiga o'tmaydi
            }
        } catch (NumberFormatException e) {
            // Agar son bo'lmasa, xatolik bermaydi va pastdagi tugma shartiga o'tadi
        }

        // B) Agar foydalanuvchi "MDF" (yoki menyudagi tugmani) bosgan bo'lsa
        if (text.equals("Mdf") || text.equals("MDF narxi")) {
            mdfTanlanganlar.put(chatId, true); // Ushbu foydalanuvchi MDFni tanladi deb belgilaymiz

            SendPhoto photo = new SendPhoto();
            photo.setChatId(chatId);
            // O'zingizda bor bo'lgan rasmlardan birining yo'lini yozing
            photo.setPhoto(new InputFile(new File("src/main/resources/Без названия (8).webp")));
            photo.setCaption("🌟 *MDF mebellarning afzalliklari (Plyuslari)*\n" +
                    "Chidamlilik va mustahkamlik: MDF zich material bo'lib, harorat o'zgarishlariga va oshxonadagi namlikka juda chidamli.\n\n" +
                    "Ekologik xavfsizlik: Tabiiy yog'och qirindilaridan tayyorlangani sababli uydagilar salomatligi uchun mutlaqo zararsizdir.\n\n" +
                    "Istalgan dizayn: MDF yuzasiga har xil naqshlar berish (frezovka) va uni zamonaviy klassika yoki neoklassika uslubida yasash juda qulay.");

            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText("📐 *Joziba Mebel*\n\nIltimos, MDF oshxonangizni razmerini bera olasizmi? (Faqat metrini son bilan kiriting, masalan: 3 yoki 4.5)");
            msg.setParseMode("Markdown");

            try {
                execute(photo);
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendKuxniNarxlari(long chatId, String text) {

        KeyboardButton button1 = new KeyboardButton("Akril Narxi");
        KeyboardButton button2 = new KeyboardButton("Dsp Narxi");
        KeyboardButton button3 = new KeyboardButton("Mdf Narxi");
        KeyboardButton button4 = new KeyboardButton("Ortga");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(row1);
        qatorlar.add(row2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        markup.setSelective(false);
        markup.setIsPersistent(true);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("BU yerda Ozingizga kerakli qatorni tanlashingiz mumkun");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendAkrilNarxi(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/img_3059.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/img_3054.jpg")));
        photo1.setCaption(text);

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/img_3060.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Без названия (9).jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Luxurious Custom Kitchen Design Ideas.jpg")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/Modular Kitchen Design Trends Taking Over Indian Homes in 2026.jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/Без названия (4).webp")));
        photo6.setCaption(text);

        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/L shape kitchen design.jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Sky Blue kitchen design.webp")));
        photo8.setCaption(text);

        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/all kitchen products_.jpg")));
        photo9.setCaption(text);

        try {
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo3);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    private void sendDspnarxi(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/Tinyhomie 12- in W x 34_5- in H x 24- in D White Shaker Plywood RTA Base Kitchen Cabinet with Soft- Close Hinges Solid Wood Dovetail Drawer.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/Beautiful kitchen.jpg")));
        photo1.setCaption(text);

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Beautiful Small Kitchen.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Soft Modern Kitchen Design.jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Белая кухня (современная классика, неоклассика).webp")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/Без названия (7).webp")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/Кухня в оливковом цвете _ Москва, Ростов.jpg")));
        photo6.setCaption(text);

        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/Светлая кухня до потолка.jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Без названия (10).jpg")));
        photo8.setCaption(text);


        try {
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo3);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void senMdfnarxi(long chatId, String text) {
        // 2. Agar foydalanuvchi son emas, oddiy matn yozgan bo'lsa (yoki menyudan bosgan bo'lsa), rasmlar ketadi:
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/Без названия (8).webp")));
        photo.setCaption(text);

        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/Warm & Inviting Shaker-Style Kitchen Cabinets.webp")));
        photo1.setCaption(text);

        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Без названия (11).jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Без названия (10).webp")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Белая кухня (современная классика, неоклассика).webp")));
        photo4.setCaption(text);

        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/Без названия (7).webp")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/Кухня в оливковом цвете _ Москва, Ростов.jpg")));
        photo6.setCaption(text);

        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/Без названия (12).jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Без названия (11).webp")));
        photo8.setCaption(text);

        try {
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo3);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void sendBizxaqizda(long chatId, String text) {

        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/photo_2026-07-03_11-52-49.jpg")));
        photo1.setCaption(text);

        SendVideo video1 = new SendVideo();
        video1.setChatId(chatId);
        video1.setVideo(new InputFile(new File("src/main/resources/video_2026-07-03_20-58-29.mp4"))); // Video fayl yo'li
        video1.setCaption(text);

        try {
            execute(photo1);
            execute(video1);


        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void sendShkafandperexoshka(long chatId, String text) {

        KeyboardButton button1 = new KeyboardButton("Shkaf");
        KeyboardButton button2 = new KeyboardButton("Perexoshka");
        KeyboardButton button3 = new KeyboardButton("Ortga");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);

        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(row1);
        qatorlar.add(row2);


        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        markup.setSelective(false);
        markup.setIsPersistent(true);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("BU yerda Ozingizga kerakli qatorni tanlashingiz mumkun");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void sendPerehoshka(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/Без названия (14).webp")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/Без названия (15).jpg")));
        photo1.setCaption(text); // Agar caption kerak bo'lsa


        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Входная зона современная классика.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Без названия (15).webp")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/Без названия (16).webp")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/Без названия (17).jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/Маленькая прихожая.webp")));
        photo6.setCaption(text);


        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/Без названия (18).jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Без названия (19).jpg")));
        photo8.setCaption(text);


        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/Прихожая.jpg")));
        photo9.setCaption(text);


        SendPhoto photo10 = new SendPhoto();
        photo10.setChatId(chatId);
        photo10.setPhoto(new InputFile(new File("src/main/resources/Прихожая в классическом стиле.jpg")));
        photo10.setCaption(text);


        try {
            execute(photo3);
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);
            execute(photo10);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    } private void sendYumoshoqmebel(long chatId, String text) {

        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("src/main/resources/Olive Sofa - Wood Legs (70_5_.jpg")));
        photo.setCaption(text);


        SendPhoto photo1 = new SendPhoto();
        photo1.setChatId(chatId);
        photo1.setPhoto(new InputFile(new File("src/main/resources/Ansonia Channel-tufted Sofa by Christopher Knight Home.jpg")));
        photo1.setCaption(text); // Agar caption kerak bo'lsa


        SendPhoto photo2 = new SendPhoto();
        photo2.setChatId(chatId);
        photo2.setPhoto(new InputFile(new File("src/main/resources/Sofas & Couches _ Living Room Furniture & Living Room Furniture Sets.jpg")));
        photo2.setCaption(text);

        SendPhoto photo3 = new SendPhoto();
        photo3.setChatId(chatId);
        photo3.setPhoto(new InputFile(new File("src/main/resources/Modern grey armchair sofa set hotel apartment living room home office leather sofa.jpg")));
        photo3.setCaption(text);

        SendPhoto photo4 = new SendPhoto();
        photo4.setChatId(chatId);
        photo4.setPhoto(new InputFile(new File("src/main/resources/3 seater sofa settee.jpg")));
        photo4.setCaption(text);


        SendPhoto photo5 = new SendPhoto();
        photo5.setChatId(chatId);
        photo5.setPhoto(new InputFile(new File("src/main/resources/FURNY Homeliving 6 Seater Fabric L Shape Sofa Set, 5 Seater Sofa & Ottoman, 6 Seating Premium Sofa Set for Living Room (Light Grey Color).jpg")));
        photo5.setCaption(text);

        SendPhoto photo6 = new SendPhoto();
        photo6.setChatId(chatId);
        photo6.setPhoto(new InputFile(new File("src/main/resources/4 Seater L Shape Sofa Set.jpg")));
        photo6.setCaption(text);


        SendPhoto photo7 = new SendPhoto();
        photo7.setChatId(chatId);
        photo7.setPhoto(new InputFile(new File("src/main/resources/95_5_ White L-Shaped Sofa Set with Nailhead Trim, Plush Flannel Fabric & Sturdy Wood Frame, Modern Living Room Furniture.jpg")));
        photo7.setCaption(text);

        SendPhoto photo8 = new SendPhoto();
        photo8.setChatId(chatId);
        photo8.setPhoto(new InputFile(new File("src/main/resources/Без названия (20).jpg")));
        photo8.setCaption(text);


        SendPhoto photo9 = new SendPhoto();
        photo9.setChatId(chatId);
        photo9.setPhoto(new InputFile(new File("src/main/resources/12 Sectionals That Will Complete Your Living Space.jpg")));
        photo9.setCaption(text);


        SendPhoto photo10 = new SendPhoto();
        photo10.setChatId(chatId);
        photo10.setPhoto(new InputFile(new File("src/main/resources/Pinterest_ @aalaaaatya ♡.jpg")));
        photo10.setCaption(text);


        try {
            execute(photo3);
            execute(photo);
            execute(photo1);
            execute(photo2);
            execute(photo4);
            execute(photo5);
            execute(photo6);
            execute(photo7);
            execute(photo8);
            execute(photo9);
            execute(photo10);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    }



