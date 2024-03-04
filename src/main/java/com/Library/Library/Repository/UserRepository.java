package com.Library.Library.Repository;

import com.Library.Library.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Можно добавить дополнительные методы, если это необходимо
}
