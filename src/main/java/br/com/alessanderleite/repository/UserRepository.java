package br.com.alessanderleite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{}
