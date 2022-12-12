package com.example.chehinedh.services;

import com.example.chehinedh.entites.Parking;
import com.example.chehinedh.entites.Personnel;

import java.util.Date;
import java.util.List;

public interface IService {
    public Personnel ajouterPersonnel(Personnel perspnnel);
    public void ajoutParkingetZones(Parking parking);

    public void affecterPersonnelZOne(int idzone, int idGarde);

    public void getNbrGardesByZone();

    public List<Personnel> getPersonalByDate(Date startDate, Date endDate);
}
