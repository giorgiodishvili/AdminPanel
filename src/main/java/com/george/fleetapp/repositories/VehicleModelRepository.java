package com.george.fleetapp.repositories;

import com.george.fleetapp.models.Client;
import com.george.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
