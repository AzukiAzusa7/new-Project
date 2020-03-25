package com.chatgo.business.dto;


import com.chatgo.business.entity.Room;
import com.chatgo.business.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class RoomDto {
    private String body;
    private int roomId;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "RoomDto{" +
                "body='" + body + '\'' +
                ", roomId=" + roomId +
                '}';
    }
}