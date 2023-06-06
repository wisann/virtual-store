package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.PersonPermission;

public interface PersonPermissionRepository extends JpaRepository <PersonPermission, Long> {
    
}
