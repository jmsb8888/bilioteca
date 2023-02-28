package co.edu.uptc.eisc.swii.biblioteca.repository;

import co.edu.uptc.eisc.swii.biblioteca.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Integer> {


}
