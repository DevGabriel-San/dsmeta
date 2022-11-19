package com.devgabriel.dsmeta.controllers;

import com.devgabriel.dsmeta.entities.Sale;
import com.devgabriel.dsmeta.service.SaleService;
import com.devgabriel.dsmeta.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
   public SaleService service;

    @Autowired
    public SmsService smsService;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "")String minDate,
            @RequestParam(value="maxDate", defaultValue = "")String maxDate,
            Pageable pageable){
        return service.findSales(minDate,maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notSms(@PathVariable Long id){
        smsService.sendSms(id);
        System.out.println("Sms enviado...");    }

}
