package com.utiltech.laundry.services.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.utiltech.laundry.services.entity.Pet;
import com.utiltech.laundry.services.entity.Vendor;
import com.utiltech.laundry.services.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private VendorRepository vendorRepository;

    public List<Vendor> vendors() {
        return vendorRepository.findAll();
    }

    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();
        Pet aPet = new Pet();
        aPet.setId(1l);
        aPet.setName("Bill");
        pets.add(aPet);
        return pets;
    }
}
