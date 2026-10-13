package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaginasController {
    @GetMapping({"/", "/agendar"})
    public String agendar(Model model) {
        model.addAttribute("barbeiros", List.of());
        model.addAttribute("servicos", List.of());
        return "agendar/index";
    }

    @GetMapping("/admin/login")
    public String login() {
        return "admin/login";
    }

    @GetMapping({"/admin/painel-agenda", "/admin/painel"})
    public String painel(Model model) {
        model.addAttribute("barbeiros", List.of());
        model.addAttribute("agendamentos", List.of());
        return "admin/painel-agenda";
    }

    @GetMapping({"/cliente/status", "/cliente/status/consultar"})
    public String status(@RequestParam(required = false) String codigo, Model model) {
        model.addAttribute("codigo", codigo);
        model.addAttribute("agendamento", null);
        return "cliente/status";
    }

    @GetMapping("/cliente/cancelar")
    public String cancelar(@RequestParam(required = false) Long agendamentoId, Model model) {
        model.addAttribute("agendamentoId", agendamentoId);
        return "cliente/cancelar";
    }

    @GetMapping("/cliente/remarcar")
    public String remarcar(@RequestParam(required = false) Long agendamentoId, Model model) {
        model.addAttribute("agendamentoId", agendamentoId);
        return "cliente/remarcar";
    }
}
