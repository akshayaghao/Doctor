package com.doctor.api.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.api.appointment.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findBySchedule_Doctor_Id(Long doctorId);
}