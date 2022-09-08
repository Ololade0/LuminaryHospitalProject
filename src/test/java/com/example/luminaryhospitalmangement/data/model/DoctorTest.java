package com.example.luminaryhospitalmangement.data.model;

import com.example.luminaryhospitalmangement.enums.HealthProfessionalType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    private Doctor drJoy;
      private HealthProfessional boyo;

    @BeforeEach
    void setUp() {
        drJoy = new Doctor("Joy");
        boyo = new Nurse("Boyo");
    }

    @Test
  public void createHealthProfessional(){
        assertEquals(HealthProfessionalType.DOCTOR, drJoy.getHealthProfessionalType());
        assertNotEquals(HealthProfessionalType.DOCTOR, boyo.getHealthProfessionalType());
        assertEquals(HealthProfessionalType.NURSE, boyo.getHealthProfessionalType());
        boyo = new Pharmacist("wimps");
        assertNotEquals(HealthProfessionalType.NURSE, boyo.getHealthProfessionalType());
        assertEquals(HealthProfessionalType.PHARMARCIST, boyo.getHealthProfessionalType());

    }

    @Test
    void getDoctorPatients(){
        assertNotNull(drJoy);
        assertNotNull(drJoy.getPatients());
        assertEquals(0, drJoy.getPatients().size());
        drJoy.getPatients().put(boyo.getPatientId(), boyo);
        assertFalse(drJoy.getPatients().isEmpty());

        Patient patient = drJoy.getPatients().get("e1");
       // assertEquals(boyo, patient);
    }

    @Test
    void createPatient(){
        Patient patient = new Patient("e1");
    }
}