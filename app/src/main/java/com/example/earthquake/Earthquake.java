package com.example.earthquake;




public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSecond;
    private String murl;

    public Earthquake(double magnitude,String location,long date,String siteUrl)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliSecond=date;
        murl=siteUrl;
    }
    public double getMagnitude() { return mMagnitude; }
    public String getLocation(){return mLocation;}
    public long getTimeInMilliSecond(){return mTimeInMilliSecond;}
    public String getUrl() { return murl; }

}
