package org.reactome.web.pwp.nursa.model;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Fred Loney <loneyf@ohsu.edu>
 */
@SuppressWarnings("unused")
public class DataSet {

    private String doi;
     
    private String name;
    
    private String description;

    private List<DataPoint> dataPoints;

    private List<DataSetPathway> pathways;

    @JsonProperty("doi")
    public String getDOI() {
        return doi;
    }

    @JsonProperty("doi")
    public void setDOI(String doi) {
        this.doi = doi;
    }

    // Resty uses the default Jackson data binding field
    // name conversion convention, but ignores the Jackson
    // property annotation. Thus, Resty insists on
    // getdOI/setdOI rather than getDOI/setDOI.
    public String getdOI() {
        return doi;
    }

    public void setdOI(String doi) {
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

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public List<DataSetPathway> getPathways() {
        return pathways;
    }

    public void setPathways(List<DataSetPathway> pathways) {
        this.pathways = pathways;
    }
}
