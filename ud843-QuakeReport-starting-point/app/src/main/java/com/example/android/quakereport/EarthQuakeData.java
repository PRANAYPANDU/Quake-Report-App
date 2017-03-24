package com.example.android.quakereport;
public class EarthQuakeData {
    private Double range;
    private String location;
    private long date;
    private String Url;
    public EarthQuakeData(Double mrange,String mlocation,long mdate,String mUrl)
    {
        range=mrange;
        location=mlocation;
        date=mdate;
        Url=mUrl;


    }
    public Double getRange(){
        return range;
    }
    public String getLocation(){
        return location;
    }
    public long getDate(){
        return date;
    }
    public String getUrl(){
        return Url;
    }
}
