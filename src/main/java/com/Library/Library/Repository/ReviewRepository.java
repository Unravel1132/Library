package com.Library.Library.Repository;

import com.Library.Library.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Можно добавить дополнительные методы, если это необходимо
}
