package org.reactome.web.pwp.nursa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSetPathway {
    public enum RegulationType {
        UP("Up"),
        DOWN("Down");
        
        private final String repr;
        
        private RegulationType(final String repr) {
            this.repr = repr;
        }
        
        @Override
        public String toString() {
            return this.repr;
        }
    };

    private String name;
    private double pvalue;
    private double fdr;
    private RegulationType regulationType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPvalue() {
        return pvalue;
    }
    
    @JsonProperty("pvalue")
    public void setPvalue(double pvalue) {
        this.pvalue = pvalue;
    }
    
    public double getFdr() {
        return fdr;
    }
    
    public void setFdr(double fdr) {
        this.fdr = fdr;
    }
    
    public RegulationType getRegulationType() {
        return regulationType;
    }
    
    public void setRegulationType(RegulationType regulationType) {
        this.regulationType = regulationType;
    }
}
