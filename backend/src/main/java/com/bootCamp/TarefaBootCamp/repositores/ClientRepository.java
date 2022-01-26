package com.bootCamp.TarefaBootCamp.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootCamp.TarefaBootCamp.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
