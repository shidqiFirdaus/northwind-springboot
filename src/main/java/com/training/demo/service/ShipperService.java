package com.training.demo.service;

import com.training.demo.model.Shipper;
import com.training.demo.repo.ShipperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ShipperService {

    @Autowired
    private ShipperRepo shipperRepo;

    public List<Shipper> findAll() {
        return shipperRepo.findAll();
    }

    public Optional<Shipper> findById(Integer id) {
        return Optional.ofNullable(shipperRepo.findById(id).orElse(null));
    }

    public Shipper save(Shipper shipper) {
        return shipperRepo.save(shipper);
    }

    public void deleteById(Integer id) {
        shipperRepo.deleteById(id);
    }
}
