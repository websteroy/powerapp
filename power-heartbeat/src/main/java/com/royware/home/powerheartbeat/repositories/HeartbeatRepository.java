package com.royware.home.powerheartbeat.repositories;

import com.royware.home.powerheartbeat.models.Heartbeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartbeatRepository extends JpaRepository<Heartbeat, Long> {

}
