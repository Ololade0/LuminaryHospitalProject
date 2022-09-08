package com.example.luminaryhospitalmangement.data.model;

import com.example.luminaryhospitalmangement.enums.HealthProfessionalType;

public class Doctor extends HealthProfessional {



    public Doctor(String firstName) {
        super(firstName);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.DOCTOR;
    }


}
