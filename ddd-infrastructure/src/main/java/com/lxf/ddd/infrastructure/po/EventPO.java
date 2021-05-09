package com.lxf.ddd.infrastructure.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
public class EventPO {
    @Id
    @GeneratedValue(generator = "idGenerator")
    long id;
    String eventId;
    String eventType;
    String subEventType;
    Date timestamp;
    String source;
    String data;
}
