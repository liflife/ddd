package com.lxf.ddd.infrastructure.event;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OutEventPublisher implements EventBus {
    @Override
    public void publishAsync(DomainEvent event) {
        publish(event);
    }

    @Override
    public void publish(DomainEvent event) {
        log.info("OutEventPublisher:" + JSON.toJSONString(event));
        //TODO 发送一下MQ
    }
}
