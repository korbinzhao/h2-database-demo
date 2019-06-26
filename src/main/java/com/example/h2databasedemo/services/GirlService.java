package com.example.h2databasedemo.services;

import com.example.h2databasedemo.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlService extends JpaRepository<Girl, Integer> {
}
