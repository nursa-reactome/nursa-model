package org.reactome.nursa.model;

import java.util.List;

public class DataSetSearchResult {

    private int numFound;
    
    private List<DataSet> datasets;

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public List<DataSet> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DataSet> datasets) {
        this.datasets = datasets;
    }
}
