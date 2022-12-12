package com.example.chehinedh.repositories;

import com.example.chehinedh.entites.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepo extends JpaRepository<Zone, Integer> {
}
