package com.weprovide.webshop.api.services;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.weprovide.webshop.api.models.Sock;
import com.weprovide.webshop.api.models.Stock;
import com.weprovide.webshop.api.repositories.SockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SockService {
    Gson gson = new Gson();

    @Autowired
    private SockRepository sockRepository;


    public List<Sock> getAllSocks(){
        
        List<Sock> allSocks = new ArrayList<>();

        Iterable<Sock> receivedSocks = this.sockRepository.findAll();
        receivedSocks.forEach(allSocks::add);

        return allSocks;
    }


    // public List<Sock> getSocksGroupByCode(){
        
    //     return sockRepository.findSocksGroupByCode();
    // }

	// public List<Sock> getSocksByCode(String code) {

    //     List<Sock> correctSocks = new ArrayList<>();

    //     List<Sock> socks = new ArrayList<>();

    //     Iterable<Sock> allSocks = this.sockRepository.findAll();
        
    //     allSocks.forEach(socks::add);

    //     for (Sock s : socks) {
    //         if(s.getCode().equals(code)){
    //             correctSocks.add(s);
    //         }
    //     }

    //     return correctSocks;
    // }
    

	public Sock getSock(Long id) {
	    return this.sockRepository.findById(id).get();
	}


	public Stock getStock(Long sockId) {
        //NEW


        
        //NEW

        Sock sock = this.sockRepository.findById(sockId).get();
        
        if(sock.getStock() == null){
            Stock testStock = new Stock();
            
            testStock.setXs(3);
            testStock.setS(3);
            testStock.setM(3);
            testStock.setL(3);
            testStock.setXl(0);

            testStock.setSock(sock);        
            sock.setStock(testStock);
            this.sockRepository.save(sock);
        }
    
        return sock.getStock();
	}
}