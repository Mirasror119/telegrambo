//package com.company;
//
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//public class TelegramBot extends TelegramLongPollingBot {
//
//    private final String botUsername;
//    private final String botToken;
//
//    public TelegramBot(String botUsername, String botToken) {
//        this.botUsername = botUsername;
//        this.botToken = botToken;
//    }
//
//    @Override
//    public String getBotUsername() {
//        return botUsername;
//    }
//
//    @Override
//    public String getBotToken() {
//        return botToken;
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            String messageText = update.getMessage().getText();
//            long chatId = update.getMessage().getChatId();
//
//            SendMessage message = new SendMessage();
//            message.setChatId(chatId);
//
//            switch (messageText) {
//                case "/start":
//                    message.setText("Salom! Men Telegram botman. Sizga qanday yordam bera olaman?");
//                    break;
//                default:
//                    message.setText("Siz yuborgan xabar: " + messageText);
//            }
//
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
