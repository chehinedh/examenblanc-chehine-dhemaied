package com.example.chehinedh.repositories;

import com.example.chehinedh.entites.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepo extends JpaRepository<Personnel,Integer> {
}
