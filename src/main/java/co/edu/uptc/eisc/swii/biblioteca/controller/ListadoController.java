package co.edu.uptc.eisc.swii.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class ListadoController {


    @RequestMapping("/")
    public String ListarLibros(Model model) {

        return "listado";
    }
}
