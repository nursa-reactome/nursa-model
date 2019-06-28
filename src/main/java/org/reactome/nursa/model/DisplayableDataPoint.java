package org.reactome.nursa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DisplayableDataPoint extends {@link DataPoint} with the
 * {@link #isReactome()} flag.
 *
 * @author Fred Loney <loneyf@ohsu.edu>
 */
public class DisplayableDataPoint extends DataPoint {
    private boolean isReactome;

    // no-argument constructor is required by the JSON encoder.
    public DisplayableDataPoint() {
    }

    /**
     * Wraps the given data point.
     * 
     * @param dataPoint
     * @param isReactome
     */
    public DisplayableDataPoint(DataPoint dataPoint, boolean isReactome) {
        this.setSymbol(dataPoint.getSymbol());
        this.setPvalue(dataPoint.getPvalue());
        this.setFoldChange(dataPoint.getFoldChange());
        this.isReactome = isReactome;
    }

    /**
     * @return whether this data point's gene is in reactome
     */
    @JsonProperty(value="isReactome")
    public boolean isReactome() {
        return isReactome;
    }

    public void setReactome(boolean isReactome) {
        this.isReactome = isReactome;
    }

}
