package com.example.luminaryhospitalmangement.data.model;

import java.util.Map;
import java.util.TreeMap;

public class LuminaryHospital {
    private static Map<String, Patient> patientDb = new TreeMap<>();

    public static Map<String, Patient> getPatientDb() {
        return patientDb;


    }


}