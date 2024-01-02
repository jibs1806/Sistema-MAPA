package org.mapa.MAPA.services;

import jakarta.transaction.Transactional;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.utils.ObjectCopyUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseService<T> {
    protected abstract BaseRepository<T> getRepository();

    @Transactional
    public List<T> findAll() {
        return this.getRepository().findAll();
    }

    @Transactional
    public Optional<T> findById(Long id){
        return this.getRepository().findById(id);
    }

    @Transactional
    public void save(T t) {
        this.getRepository().save(t);
    }

    @Transactional
    public void update(Long id, T updatedT) {
        T existingT = this.findById(id).get();

        ObjectCopyUtil<T> objectCopyUtil = new ObjectCopyUtil();
        objectCopyUtil.copyNonNullProperties(updatedT, existingT);

        this.getRepository().save(existingT);
    }

    @Transactional
    public void delete(Long id) {
        this.getRepository().deleteById(id);
    }
}
