package co.edu.uptc.eisc.swii.biblioteca.controller;

import co.edu.uptc.eisc.swii.biblioteca.domain.Libro;
import co.edu.uptc.eisc.swii.biblioteca.service.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class ListadoController {

    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String ListarLibros(Model model) {
        List<Libro> destacados = libroService.buscarDestacados();
        model.addAttribute("libros", destacados);
        return "listado";
    }
    @RequestMapping("/librosPorEditorial")
    public String listarLibrosPorEditorial(int editorialId, Model model) {
        List<Libro> libros = libroService.buscarPorEditorial(editorialId);
        model.addAttribute("libros", libros);
        return "listado";
    }
}
