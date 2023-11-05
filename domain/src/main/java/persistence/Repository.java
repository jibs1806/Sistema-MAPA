package persistence;

import domain.people.User;

import java.util.List;

public class Repository<T> {
    private List<T> list;

    public void addElement(T t){
        this.list.add(t);
    }

    public void delete(T t){
        this.list.remove(t);
    }

    public List<T> getAll(){
        return this.list;
    }

}
