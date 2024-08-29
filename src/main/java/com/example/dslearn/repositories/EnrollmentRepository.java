package com.example.dslearn.repositories;

import com.example.dslearn.entities.Enrollment;
import com.example.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
