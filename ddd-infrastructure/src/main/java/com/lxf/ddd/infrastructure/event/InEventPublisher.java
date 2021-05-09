package com.lxf.ddd.infrastructure.event;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.AsyncEventBus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class InEventPublisher implements EventBus {
    @Resource
    private AsyncEventBus asyncEventBus;
    @Resource
    private com.google.common.eventbus.EventBus eventBus;

    @Override
    public void publishAsync(DomainEvent event) {
        log.info("InEventPublisher:{}", JSON.toJSONString(event));
        asyncEventBus.post(event);
    }

    @Override
    public void publish(DomainEvent event) {
        log.info("InEventPublisher:" + JSON.toJSONString(event));
        eventBus.post(event);
    }
}
