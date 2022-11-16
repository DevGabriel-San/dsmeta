package com.devgabriel.dsmeta.controllers;

import com.devgabriel.dsmeta.entities.Sale;
import com.devgabriel.dsmeta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
   public SaleService service;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "")String minDate,
            @RequestParam(value="maxDate", defaultValue = "")String maxDate,
            Pageable pageable){
        return service.findSales(minDate,maxDate, pageable);
    }

}
