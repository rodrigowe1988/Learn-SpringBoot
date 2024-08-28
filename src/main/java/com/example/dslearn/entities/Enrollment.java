package com.example.dslearn.entities;

import com.example.dslearn.entities.pk.EnrollmentPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMent;
    private boolean available;
    private boolean onlyUpdate;

    public Enrollment(User user, Offer offer, Instant enrollment, Instant refundMent, boolean available, boolean onlyUpdate) {
        super();
        id.setUser(user);
        id.setOffer(offer);
        this.enrollment = enrollment;
        this.refundMent = refundMent;
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
