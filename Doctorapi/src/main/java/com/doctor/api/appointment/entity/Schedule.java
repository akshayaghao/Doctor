package com.doctor.api.appointment.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Schedule {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @ManyToOne
 private Doctor doctor;
 private DayOfWeek dayOfWeek;
 private LocalTime startTime;
 private LocalTime endTime;
 private int maxPatients;
 // other fields

 // Getter and Setter methods
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public Doctor getDoctor() {
     return doctor;
 }

 public void setDoctor(Doctor doctor) {
     this.doctor = doctor;
 }

 public DayOfWeek getDayOfWeek() {
     return dayOfWeek;
 }

 public void setDayOfWeek(DayOfWeek dayOfWeek) {
     this.dayOfWeek = dayOfWeek;
 }

 public LocalTime getStartTime() {
     return startTime;
 }

 public void setStartTime(LocalTime startTime) {
     this.startTime = startTime;
 }

 public LocalTime getEndTime() {
     return endTime;
 }

 public void setEndTime(LocalTime endTime) {
     this.endTime = endTime;
 }

 public int getMaxPatients() {
     return maxPatients;
 }

 public void setMaxPatients(int maxPatients) {
     this.maxPatients = maxPatients;
 }

 // Other getter and setter methods for additional fields

 @Override
 public String toString() {
     return "Schedule{" +
             "id=" + id +
             ", doctor=" + doctor +
             ", dayOfWeek=" + dayOfWeek +
             ", startTime=" + startTime +
             ", endTime=" + endTime +
             ", maxPatients=" + maxPatients +
             // other fields
             '}';
 }
}
