package com.api.parkingcontrol.repositores;

import com.api.parkingcontrol.module.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, UUID>{
    Boolean existsByLicensePlateCar (String licensePlateCar);
    Boolean existsByParkingSpotNumber (String parkingSpotNumber);
    Boolean existsByApartmentAndBlock (String apartment , String block );
}
