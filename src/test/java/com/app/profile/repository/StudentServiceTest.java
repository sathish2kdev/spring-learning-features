package com.app.profile.repository;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.app.profile.service.ServiceImpl;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

//	@Autowired
	@InjectMocks
	ServiceImpl serviceImpl;

	@Mock
	StudentSampleRepo studentSampleRepo;
	
	@Autowired
	ServiceImpl serviceImpl1;

	@Autowired
	StudentSampleRepo studentSampleRepo1;

//	@BeforeEach
//	public void injectRepository() {
//		serviceImpl = new ServiceImpl(studentSampleRepo);
//	}

	@Test
	public void testService() {
		serviceImpl.findAllDetails();
		verify(studentSampleRepo).findAll();

	}
}
