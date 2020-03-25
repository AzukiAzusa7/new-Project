package com.chatgo.business.service;

import com.chatgo.business.entity.RoomUser;

import java.awt.print.Pageable;
import java.util.List;

public interface RoomUserService {

    void save(RoomUser roomUser, int roomId, int userId);

    List<RoomUser> findAllByUserId(int userId);

}
