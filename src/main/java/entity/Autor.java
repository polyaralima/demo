package entity;


import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)

@Builder(toBuilder = true)
public class Autor implements Serializable {

    private final Long id;

    @NotNull
    private String nome;

    private String email;


    public Autor save(Autor autor) {
        return null;
    }
}

