package com.yimnlu.AML_Platform.entity;

import java.io.Serializable;

public class CountryCode implements Serializable {
    private static final long serialVersionUID = 1L;

    public String getTRADE_VENUE_COUNTRY() {
        return TRADE_VENUE_COUNTRY;
    }

    public void setTRADE_VENUE_COUNTRY(String TRADE_VENUE_COUNTRY) {
        this.TRADE_VENUE_COUNTRY = TRADE_VENUE_COUNTRY;
    }

    private String TRADE_VENUE_COUNTRY;
}
