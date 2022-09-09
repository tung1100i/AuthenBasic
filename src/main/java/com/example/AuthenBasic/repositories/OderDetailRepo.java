package com.example.AuthenBasic.repositories;


import com.example.AuthenBasic.entities.OderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OderDetailRepo extends JpaRepository<OderEntity,Long> {
}
