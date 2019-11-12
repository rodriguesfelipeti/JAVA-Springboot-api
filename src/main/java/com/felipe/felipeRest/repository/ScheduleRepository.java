package com.felipe.felipeRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.felipeRest.models.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	Schedule findById(long id);
	
}
