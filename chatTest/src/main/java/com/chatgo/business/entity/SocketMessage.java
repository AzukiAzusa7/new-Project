package com.chatgo.business.entity;

import java.sql.Timestamp;

public class SocketMessage {

    private String body;

    private String username;

    private String createdAt;

    private int userId;

    public SocketMessage() {
    }

    public SocketMessage(String body, String username, String createdAt, int userId) {
        this.body = body;
        this.username = username;
        this.createdAt = createdAt;
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public String getUsername() {
        return username;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getUserId() {
        return userId;
    }
}
