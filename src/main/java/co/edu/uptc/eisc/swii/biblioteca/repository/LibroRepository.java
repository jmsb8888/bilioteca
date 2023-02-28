package co.edu.uptc.eisc.swii.biblioteca.repository;

import co.edu.uptc.eisc.swii.biblioteca.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Integer> {
//@Query("select v from Libro v order by v.nombre")
    @Query("from Libro v order by v.nombre")
    List<Libro> buscartodos();

    @Query("from Libro v where v.editorial.id = ?1 order by v.nombre")
    List<Libro> buscarPorEditorial(int editorialId);

    @Query("from Libro l where l.nombre like '%l%' ")
    List<Libro> buscar(String Consulta);

}
