package com.example.luminaryhospitalmangement.data.model;

import com.example.luminaryhospitalmangement.enums.HealthProfessionalType;

import java.util.Map;
import java.util.TreeMap;

public abstract class HealthProfessional{
    private String patientId;
    private int professionalId;
    private String firstName;
    private String lastName;
    private HealthProfessionalType healthProfessionalType;

    public static Map<String, Patient> patients = new TreeMap<>();

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHealthProfessionalType(HealthProfessionalType healthProfessionalType) {
        this.healthProfessionalType = healthProfessionalType;
    }

    public static void setPatients(Map<String, Patient> patients) {
        HealthProfessional.patients = patients;
    }

    public HealthProfessional(String firstName){
        this.firstName = firstName;
    }
    public abstract HealthProfessionalType getHealthProfessionalType();

    public Map<String, Patient> getPatients() {
        return LuminaryHospital.getPatientDb() ;
    }


    public String getPatientId() {
        return patientId;
    }
}
