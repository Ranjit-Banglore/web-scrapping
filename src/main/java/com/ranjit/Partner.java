package com.ranjit;

import java.util.Arrays;
import java.util.List;

public enum Partner {
    ALLTOURS(33451, "Alltours"),
    DERTOURHOTEL(21653, "DERTOURHotel");
    /*DERTOURPauschal(21655, "DERTOURPauschal"),
    DAENEMARK01(31391, "Daenemark01"),
    DAENEMARK02(33749, "Daenemark02"),
    DAENEMARK03(33755, "Daenemark03"),
    DREAMLINES(34549, "Dreamlines"),
    EXPEDIA(21987, "Expedia"),
    HOTELDE(33451, "Hotel.de"),
    ITS(18877, "ITS"),
    ITSZAN(18883, "ITSzan"),
    INTERCITYHOTEL(18859, "InterCityHotel"),
    JSCHWEIZER(26967, "JSchweizer"),
    LASTMINUTEP1(32477, "LastminuteP1"),
    MEIERHOTEL(29051, "MeiersHotel"),
    MEIERSPAUSCHAL(26239, "MeiersPauschal"),
    ROBINSON(34751, "Robinson"),
    URLAUBSBOX(32955, "Urlaubsbox"),
    VIATORDEALS(18891, "ViatorDeals"),
    VIATORTOP500(18991, "ViatorTop500"),
    VIATORDEFAULT(18837, "ViatorDefault"),
    LTUR(22319, "ltur");
*/
    private int id;
    private String name;

    Partner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public static List<Partner> getPartners(){
        return Arrays.asList(Partner.values());
    }
}
