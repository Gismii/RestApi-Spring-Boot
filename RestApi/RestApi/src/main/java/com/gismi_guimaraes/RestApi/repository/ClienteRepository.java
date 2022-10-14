package com.gismi_guimaraes.RestApi.repository;

import com.gismi_guimaraes.RestApi.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends JpaRepository<Clientes, Long> {
}
