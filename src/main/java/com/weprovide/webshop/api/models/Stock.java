package com.weprovide.webshop.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Stock {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name="KIDS")
    private int xs;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Sock sock;

    public Stock(){
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the xs
     */
    public int getXs() {
        return xs;
    }

    /**
     * @param xs the xs to set
     */
    public void setXs(int xs) {
        this.xs = xs;
    }

    /**
     * @return the sock
     */
    public Sock getSock() {
        return sock;
    }

    /**
     * @param sock the sock to set
     */
    public void setSock(Sock sock) {
        this.sock = sock;
    }
}