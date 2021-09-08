package com.juancamargo.dsvendas.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.juancamargo.dsvendas.entities.Sale;

public interface SaleRepository  extends JpaRepository <Sale, Long>{

}
