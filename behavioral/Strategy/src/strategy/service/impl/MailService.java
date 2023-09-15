package strategy.service.impl;

import strategy.model.Message;
import strategy.service.SendingService;

public class MailService implements SendingService {

    @Override
    public void sendMessage(Message message) {
        System.out.println("Message sent via Mail: " + message);
    }
}
