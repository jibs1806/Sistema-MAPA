package org.mapa.MAPA.services;

import org.mapa.MAPA.domain.people.User;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected BaseRepository<User> getRepository() {
        return this.userRepository;
    }
}
