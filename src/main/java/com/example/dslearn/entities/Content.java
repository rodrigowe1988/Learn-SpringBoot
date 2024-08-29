package com.example.dslearn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_content")
public class Content extends Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    private String textContent;
    private String videoUri;

    public Content(Long id, String title, Integer position, Section section, Set<Enrollment> enrollmentsDone, String textContent, String videoUri) {
        super(id, title, position, section, enrollmentsDone);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }
}
