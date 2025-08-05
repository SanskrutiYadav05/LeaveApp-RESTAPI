package com.example.leavapp.repository;

import com.example.leavapp.model.LeaveApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {
}
