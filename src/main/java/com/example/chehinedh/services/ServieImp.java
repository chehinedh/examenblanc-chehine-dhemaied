package com.example.chehinedh.services;

import com.example.chehinedh.entites.Parking;
import com.example.chehinedh.entites.Personnel;
import com.example.chehinedh.entites.Poste;
import com.example.chehinedh.entites.Zone;
import com.example.chehinedh.repositories.ParkingRepo;
import com.example.chehinedh.repositories.PersonnelRepo;
import com.example.chehinedh.repositories.ZoneRepo;
import com.example.chehinedh.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServieImp implements IService {
@Autowired
    private PersonnelRepo personnelRepo;

    @Autowired
    private ParkingRepo parkingRepo;

    @Autowired
    private ZoneRepo zoneRepo;



    @Override
    public Personnel ajouterPersonnel(Personnel personnel) {
        return personnelRepo.save(personnel);
    }

    @Override
    public void ajoutParkingetZones(Parking parking) {
    }

    @Override
    public void affecterPersonnelZOne(int idzone, int idGarde) {
        Personnel personnel = personnelRepo.findById(idGarde).orElse(null);
        Zone zone = zoneRepo.findById(idzone).orElse(null);
        if (zone!=null && personnel!=null) {
            personnel.setZone(zone);
            personnelRepo.save(personnel);
        }
    }
    @Scheduled(fixedRate = 300000)
    @Override
    public void getNbrGardesByZone() {
    }

    @Override
    public List<Personnel> getPersonalByDate(Date startDate, Date endDate) {
        return null;
    }


}
