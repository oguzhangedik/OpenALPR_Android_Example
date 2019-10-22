
package com.example.openalprexample.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("plate")
    @Expose
    public String plate;
    @SerializedName("confidence")
    @Expose
    public Double confidence;
    @SerializedName("region_confidence")
    @Expose
    public Integer regionConfidence;
    @SerializedName("vehicle_region")
    @Expose
    public VehicleRegion vehicleRegion;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("plate_index")
    @Expose
    public Integer plateIndex;
    @SerializedName("processing_time_ms")
    @Expose
    public Double processingTimeMs;
    @SerializedName("candidates")
    @Expose
    public List<Candidate> candidates = null;
    @SerializedName("coordinates")
    @Expose
    public List<Coordinate> coordinates = null;
    @SerializedName("matches_template")
    @Expose
    public Integer matchesTemplate;
    @SerializedName("requested_topn")
    @Expose
    public Integer requestedTopn;

}
