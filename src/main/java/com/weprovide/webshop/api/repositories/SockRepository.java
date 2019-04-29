package com.weprovide.webshop.api.repositories;

import com.weprovide.webshop.api.models.Sock;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SockRepository extends CrudRepository<Sock, Long> {
    // public List<Sock> findSocksGroupByCode();
}