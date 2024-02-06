package com.example.springvoiture.repository;

import com.example.springvoiture.model.MobileNotification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileNotificationRepository extends JpaRepository<MobileNotification, Integer> {
    List<MobileNotification> findByReceiverId(Integer userId);
}
