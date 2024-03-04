package com.Library.Library.Repository;

import com.Library.Library.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Можно добавить дополнительные методы, если это необходимо
}
