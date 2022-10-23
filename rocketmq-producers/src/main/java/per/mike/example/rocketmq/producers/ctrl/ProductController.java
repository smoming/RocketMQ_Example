package per.mike.example.rocketmq.producers.ctrl;

import java.math.BigDecimal;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.apachecommons.CommonsLog;
import per.mike.example.rocketmq.producers.bean.ProductData;

@RestController
@RequestMapping("/product")
@CommonsLog
public class ProductController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    private final static String PRODUCT_TOPIC = "PRODUCT";

    @GetMapping("/doSend")
    public String doSentMessage(String id, String name, BigDecimal amt) {
        ProductData pd = ProductData.builder().id(id).name(name).amt(amt).build();
        SendResult sendResult = rocketMQTemplate.syncSend(PRODUCT_TOPIC, pd);
        String sendResultString = "###product producers###:[" + sendResult + "]:###";
        log.info(sendResultString);
        return sendResultString;
    }
}
