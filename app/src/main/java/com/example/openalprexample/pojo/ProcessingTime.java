
package com.example.openalprexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProcessingTime {

    @SerializedName("plates")
    @Expose
    public Double plates;
    @SerializedName("total")
    @Expose
    public Double total;

}
