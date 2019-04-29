package com.weprovide.webshop.api.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.weprovide.webshop.api.models.enums.Color;
import com.weprovide.webshop.api.models.Stock;

@Entity
/*@NamedQuery(name="Sock.findSocksGroupByCode",
    query= "SELECT m FROM Sock m GROUP BY code")*/
@Table(name = "socks")
public class Sock {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String image;

    @Enumerated(EnumType.STRING)
    private Color color;

    @OneToOne(mappedBy = "sock", cascade = CascadeType.ALL)
    private Stock stock;

    /*
     * @ManyToMany(mappedBy = "wishlistedSocks") private Set<Customer> likedBy;
     */

    @JsonIgnore
    @OneToMany(mappedBy = "sock")
    private Set<OrderedSock> orderedSocks;

    public Sock() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    /**
     * @return the orderedSocks
     */
    public Set<OrderedSock> getOrderedSocks() {
        return orderedSocks;
    }

    /**
     * @param orderedSocks the orderedSocks to set
     */
    public void setOrderedSocks(Set<OrderedSock> orderedSocks) {
        this.orderedSocks = orderedSocks;
    }
    
}