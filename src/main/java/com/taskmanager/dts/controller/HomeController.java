package com.taskmanager.dts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Esto ahora funcionará con el sufijo .html configurado
    }

    // Añadir un mapeo explícito para index.html por si hay problemas con la ruta raíz
    @GetMapping("/index.html")
    public String indexPage() {
        return "index";
    }
}