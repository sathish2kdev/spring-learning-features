package com.app.profile.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.profile.entity.StudentSample;

//@DataJpaTest
public class StudentTest {

	@Autowired
	StudentSampleRepo studenrtRepositoy;

	@BeforeEach
	@Disabled
	void textStudentRepository() {
		
		StudentSample StudentSample = new StudentSample();
		StudentSample.setStudentId(1L);
		studenrtRepositoy.save(StudentSample);

		List<StudentSample> list = studenrtRepositoy.findAll();
		System.out.println("SIZE  === >  "+list.size());
		assertThat(list).isNotEmpty();
		
	}
	
	@AfterEach
	@Disabled
	void deleteData() {
		System.out.println("DELETE DATA");
		studenrtRepositoy.deleteAll();
	}
	
	@Test
	@Disabled
	void findByStudentId() {
		StudentSample stru = studenrtRepositoy.findByStudentId(1L);
		System.out.println("DATA CHECK   ======== >    "+ stru);
		assertThat(stru).isNotNull();
		
	}
}
