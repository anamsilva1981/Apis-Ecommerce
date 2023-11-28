package com.crud.api.infra.repositories;

import com.crud.api.domain.entities.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductsModel, Long> {
}
