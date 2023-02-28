package co.edu.uptc.eisc.swii.biblioteca.controller;

import co.edu.uptc.eisc.swii.biblioteca.service.EditorialService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class LibroCrudController {
    private final EditorialService editorialService;

    public LibroCrudController (EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "formLibro";
    }
}
