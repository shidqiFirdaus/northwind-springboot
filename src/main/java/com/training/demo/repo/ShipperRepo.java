package com.training.demo.repo;

import com.training.demo.model.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepo extends JpaRepository<Shipper,Integer> {
}
