package com.yimnlu.AML_Platform.dto;

import lombok.Data;

@Data
public class location {
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
