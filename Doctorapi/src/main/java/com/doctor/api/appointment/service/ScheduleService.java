package com.doctor.api.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.api.appointment.entity.Schedule;
import com.doctor.api.appointment.repository.ScheduleRepository;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getDoctorSchedule(Long doctorId) {
        return scheduleRepository.findByDoctorId(doctorId);
    }

    public Schedule addSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public Schedule updateSchedule(Long id, Schedule updatedSchedule) {
        if (scheduleRepository.existsById(id)) {
            updatedSchedule.setId(id);
            return scheduleRepository.save(updatedSchedule);
        }
        return null; // Handle case where the schedule with the given ID doesn't exist
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}