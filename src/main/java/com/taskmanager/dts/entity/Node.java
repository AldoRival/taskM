package com.taskmanager.dts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nodeId;
    private String status; // activo, inactivo
    private Long lastHeartbeat;

    // Getters y Setters
    public Long getLastHeartbeat() {
        return lastHeartbeat;
    }

    public void setLastHeartbeat(Long lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
