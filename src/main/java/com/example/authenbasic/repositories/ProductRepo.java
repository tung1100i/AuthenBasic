package com.example.authenbasic.repositories;



import com.example.authenbasic.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {
}
