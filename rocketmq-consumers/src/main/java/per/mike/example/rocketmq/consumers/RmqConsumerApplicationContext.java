package per.mike.example.rocketmq.consumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RmqConsumerApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(RmqConsumerApplicationContext.class, args);

        System.out.println("##########################################");
        System.out.println("##                                      ##");
        System.out.println("##  ROCKETMQ CONSUMER SPRING BOOT START ##");
        System.out.println("##                                      ##");
        System.out.println("##########################################");
    }

}