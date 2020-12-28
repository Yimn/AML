package com.yimnlu.AML_Platform.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class location implements Serializable {

    private static final long serialVersionUID = 1L;

    private String Longitude;
    private String Latitude;

    public location(String longitude, String latitude) {
        Longitude = longitude;
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
}
