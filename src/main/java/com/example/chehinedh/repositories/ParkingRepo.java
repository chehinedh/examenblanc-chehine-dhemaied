package com.example.chehinedh.repositories;

import com.example.chehinedh.entites.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepo extends JpaRepository<Parking, Integer> {
}
