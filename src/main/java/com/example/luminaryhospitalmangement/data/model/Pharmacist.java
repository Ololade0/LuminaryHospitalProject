package com.example.luminaryhospitalmangement.data.model;

import com.example.luminaryhospitalmangement.enums.HealthProfessionalType;

public class Pharmacist extends HealthProfessional {
    public Pharmacist(String firstName) {
        super(firstName);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.PHARMARCIST;
    }
}
