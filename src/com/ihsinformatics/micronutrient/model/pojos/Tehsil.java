package com.ihsinformatics.micronutrient.model.pojos;
// Generated Jun 15, 2015 10:01:48 AM by Hibernate Tools 4.3.1



/**
 * Tehsil generated by hbm2java
 */
public class Tehsil  implements java.io.Serializable {


     private int tehsilId;
     private String tehsilName;
     private int districtId;

    public Tehsil() {
    }

    public Tehsil(int tehsilId, String tehsilName, int districtId) {
       this.tehsilId = tehsilId;
       this.tehsilName = tehsilName;
       this.districtId = districtId;
    }
   
    public int getTehsilId() {
        return this.tehsilId;
    }
    
    public void setTehsilId(int tehsilId) {
        this.tehsilId = tehsilId;
    }
    public String getTehsilName() {
        return this.tehsilName;
    }
    
    public void setTehsilName(String tehsilName) {
        this.tehsilName = tehsilName;
    }
    public int getDistrictId() {
        return this.districtId;
    }
    
    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }




}


