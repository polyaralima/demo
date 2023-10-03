package Repository;

import entity.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface

EditoraRepository extends JpaRepository<Editora, Long>{

    List<Editora> findAll();

    Editora save(Editora editora);
        List<Editora> findByNome(String nome);

    Editora created(Editora editora);
}


