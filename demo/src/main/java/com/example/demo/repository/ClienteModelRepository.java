package com.example.demo.repository;

import com.example.demo.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteModelRepository   extends JpaRepository<ClienteModel, Long> {
}
