package domain.surgery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Specialty {
    private String name;

    public Specialty(String name) {
        this.name = name;
    }
}
