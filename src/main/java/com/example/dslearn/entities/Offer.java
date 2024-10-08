package com.example.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startMoment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endMoment;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToMany(mappedBy = "offer")
    List<Resource> resources = new ArrayList<>();
    @OneToMany(mappedBy = "offer")
    List<Topic> topics = new ArrayList<>();

}
