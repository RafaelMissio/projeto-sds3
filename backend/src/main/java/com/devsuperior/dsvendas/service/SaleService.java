package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.DTO.SaleDTO;
import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SallerRepository sallerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sallerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SalesSumDTO> amountGroupedBySeller() {
        return repository.amountGroupdBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesSuccessDTO> sucessGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
