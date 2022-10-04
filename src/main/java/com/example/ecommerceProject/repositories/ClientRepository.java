package com.example.ecommerceProject.repositories;

import com.example.ecommerceProject.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository <Client , Long> {
}
