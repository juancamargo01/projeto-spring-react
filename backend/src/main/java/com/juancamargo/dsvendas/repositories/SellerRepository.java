package com.juancamargo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juancamargo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
