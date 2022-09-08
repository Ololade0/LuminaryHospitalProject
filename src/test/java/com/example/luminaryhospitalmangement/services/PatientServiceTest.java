package com.example.luminaryhospitalmangement.services;

import com.example.luminaryhospitalmangement.Exceptions.HospitalException;
import com.example.luminaryhospitalmangement.data.model.LuminaryHospital;
import com.example.luminaryhospitalmangement.data.model.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


class PatientServiceTest {
    Logger logger = Logger.getLogger(PatientServiceTest.class.getName());
    private PatientService patientService;
    private Patient Ololade;


    @BeforeEach
    void setUp() {
        patientService  = new PatientServiceImpl();
    }

    @Test
    void register(){
        assertTrue(LuminaryHospital.getPatientDb().isEmpty());
        Ololade = new Patient("01", "Ololade");
        patientService.register(Ololade);
        assertFalse(LuminaryHospital.getPatientDb().isEmpty());
    }

    @Test
    void registerWithNullPatient(){
        assertFalse(LuminaryHospital.getPatientDb().isEmpty());
        assertThrows(HospitalException. class, ()-> patientService.register(Ololade));
    }
}