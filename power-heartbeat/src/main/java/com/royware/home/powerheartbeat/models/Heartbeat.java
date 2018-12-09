package com.royware.home.powerheartbeat.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@JsonIgnoreProperties( {"hibernateLazyInitializer", "handler"} )
public class Heartbeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean powerAvailable;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy HH:mm a z")
    private Date hbDate;

    public boolean isPowerAvailable() {
        return powerAvailable;
    }

    public void setPowerAvailable(boolean powerAvailable) {
        this.powerAvailable = powerAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHbDate() {
        return hbDate;
    }

    public void setHbDate(Date hbDate) {
        this.hbDate = hbDate;
    }
}
