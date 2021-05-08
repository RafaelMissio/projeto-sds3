package com.devsuperios.dsvendas.service;

import com.devsuperios.dsvendas.DTO.SellerDTO;
import com.devsuperios.dsvendas.entities.Seller;
import com.devsuperios.dsvendas.repositories.SallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SallerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
