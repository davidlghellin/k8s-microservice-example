package com.datahack.product.productCommand.infratructure.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface CommandRepository extends JpaRepository<ProductCommandEntity, UUID> {
}

