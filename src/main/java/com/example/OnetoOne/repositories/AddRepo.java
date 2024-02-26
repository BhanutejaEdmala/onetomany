package com.example.OnetoOne.repositories;

import com.example.OnetoOne.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddRepo extends JpaRepository<Address, String> {
}
