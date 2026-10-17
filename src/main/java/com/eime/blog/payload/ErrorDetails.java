package com.eime.blog.payload;

import java.util.Date;

public class ErrorDetails {

    private Date tiemstamp;
    private String mesage;
    private String details;

    public ErrorDetails(Date tiemstamp, String mesage, String details) {
        this.tiemstamp = tiemstamp;
        this.mesage = mesage;
        this.details = details;
    }

    public Date getTiemstamp() {
        return tiemstamp;
    }

    public String getMesage() {
        return mesage;
    }

    public String getDetails() {
        return details;
    }
}
