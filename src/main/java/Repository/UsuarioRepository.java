package Repository;

import entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    void deleteById(Long id);

    Optional<Usuario> findById(Long id);

    Usuario created(Usuario usuario);
}
