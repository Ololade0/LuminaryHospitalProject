package com.example.luminaryhospitalmangement.services;

import com.example.luminaryhospitalmangement.Exceptions.HospitalException;
import com.example.luminaryhospitalmangement.data.model.LuminaryHospital;
import com.example.luminaryhospitalmangement.data.model.Patient;

import static javax.swing.UIManager.put;

public class PatientServiceImpl implements PatientService{
    @Override
    public void register(Patient newPatient) throws HospitalException {
        validatePatient(newPatient);
        LuminaryHospital.getPatientDb(),put(newPatient.getPatientId(), newPatient);

    }

    private void validatePatient(Patient Patient)  throws  HospitalException {
        if(patient == null){
            throw new HospitalException("Patient cannot be null");
        }
    }
}
