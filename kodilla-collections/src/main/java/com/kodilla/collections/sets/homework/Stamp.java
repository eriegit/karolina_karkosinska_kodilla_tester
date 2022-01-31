package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private boolean stampStamped;

    public Stamp(String stampName, double stampHeight, double stampWidth, boolean stampStamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stampStamped = stampStamped;
    }
// TODO Dlaczego mimo zakomentowania getterów apka nadal działa?

//    public String getStampName() {
//        return stampName;
//    }
//
//    public double getStampHeight() {
//        return stampHeight;
//    }
//
//    public double getStampWidth() {
//        return stampWidth;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeight, stampHeight) == 0 && Double.compare(stamp.stampWidth, stampWidth) == 0 && stampStamped == stamp.stampStamped && stampName.equals(stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWidth, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "  Name '" + stampName + '\'' +
                ", Height " + stampHeight +
                ", Width " + stampWidth +
                ", Stamped " + stampStamped +
                '}';
    }

//    public boolean isStampStamped() {
//        return stampStamped;
//    }

}


