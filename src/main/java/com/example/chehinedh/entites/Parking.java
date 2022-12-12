package com.example.chehinedh.entites;

import com.example.chehinedh.entites.Zone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destination;
    private String adresse;
    private int capacite;
    @OneToMany(mappedBy = "parking")
    private List<Zone> zones;
}
