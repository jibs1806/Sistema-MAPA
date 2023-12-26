package org.mapa.MAPA.services;

import jakarta.transaction.Transactional;
import org.mapa.MAPA.domain.people.User;
import org.mapa.MAPA.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Transactional
    public User findById(Long id) {
        return this.userRepository.findById(id).get();
    }

    @Transactional
    public void save(User user) {
        this.userRepository.save(user);
    }

    @Transactional
    public void update(Long id, User user) {
        this.userRepository.deleteById(id);
        this.userRepository.save(user);
    }

    @Transactional
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
