package org.mapa.MAPA.services.people;

import org.mapa.MAPA.domain.people.user.User;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.mapa.MAPA.persistence.repositories.people.UserRepository;
import org.mapa.MAPA.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserRepository userRepository;


    @Override
    protected BaseRepository<User> getRepository() {
        return this.userRepository;
    }

    public Optional<User> findByUsername(String username){
        return this.userRepository.findUserByUsername(username);
    }

    public boolean isPasswordCorrect(User user, String password) {
        return user.getPassword().equals(password);
    }
}
