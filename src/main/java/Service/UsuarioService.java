package Service;
import Repository.UsuarioRepository;
import entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar (Usuario usuario){
        return repository.save(usuario);
    }
    public Usuario criar (Usuario usuario){
        return repository.created(usuario);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }


    public List<Usuario> getByUsuario(Long id) {
        return null;
    }
}
