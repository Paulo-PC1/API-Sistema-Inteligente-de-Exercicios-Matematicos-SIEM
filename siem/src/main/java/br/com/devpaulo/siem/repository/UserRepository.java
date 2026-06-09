package br.com.devpaulo.siem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devpaulo.siem.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
