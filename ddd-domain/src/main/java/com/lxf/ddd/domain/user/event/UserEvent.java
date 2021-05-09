package com.lxf.ddd.domain.user.event;

import com.alibaba.fastjson.JSON;
import com.lxf.ddd.infrastructure.event.DomainEvent;
import com.lxf.ddd.infrastructure.utils.IdGenerator;
import com.lxf.ddd.domain.user.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserEvent extends DomainEvent {

    UserEventType leaveEventType;

    public static UserEvent create(UserEventType eventType, User user){
        UserEvent event = new UserEvent();
        event.setId(IdGenerator.nextId());
        event.setLeaveEventType(eventType);
        event.setTimestamp(new Date());
        event.setData(JSON.toJSONString(user));
        return event;
    }
}
