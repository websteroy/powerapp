package com.royware.home.powerheartbeat.controllers;

import com.royware.home.powerheartbeat.models.Heartbeat;
import com.royware.home.powerheartbeat.repositories.HeartbeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/heartbeats")
public class HeartbeatController {

    @Autowired
    private HeartbeatRepository heartbeatRepository;

    @GetMapping
    public List<Heartbeat> list() {
        List<Heartbeat> heartbeats = heartbeatRepository.findAll();
        return heartbeats;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Heartbeat heartbeat) {
        heartbeatRepository.save(heartbeat);
    }

    @GetMapping("/{id}")
    public Heartbeat get(@PathVariable("id") long id) {
        return heartbeatRepository.getOne(id);
    }
}
