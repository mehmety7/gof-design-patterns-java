package strategy.service.impl;

import strategy.model.Message;
import strategy.service.SendingService;

public class SmsService implements SendingService {

    @Override
    public void sendMessage(Message message) {
        System.out.println("Message sent via Sms: " + message);
    }
}
