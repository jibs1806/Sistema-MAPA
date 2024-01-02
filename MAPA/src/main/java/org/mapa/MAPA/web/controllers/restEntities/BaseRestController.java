package org.mapa.MAPA.web.controllers.restEntities;

import org.mapa.MAPA.services.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public abstract class BaseRestController<T> {

    protected abstract BaseService getService();

    @GetMapping("/")
    public List<T> getAll(){
        return this.getService().findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable Long id){
        return (Optional<T>) this.getService().findById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody T t){
        this.getService().save(t);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody T t){
        this.getService().update(id, t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.getService().delete(id);
    }

}
