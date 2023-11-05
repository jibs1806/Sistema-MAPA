package persistence;

import domain.people.Person;
import domain.people.User;
import domain.surgery.Surgery;
import domain.surgery.practice.Practice;

public class FactoryRepository {

    public static Repository getRepository(String nombreClase){
        Repository repo;
        switch (nombreClase){
            case "Surgery": repo = new Repository<Surgery>(); break;
            case "User": repo = new Repository<User>(); break;
            case "Practice": repo = new Repository<Practice>(); break;
            case "Person": repo = new Repository<Person>(); break;
            default: repo = null; break;
        }

        return repo;
    }
    
    public FactoryRepository(){

    }
}
