package Service;

import Repository.LivroRepository;
import entity.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private static LivroRepository repository;
    public Livro salvar (Livro livro){
        return repository.save(livro);
    }
    public Livro criar (Livro livro){
        return repository.save(livro);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public List<Livro> listartodos() {
        return repository.findAll();
    }
}

