package com.nelioalves.curso_mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.nelioalves.curso_mc.domain.Cidade;
import com.nelioalves.curso_mc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
