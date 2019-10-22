
package com.example.openalprexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehicleRegion {

    @SerializedName("y")
    @Expose
    public Integer y;
    @SerializedName("x")
    @Expose
    public Integer x;
    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("width")
    @Expose
    public Integer width;

}
