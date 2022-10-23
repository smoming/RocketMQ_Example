package per.mike.example.rocketmq.consumers.service.Impl;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import lombok.extern.apachecommons.CommonsLog;
import per.mike.example.rocketmq.consumers.bean.ProductData;

@Service
@CommonsLog
@RocketMQMessageListener(topic = "PRODUCT", consumerGroup = "PRODUCT_GROUP")
public class ProductServiceImpl implements RocketMQListener<ProductData> {

    @Override
    public void onMessage(ProductData message) {
        log.info("###product consumer###:[" + message + "]:###");
    }

}
