package com.atividadeApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividadeApi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}
