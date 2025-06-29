package com.benicioandgabriel.suprajava.DAO;

import java.util.HashMap;

import com.benicioandgabriel.suprajava.model.JobPosition;

public interface JobPositionDAO {
    public boolean create(JobPosition jobPosition);

    public boolean delete(JobPosition jobPosition);

    public boolean update(JobPosition jobPosition);

    public HashMap<String, JobPosition> read();
}
