package com.devgabriel.dsmeta.repositories;

import com.devgabriel.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
