package com.chatgo.business.service.impl;

import com.chatgo.business.entity.RoomUser;
import com.chatgo.business.repository.RoomUserRepository;
import com.chatgo.business.service.RoomService;
import com.chatgo.business.service.RoomUserService;
import com.chatgo.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoomUserServiceImpl implements RoomUserService{

    @Autowired
    private RoomService roomService;

    @Autowired
    private UserService userService;

    @Autowired
    private RoomUserRepository roomUserRepository;

    @Override
    public void save(RoomUser roomUser ,int roomId, int userId) {
        roomUser.setRoom(roomService.findOne(roomId));
        roomUser.setUser(userService.findOne(userId));
        roomUserRepository.save(roomUser);
    }
	//チャット機能のみの場合に使用
	@Override
    public RoomUser findByUserId(int userId) {
        return roomUserRepository.findByUserId(userId);
    }
	//ルーム機能を追加した場合に使用
    @Override
    public List<RoomUser> findAllByUserId(int userId) {
        return roomUserRepository.findAllByUserId(userId);
    }
}
