package com.ibm.containercrush.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.containercrush.shoes.domain.ProductCatalog;

@Repository
public interface ProductRepository extends JpaRepository<ProductCatalog, Integer> {

}
