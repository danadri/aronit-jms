package ro.danc.aronitjms.sender;


import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ro.danc.aronitjms.config.JmsConfig;
import ro.danc.aronitjms.model.HWM;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class HelloSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage(){
        System.out.println("I'am sending a message");
        HWM message = HWM.builder()
                .id(UUID.randomUUID())
                .message("HHHHWWW")
                .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,message);
        System.out.println("Message sent");
    }

}
