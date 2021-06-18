package com.example.rest.api.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.jpa.entity.UserMaster;

public interface UserMasterDao extends JpaRepository<UserMaster, Long> {
}
