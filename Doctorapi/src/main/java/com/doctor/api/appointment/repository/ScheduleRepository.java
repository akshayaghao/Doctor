package com.doctor.api.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.api.appointment.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByDoctorId(Long doctorId);
}
