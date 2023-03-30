package com.example.demo.repository;

import com.example.demo.models.CategoriaModel;
import com.example.demo.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository  extends JpaRepository<FornecedorModel, Long> {
}
