package com.lxf.ddd.infrastructure.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {

    Status status;
    String msg;
    Object data;

    public static Result ok(){
        return Result.builder().status(Status.SUCCESS).build();
    }

    public static Result ok(Object data){
        return Result.builder().status(Status.SUCCESS).data(data).build();
    }

    public static Result fail(String msg){
        return Result.builder().status(Status.FAILED).msg(msg).build();
    }

    public enum Status{
        SUCCESS, FAILED
    }
}
