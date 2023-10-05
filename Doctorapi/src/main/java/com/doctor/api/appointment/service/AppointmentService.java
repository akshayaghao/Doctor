package com.doctor.api.appointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.api.appointment.entity.Appointment;
import com.doctor.api.appointment.repository.AppointmentRepository;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getDoctorAppointments(Long doctorId) {
        return appointmentRepository.findBySchedule_Doctor_Id(doctorId);
    }

    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Optional<Appointment> updateAppointment(Long id, Appointment updatedAppointment) {
        Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
        if (existingAppointment.isPresent()) {
            updatedAppointment.setId(id);
            return Optional.of(appointmentRepository.save(updatedAppointment));
        }
        return Optional.empty();
    }

    public boolean deleteAppointment(Long id) {
        try {
            appointmentRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}