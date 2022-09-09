package com.example.AuthenBasic.repositories;



import com.example.AuthenBasic.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {
}
