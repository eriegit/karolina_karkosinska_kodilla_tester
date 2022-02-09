package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeightCm; // podaj w czym wyrażone wartości inch/cm można też int mm

    private double stampWidthCm;
    private boolean stampStamped;

    public Stamp(String stampName, double stampHeightCm, double stampWidthCm, boolean stampStamped) {
        this.stampName = stampName;
        this.stampHeightCm = stampHeightCm;
        this.stampWidthCm = stampWidthCm;
        this.stampStamped = stampStamped;
    }

//    public String getStampName() {
//        return stampName;
//    }
//
//    public double getStampHeightCm() {
//        return stampHeightCm;
//    }
//
//    public double getStampWidthCm() {
//        return stampWidthCm;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeightCm, stampHeightCm) == 0 && Double.compare(stamp.stampWidthCm, stampWidthCm) == 0 && stampStamped == stamp.stampStamped && stampName.equals(stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeightCm, stampWidthCm, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamp" +
                "  Name " + stampName  +
                ", Height " + stampHeightCm +
                ", Width " + stampWidthCm +
                ", Stamped " + stampStamped; //TODO print true = stamped, false = not stamped
    }

//    public boolean isStampStamped() {
//        return stampStamped;
//    }

}


