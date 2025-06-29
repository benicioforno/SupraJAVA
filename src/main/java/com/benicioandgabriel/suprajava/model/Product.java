package com.benicioandgabriel.suprajava.model;

public class Product {
    private String name;
    private UnitMeasurement unitMeasurement;

    public Product(String name, UnitMeasurement unitMeasurement) {
        setName(name);
        setUnitMeasurement(unitMeasurement);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setUnitMeasurement(UnitMeasurement unitMeasurement) {
        if (this.getUnitMeasurement() == null) {
            this.unitMeasurement = unitMeasurement;
        } else if (this.getUnitMeasurement() != null) {
            throw new IllegalArgumentException("Cannot change product type.");
        }
    }

    public UnitMeasurement getUnitMeasurement() {
        return this.unitMeasurement;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ";\n\nUnitMeasurement:\n" + getUnitMeasurement();
    }
}
