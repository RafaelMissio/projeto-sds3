package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.DTO.SalesSuccessDTO;
import com.devsuperior.dsvendas.DTO.SalesSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long> {

    @Query("SELECT new com.devsuperior.dsvendas.DTO.SalesSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller ")
    List<SalesSumDTO> amountGroupdBySeller();

   @Query("SELECT new com.devsuperior.dsvendas.DTO.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller ")
    List<SalesSuccessDTO> successGroupedBySeller();

}
