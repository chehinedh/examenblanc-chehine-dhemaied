package com.example.chehinedh.entites;

import com.example.chehinedh.entites.Poste;
import com.example.chehinedh.entites.Zone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date dateDeRecrutement;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Poste poste;
    @OneToOne
    private Zone zone;
}
