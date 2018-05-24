package com.company.monitor;

import java.io.Serializable;

public class Monitor implements Serializable {

    private String brandName;
    private Integer inch;
    private Integer year;

    public Monitor(String brandName, Integer inch, Integer year) {
        this.brandName = brandName;
        this.inch = inch;
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getInch() {
        return inch;
    }

    public void setInch(Integer inch) {
        this.inch = inch;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brandName='" + brandName + '\'' +
                ", inch=" + inch +
                ", year=" + year +
                '}';
    }
}
