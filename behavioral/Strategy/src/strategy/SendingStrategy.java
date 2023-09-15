package strategy;

import strategy.model.Message;
import strategy.service.SendingService;

public class SendingStrategy {

    public static void send(SendingService service, Message message) {
        service.sendMessage(message);
    }

}
