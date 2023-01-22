package com.azem.user.repository;

import com.azem.user.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Child, Long> {

    Child findByUserId(Long userId);
}
