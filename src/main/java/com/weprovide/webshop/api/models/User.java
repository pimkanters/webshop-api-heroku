package com.weprovide.webshop.api.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = {"username"})) 
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;

    private String password;

    private String email;

    @ManyToMany
    @JoinTable(
        name = "wishlists",
        joinColumns = @JoinColumn(name = "user"),
        inverseJoinColumns = @JoinColumn(name = "sock_id")
    )
    private Set<Sock> wishlistedSocks;

    public User(){}

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the wishlistedSocks
     */
    public Set<Sock> getWishlistedSocks() {
        return wishlistedSocks;
    }

    /**
     * @param wishlistedSocks the wishlistedSocks to set
     */
    public void setWishlistedSocks(Set<Sock> wishlistedSocks) {
        this.wishlistedSocks = wishlistedSocks;
    }

}