package com.backend.demo.dto;

import lombok.Data;

@Data
public class MessageDto {
    private StatusEnum status;
    private String message;
    private Object data;

    public MessageDto(){
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }
}