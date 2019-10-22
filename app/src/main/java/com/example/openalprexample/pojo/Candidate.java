
package com.example.openalprexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Candidate {

    @SerializedName("matches_template")
    @Expose
    public Integer matchesTemplate;
    @SerializedName("plate")
    @Expose
    public String plate;
    @SerializedName("confidence")
    @Expose
    public Double confidence;

}
