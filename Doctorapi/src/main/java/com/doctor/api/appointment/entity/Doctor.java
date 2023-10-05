package com.doctor.api.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 // other fields

 // Getter and Setter methods
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Other getter and setter methods for additional fields

 @Override
 public String toString() {
     return "Doctor{" +
             "id=" + id +
             ", name='" + name + '\'' +
             // other fields
             '}';
 }
}

