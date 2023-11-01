package people;

import domain.people.SystemRole;
import domain.people.User;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestPeople {
    private User userGenerico;

    @BeforeEach
    public void init(){
        this.userGenerico = new User("Juan123","123","@", SystemRole.EMPLOYEE);
    }

    @Test
    @DisplayName("Contrasenias validas")
    public void usuarioTest(){
        Assertions.assertTrue(userGenerico.getPassword() == "123");
    }
}
