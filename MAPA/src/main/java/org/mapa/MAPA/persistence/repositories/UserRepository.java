package org.mapa.MAPA.persistence.repositories;

import org.mapa.MAPA.domain.people.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public Optional<User> findUserByUsername(@Param("username") String username);
}
