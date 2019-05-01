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

    @Column(name="S")
    private int s;

    @Column(name="M")
    private int m;

    @Column(name="L")
    private int l;
    
    @Column(name="XL")
    private int xl;

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
     * @return the s
     */
    public int getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(int s) {
        this.s = s;
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }

    /**
     * @return the l
     */
    public int getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(int l) {
        this.l = l;
    }

    /**
     * @return the xl
     */
    public int getXl() {
        return xl;
    }

    /**
     * @param xl the xl to set
     */
    public void setXl(int xl) {
        this.xl = xl;
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