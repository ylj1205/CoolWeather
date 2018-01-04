package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 2018/1/3.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carWsah;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class Carwash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
