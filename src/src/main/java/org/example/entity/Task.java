package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name="taskName", nullable = false)
    private String taskName;

    @Column(name="description")
    private String description;

    @Column(name="status")
    private String status;

    @Column(name="priority", nullable=false)
    @Enumerated(EnumType.STRING)
    private Prority prority;

    @Column(name="deadline")
    private String deadline;

    @Column(name="userId")
    private int userId;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    private User user;
}
