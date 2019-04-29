package com.weprovide.webshop.api.controllers;

import java.util.List;
import com.weprovide.webshop.api.models.Sock;
import com.weprovide.webshop.api.models.Stock;
import com.weprovide.webshop.api.services.SockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/sock")
public class SockController {

    @Autowired
    private SockService service;

    @GetMapping
    public ResponseEntity<List<Sock>> getAllSocks() {
        List<Sock> allSocks = service.getAllSocks();
        return ResponseEntity.status(200).body(allSocks);
    }

    // @GetMapping
    // public ResponseEntity<List<Sock>> getSocksGroupByCode() {
    //     List<Sock> allSocks = service.getSocksGroupByCode();
    //     return ResponseEntity.status(200).body(allSocks);
    // }

    // @GetMapping(value="/{code}")
    // public ResponseEntity<List<Sock>> getSocksByCode(@PathVariable("code") String code) {
    //     List<Sock> socks = service.getSocksByCode(code);
    //     return ResponseEntity.status(200).body(socks);
    // }

    @GetMapping(value="/{id}")
    public ResponseEntity<Sock> getSock(@PathVariable("id") Long id) {
        Sock sock = service.getSock(id);
        return ResponseEntity.status(200).body(sock);
    }


    @GetMapping(value="/stock/{id}")
    public ResponseEntity<Stock> getStock(@PathVariable("id") Long sockId) {
        Stock stock = service.getStock(sockId);
        return ResponseEntity.status(200).body(stock);
    }
}