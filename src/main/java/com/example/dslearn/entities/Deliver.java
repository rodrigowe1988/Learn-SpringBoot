package com.example.dslearn.entities;

import com.example.dslearn.entities.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_deliver")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deliver implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
