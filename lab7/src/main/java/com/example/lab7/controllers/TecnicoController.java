package com.example.lab7.controllers;

import com.example.lab7.entity.Tecnico;
import com.example.lab7.repository.TecnicoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/tecnico")
public class TecnicoController {
    final TecnicoRepository tecnicoRepository;
    public TecnicoController(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    @GetMapping(value={"/lista", ""})
    public String listarTecnicos (Model model) {
        List<Tecnico> lista = tecnicoRepository.findAll();
        model.addAttribute("listatecnicos", lista);
        return "tecnicos/listatecnico";
    }

    @GetMapping("/crear")
    public String crearForm() {
        return "tecnicos/formnuevotecnico";
    }

    @PostMapping("/guardar")
    public String guardarTecnico() {
        return "redirect:/tecnicos/listatecnico";
    }
}
