/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoplantilla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alumno
 */
@Controller
public class Primero {
    @GetMapping({"/","/primero"})
    public String primero(Model model,@RequestParam(value="nombre",
            required=false,defaultValue="defecto") String nombre){
        model.addAttribute("nombre",nombre);
        return "primero";
    }    
}
