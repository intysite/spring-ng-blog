package com.programming.techie.springngblog.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String title;

    @Lob
    @Column
    @NonNull
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    @NonNull
    private String username;

}
