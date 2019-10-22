
package com.example.openalprexample.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("uuid")
    @Expose
    public String uuid;
    @SerializedName("data_type")
    @Expose
    public String dataType;
    @SerializedName("epoch_time")
    @Expose
    public Long epochTime;
    @SerializedName("processing_time")
    @Expose
    public ProcessingTime processingTime;
    @SerializedName("img_height")
    @Expose
    public Integer imgHeight;
    @SerializedName("img_width")
    @Expose
    public Integer imgWidth;
    @SerializedName("results")
    @Expose
    public List<Result> results = null;
    @SerializedName("credits_monthly_used")
    @Expose
    public Integer creditsMonthlyUsed;
    @SerializedName("version")
    @Expose
    public Integer version;
    @SerializedName("credits_monthly_total")
    @Expose
    public Integer creditsMonthlyTotal;
    @SerializedName("error")
    @Expose
    public Boolean error;
    @SerializedName("regions_of_interest")
    @Expose
    public List<RegionsOfInterest> regionsOfInterest = null;
    @SerializedName("credit_cost")
    @Expose
    public Integer creditCost;

}
