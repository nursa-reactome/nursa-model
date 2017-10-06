package org.reactome.web.pwp.nursa.model;

public class DataSetPathway {
    public enum RegulationType {
        UP,
        DOWN
    };

    private String description;
    private double pValue;
    private double fdr;
    private RegulationType regulationType;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPValue() {
        return pValue;
    }
    
    public void setPValue(double pValue) {
        this.pValue = pValue;
    }
    
    // Resty JSON decoder insists on getfDR()/setfDR() as the
    // getter/setter for the fdr field.
    public double getfDR() {
        return fdr;
    }
    
    public void setfDR(double fdr) {
        this.fdr = fdr;
    }
    
    public double getFDR() {
        return fdr;
    }
    
    public void setFDR(double fdr) {
        this.fdr = fdr;
    }
    
    public RegulationType getRegulationType() {
        return regulationType;
    }
    
    public void setRegulationType(RegulationType regulationType) {
        this.regulationType = regulationType;
    }
}
