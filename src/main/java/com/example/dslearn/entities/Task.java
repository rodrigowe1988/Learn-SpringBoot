package com.example.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_task")
public class Task extends Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;
}
