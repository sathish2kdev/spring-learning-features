package com.app.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.profile.entity.StudentSample;

@Repository
public interface StudentSampleRepo extends JpaRepository<StudentSample, Long> {

	StudentSample findByStudentId(Long studentId);
}
