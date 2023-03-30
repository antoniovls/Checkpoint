package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.CategoriaModel;



public class EcommerceController {
	
	

	@GetMapping
	public ModelAndView homeController() {
	
	ModelAndView model = new ModelAndView("/home");
	List<CategoriaModel> listCategoria = new ArrayList<CategoriaModel>();
	
	CategoriaModel categoriaModelum = new CategoriaModel();
	
	categoriaModelum.setId(new Long(1));
	categoriaModelum.setDescricao("Descricao");
	model.addObject("categorias", categoriaModelum);
	
	return model;
	
	}
	
}
