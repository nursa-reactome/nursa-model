package org.reactome.nursa.model;

import java.util.List;

public class Experiment {
    
   private String name;
   
   private List<DataPoint> dataPoints;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public List<DataPoint> getDataPoints() {
       return dataPoints;
   }

   public void setDataPoints(List<DataPoint> dataPoints) {
       this.dataPoints = dataPoints;
   }
}
