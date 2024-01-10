package org.mapa.MAPA.persistence.repositories.people;

import org.mapa.MAPA.domain.agents.users.User;
import org.mapa.MAPA.persistence.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public Optional<User> findUserByUsername(@Param("username") String username);
}
