package com.todoapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Table(name = "tasks")
@Data

public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private boolean done;
    private LocalDateTime deadline;
    @Embedded
    private Audit audit = new Audit();

    public void updateFrom(Task source) {
        this.description = source.description;
        done = source.done;
        deadline = source.deadline;
    }

}
