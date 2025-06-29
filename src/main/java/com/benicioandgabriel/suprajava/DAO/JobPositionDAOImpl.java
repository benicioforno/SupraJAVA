package com.benicioandgabriel.suprajava.DAO;

import java.util.HashMap;
import com.benicioandgabriel.suprajava.model.JobPosition;

public class JobPositionDAOImpl implements JobPositionDAO {
    private HashMap<String, JobPosition> jobPositions;

    public JobPositionDAOImpl() {
        this.jobPositions = new HashMap<String, JobPosition>();
    }

    @Override
    public boolean create(JobPosition jobPosition) {
        if (!this.jobPositions.containsKey(jobPosition.getId())) {
            this.jobPositions.put(jobPosition.getId(), jobPosition);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(JobPosition jobPosition) {
        if (this.jobPositions.containsKey(jobPosition.getId())) {
            this.jobPositions.remove(jobPosition.getId());
            return true;
        }
        return false;
    }

    @Override
    public boolean update(JobPosition jobPosition) {
        if (this.jobPositions.containsKey(jobPosition.getId())) {
            this.jobPositions.replace(jobPosition.getId(), jobPosition);
            return true;
        }
        return false;
    }

    @Override
    public HashMap<String, JobPosition> read() {
        return this.jobPositions;
    }
}
