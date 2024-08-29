package com.example.dslearn.entities;

import com.example.dslearn.entities.enums.ResourceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
    @OneToMany(mappedBy = "resource")
    private List<Section> sections = new ArrayList<>();
}