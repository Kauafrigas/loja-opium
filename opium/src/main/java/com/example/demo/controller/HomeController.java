/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;



import com.example.demo.dao.ProdutoDAO;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
public String home(Model model) {
    ProdutoDAO produtoDAO = new ProdutoDAO();
    try {
        model.addAttribute("produtos", produtoDAO.listarProdutos());
    } catch (SQLException e) {
        e.printStackTrace();
        model.addAttribute("error", "Erro ao carregar produtos.");
    }
    return "index";
}

    
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/produto")
    public String produto() {
        return "produto";
    }

    @GetMapping("/carrinho")
    public String carrinho() {
        return "carrinho";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
}
