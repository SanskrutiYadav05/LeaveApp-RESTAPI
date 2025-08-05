package com.example.leavapp.controller;

import com.example.leavapp.model.LeaveApplication;
import com.example.leavapp.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LeaveController {

    @Autowired
    private LeaveRepository repository;

    @PostMapping("/add")
    public LeaveApplication addLeave(@RequestBody LeaveApplication leave) {
        return repository.save(leave);
    }

    @GetMapping("/all")
    public List<LeaveApplication> getAllLeaves() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLeave(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
