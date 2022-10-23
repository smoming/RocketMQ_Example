package per.mike.example.rocketmq.producers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RmqProducersApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(RmqProducersApplicationContext.class, args);

        System.out.println("##########################################");
        System.out.println("##                                      ##");
        System.out.println("## ROCKETMQ PRODUCERS SPRING BOOT START ##");
        System.out.println("##                                      ##");
        System.out.println("##########################################");
    }

}