package co.edu.uptc.eisc.swii.biblioteca.service;

import co.edu.uptc.eisc.swii.biblioteca.domain.Editorial;
import co.edu.uptc.eisc.swii.biblioteca.repository.EditorialRepository;

import java.util.List;

public class EditorialService {
    private final EditorialRepository editorialRepository;

    public EditorialService (EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    public List<Editorial> buscarTodos(){
        return editorialRepository.findAll();
    }
}
