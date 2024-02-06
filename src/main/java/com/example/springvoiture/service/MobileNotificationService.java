package com.example.springvoiture.service;

import com.example.springvoiture.model.MobileNotification;
import com.example.springvoiture.repository.MobileNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileNotificationService {

    private final MobileNotificationRepository repository;

    @Autowired
    public MobileNotificationService(MobileNotificationRepository repository) {
        this.repository = repository;
    }

    public List<MobileNotification> findAll() {
        return repository.findAll();
    }

    public List<MobileNotification> findsById(Integer id){
        return  repository.findByReceiverId(id);
    }

    public MobileNotification findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public MobileNotification save(MobileNotification notification) {
        return repository.save(notification);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

