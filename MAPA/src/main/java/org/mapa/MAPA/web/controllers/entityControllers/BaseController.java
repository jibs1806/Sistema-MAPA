package org.mapa.MAPA.web.controllers.entityControllers;


import org.mapa.MAPA.services.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T> {
    protected abstract BaseService<T> getService();

    @GetMapping
    public List<T> findAll() {
        return this.getService().findAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id) {
        return this.getService().findById(id);
    }

    @PostMapping
    public void create(@RequestBody T t) {
        this.getService().save(t);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody T t) {
        this.getService().update(id, t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.getService().delete(id);
    }
}
