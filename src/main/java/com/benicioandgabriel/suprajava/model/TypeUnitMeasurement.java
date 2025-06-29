package com.benicioandgabriel.suprajava.model;

public enum TypeUnitMeasurement {
    INTEGER("Integer."),
    FRACTIONAL("Fractional."),
    TIME("Time.");

    private final String description;

    private TypeUnitMeasurement(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }
}
