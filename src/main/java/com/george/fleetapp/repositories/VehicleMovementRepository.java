package com.george.fleetapp.repositories;

import com.george.fleetapp.models.Client;
import com.george.fleetapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
