package com.chatgo.business.repository;

import com.chatgo.business.entity.RoomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomUserRepository extends JpaRepository<RoomUser, Long> {
    List<RoomUser> findAllByUserId(int userId);
	//チャット機能のみの場合に以下を使用
	RoomUser findByUserId(int userId);
}
