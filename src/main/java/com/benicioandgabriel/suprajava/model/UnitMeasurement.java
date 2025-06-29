package com.benicioandgabriel.suprajava.model;

public class UnitMeasurement {
    // private Long id;
    private String name;
    private String abbreviation;
    private TypeUnitMeasurement typeUnitMeasurement; // Composition

    // Constructor
    public UnitMeasurement(String name, String abbreviation, TypeUnitMeasurement typeUnitMeasurement) {
        setName(name);
        setAbbreviation(abbreviation);
        setTypeUnitMeasurement(typeUnitMeasurement);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    private void setTypeUnitMeasurement(TypeUnitMeasurement typeUnitMeasurement) {
        if (this.getTypeUnitMeasurement() == null)
            this.typeUnitMeasurement = typeUnitMeasurement;
        else if (this.getTypeUnitMeasurement() != null)
            throw new IllegalArgumentException("Cannot change product type");
    }

    public TypeUnitMeasurement getTypeUnitMeasurement() {
        return this.typeUnitMeasurement;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ";\nAbbreviation: " + getAbbreviation() + ";\nType of measurement unit: "
                + this.getTypeUnitMeasurement().getDescription();
    }
}
