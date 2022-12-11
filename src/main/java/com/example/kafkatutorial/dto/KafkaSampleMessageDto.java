package com.example.kafkatutorial.dto;

public class KafkaSampleMessageDto {
    private String id;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "KafkaSampleMessageDto{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
