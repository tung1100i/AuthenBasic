package com.example.authenbasic.repositories;



import com.example.authenbasic.entities.OderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepo extends JpaRepository<OderEntity,Long> {
}
