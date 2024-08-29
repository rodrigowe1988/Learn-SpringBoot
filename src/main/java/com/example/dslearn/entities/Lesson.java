package com.example.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_lesson")
public abstract class Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer position;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;
    @OneToMany(mappedBy = "lesson")
    private List<Deliver> deliveries = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "tb_lessons_done",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id"),
                    @JoinColumn(name = "offer_id")
            })
    private Set<Enrollment> enrollmentsDone = new HashSet<>();

}
