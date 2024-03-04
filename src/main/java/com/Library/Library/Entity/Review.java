package com.Library.Library.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    private int rating;

    // Связь с книгой
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    // Связь с пользователем
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
