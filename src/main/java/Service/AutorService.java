package Service;

import entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AutorService {

    @Autowired
    public static Autor create(Autor autor) {
        return autor.save(autor);
    }
    public static List<Autor> getByAutor(Long id) {
        return null;
    }

    public static void delete(Long id) {
    }

    public List<Autor> listartodod() {
        return null;
    }
}
