package com.utiltech.laundry.services.repository;

import com.utiltech.laundry.services.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
    Vendor findByIdAndName(Long id, String name);
}