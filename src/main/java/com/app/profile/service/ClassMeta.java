package com.app.profile.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public abstract class ClassMeta implements InterfaceMeta{

	@Override
	public String display() {
		log.info("Started"+LoggerFactory.getLogger(getClass()).getName());
		log.info("Ended"+LoggerFactory.getLogger(getClass()).getName());
		return null;
	}
	
}
