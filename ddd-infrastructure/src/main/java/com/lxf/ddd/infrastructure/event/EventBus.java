package com.lxf.ddd.infrastructure.event;

public interface EventBus {
    void publishAsync(DomainEvent event);
    void publish(DomainEvent event);
}
