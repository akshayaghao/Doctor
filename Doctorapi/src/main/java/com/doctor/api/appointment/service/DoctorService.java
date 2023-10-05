package com.doctor.api.appointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.api.appointment.entity.Doctor;
import com.doctor.api.appointment.repository.DoctorRepository;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Optional<Doctor> updateDoctor(Long id, Doctor updatedDoctor) {
        Optional<Doctor> existingDoctor = doctorRepository.findById(id);
        if (existingDoctor.isPresent()) {
            updatedDoctor.setId(id);
            return Optional.of(doctorRepository.save(updatedDoctor));
        }
        return Optional.empty();
    }

    public boolean deleteDoctor(Long id) {
        try {
            doctorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
