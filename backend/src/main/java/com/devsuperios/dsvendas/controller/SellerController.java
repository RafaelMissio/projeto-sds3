package com.devsuperios.dsvendas.controller;


import com.devsuperios.dsvendas.DTO.SellerDTO;
import com.devsuperios.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> sellerDTOList = service.findAll();
        return  ResponseEntity.ok(sellerDTOList);
    }
}