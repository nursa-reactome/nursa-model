package org.reactome.nursa.model;

import java.util.List;

/**
 * @author Fred Loney <loneyf@ohsu.edu>
 */
public class DataSet {

    private String doi;
     
    private String name;
    
    private String description;

    private List<Experiment> experiments;

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Experiment> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiment> experiments) {
        this.experiments = experiments;
    }
}
