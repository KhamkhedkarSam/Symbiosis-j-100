package com.trg.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trg.Main.Model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
