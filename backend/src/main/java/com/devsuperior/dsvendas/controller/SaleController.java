package com.devsuperior.dsvendas.controller;


import com.devsuperior.dsvendas.DTO.SaleDTO;
import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> saleDTOList = service.findAll(pageable);
        return  ResponseEntity.ok(saleDTOList);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SalesSumDTO>> amountGroupedBySeller(){
        List<SalesSumDTO> saleDTOList = service.amountGroupedBySeller();
        return  ResponseEntity.ok(saleDTOList);
    }


    @GetMapping(value = "/sucsess-by-seller")
    public ResponseEntity<List<SalesSuccessDTO>> sucessGroupedBySeller(){
        List<SalesSuccessDTO> saleDTOList = service.sucessGroupedBySeller();
        return  ResponseEntity.ok(saleDTOList);
    }





}
