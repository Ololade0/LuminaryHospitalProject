package com.example.luminaryhospitalmangement.data.model;

import com.example.luminaryhospitalmangement.enums.HealthProfessionalType;

public class Nurse extends HealthProfessional {


    public Nurse(String firstName) {
        super(firstName);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.NURSE;
    }
}
