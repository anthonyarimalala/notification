package com.example.springvoiture.repository;

import com.example.springvoiture.model.MobileToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MobileTokenRepository extends JpaRepository<MobileToken, Integer> {
    List<MobileToken> findByUserId(Integer userId);
}
