package strategy;

import strategy.model.Message;
import strategy.service.impl.MailService;
import strategy.service.impl.SmsService;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("Hello");
        SendingStrategy.send(new SmsService(), message);
        SendingStrategy.send(new MailService(), message);
    }

}