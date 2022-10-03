package br.com.darthlogus.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.darthlogus.tacocloud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
