package com.app.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.profile.entity.StudentSample;
import com.app.profile.repository.StudentSampleRepo;

@Service
public class ServiceImpl {

//	@Autowired
	StudentSampleRepo studentSample;

	public ServiceImpl(StudentSampleRepo studentSampleRepo) {
		this.studentSample = studentSampleRepo;
	}

	// @Log
	public void justPrint() {
		System.out.println("hello");
	}

	public void justPrintWithValue(Long id) throws Exception {

		try {
			double d = id / 2;
			System.out.println("MY ID IS : " + d);
		} catch (Exception e) {
//			e.printStackTrace();
			throw new Exception(e);
		}

	}

	public List<StudentSample> findAllDetails() {
		return studentSample.findAll();
	}
}
