package com.devsuperios.dsvendas.service;

import com.devsuperios.dsvendas.DTO.SaleDTO;
import com.devsuperios.dsvendas.entities.Sale;
import com.devsuperios.dsvendas.repositories.SaleRepository;
import com.devsuperios.dsvendas.repositories.SallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SallerRepository sallerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sallerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
