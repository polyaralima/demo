package Repository;

import entity.Livro;

import java.util.List;
import java.util.Optional;

public interface LivroRepository {
    List<Livro> findAll();

    Optional<Livro> findById(Long id);

    void deleteById(Long id);

    Livro save(Object livro);
}
