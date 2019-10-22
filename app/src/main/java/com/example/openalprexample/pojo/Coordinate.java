
package com.example.openalprexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coordinate {

    @SerializedName("y")
    @Expose
    public Integer y;
    @SerializedName("x")
    @Expose
    public Integer x;

}
