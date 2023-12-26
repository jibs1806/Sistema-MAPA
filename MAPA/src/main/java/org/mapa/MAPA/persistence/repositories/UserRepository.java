package org.mapa.MAPA.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.mapa.MAPA.domain.people.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
