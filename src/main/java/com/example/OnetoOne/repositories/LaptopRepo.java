package com.example.OnetoOne.repositories;

import com.example.OnetoOne.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,String> {
}
