package personas;

import domain.personas.RolEnSistema;
import domain.personas.Usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class PersonasTest {
    private Usuario usuarioGenerico;

    @BeforeEach
    public void init(){
        this.usuarioGenerico = new Usuario("Juan123","123","@", RolEnSistema.EMPLEADO);
    }

    @Test
    @DisplayName("Contrasenias validas")
    public void usuarioTest(){
        Assertions.assertTrue(usuarioGenerico.getContrasenia() == "123");
    }
}
