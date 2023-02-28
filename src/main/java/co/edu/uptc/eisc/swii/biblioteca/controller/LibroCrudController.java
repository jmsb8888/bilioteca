package co.edu.uptc.eisc.swii.biblioteca.controller;

import co.edu.uptc.eisc.swii.biblioteca.domain.Libro;
import co.edu.uptc.eisc.swii.biblioteca.service.EditorialService;
import co.edu.uptc.eisc.swii.biblioteca.service.LibroService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class LibroCrudController {
    private final EditorialService editorialService;
    private final LibroService libroService;

    public LibroCrudController (EditorialService editorialService, LibroService libroService) {
        this.editorialService = editorialService;
        this.libroService = libroService;
    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "formLibro";
    }

    @RequestMapping("/libros/guardar")
    public String guardar(Libro libro){
        libroService.guardar(libro);
        return "redirect://";
    }
}
