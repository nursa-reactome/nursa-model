package org.reactome.nursa.model;

public class DataPoint {
    private String symbol;
    private double pvalue;
    private double foldChange;
    
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // The preferred property name is pValue with getPValue/setPValue
    // accessors. However, the Jackson deserializer ignores the
    // JSON pValue field with those accessors. The @JsonProperty
    // annotation rectifies this problem. However, on the client
    // side the Resty deserializer ignores the Jackson annotation
    // and expects *both* getPvalue/setPvalue *and* getpValue/setpValue
    // accessors. However, aliasing those accessors to the preferred
    // accessors has the side-effect of inducing Jackson to serialize
    // *two* separate JSON fields pvalue and pValue. The work-around
    // to this rat's nest is to name the field pvalue with
    // getPvalue/setPvalue accessors.
    public double getPvalue() {
        return pvalue;
    }
    
    public void setPvalue(double pvalue) {
        this.pvalue = pvalue;
    }
    
    public double getFoldChange() {
        return foldChange;
    }
    
    public void setFoldChange(double foldChange) {
        this.foldChange = foldChange;
    }
}