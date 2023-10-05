package com.doctor.api.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.api.appointment.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}