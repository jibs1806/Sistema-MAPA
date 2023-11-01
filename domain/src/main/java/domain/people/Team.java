package domain.people;

import java.util.List;

public class Team {
    private List<Person> members;

    public Team(List<Person> members) {
        this.members = members;
    }
}
