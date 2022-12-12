package com.example.chehinedh.entites;

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

public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;
    private float dimension;
    @ManyToOne
    private Parking parking;
    @OneToOne
    private Personnel personnel;
    @OneToMany
    private List<Personnel> personnelList;
}
