package com.example.dslearn.entities;

import com.example.dslearn.entities.pk.EnrollmentPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;
    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonsDone = new HashSet<>();

    public Enrollment(User user, Offer offer, Instant enrollment, Instant refundMent, boolean available, boolean onlyUpdate) {
        super();
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollment;
        this.refundMoment = refundMent;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public User getStudent() {
        return id.getUser();
    }

    public void setStudent(User user) {
        id.setUser(user);
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setStudent(Offer offer) {
        id.setOffer(offer);
    }
}
