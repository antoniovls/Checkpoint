package com.example.demo.controller;

import com.example.demo.models.CategoriaModel;
import com.example.demo.models.ClienteModel;
import com.example.demo.models.FornecedorModel;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.repository.ClienteModelRepository;
import com.example.demo.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    ClienteModelRepository clienteModelRepository;

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }
    @PostMapping("/home")
    public String home(@ModelAttribute("descricao") CategoriaModel categoria) {

        categoriaRepository.save(categoria);

        return "redirect:/home";
    }
    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @GetMapping("/fornecedor")
    public ModelAndView fornecedor() {

        ModelAndView model = new ModelAndView("fornecedor");

        List<FornecedorModel> listafornecedores = fornecedorRepository.findAll();


        model.addObject("fornecedorModels", listafornecedores);
        return model;
    }


    @PostMapping("/fornecedor") // Pega os dados inseridos na página para utilizar no método
    public String fornecedor(@ModelAttribute("name") FornecedorModel fornecedor) {

        fornecedorRepository.save(fornecedor);

        return "redirect:/fornecedor";
    }



    @PostMapping("/cliente") // Pega os dados inseridos na página para utilizar no método
    public String create(@ModelAttribute("cliente") ClienteModel cliente) {
        // O dado passado no método identifica os atributos da classe Produto no html
        // o dado deve ser inserido no banco já, para inserir utilizamos o save
        clienteModelRepository.save(cliente);
        // Após retornar os dados para a controller redireciona para a pagina inicial
        return "redirect:/cliente";
    }

    @GetMapping("/cliente")
    public ModelAndView cliente() {

        ModelAndView model = new ModelAndView("cliente");

        List<ClienteModel> listaCliente = clienteModelRepository.findAll();

        model.addObject("clienteModels", listaCliente);
        return model;
    }



}
