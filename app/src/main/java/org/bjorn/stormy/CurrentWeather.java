package org.bjorn.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by bjorn on 3/22/16.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimezone;

    public String getmTimezone() {
        return mTimezone;
    }

    public void setmTimezone(String mTimezone) {
        this.mTimezone = mTimezone;
    }



    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    //  clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
    public int getIconId(){
        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")){
            iconId = R.drawable.clear_day;
        } else if (mIcon.equals("rain")){
            iconId = R.drawable.rain;
        } else if (mIcon.equals("snow")){
            iconId = R.drawable.snow;
        } else if (mIcon.equals("sleet")){
            iconId = R.drawable.sleet;
        } else if (mIcon.equals("wind")){
            iconId = R.drawable.wind;
        } else if (mIcon.equals("fog")){
            iconId = R.drawable.fog;
        } else if (mIcon.equals("cloudy")){
            iconId = R.drawable.cloudy;
        } else if (mIcon.equals("partly-cloudy-day")){
            iconId = R.drawable.partly_cloudy;
        } else if (mIcon.equals("partly-cloudy-night")){
            iconId = R.drawable.partly_cloudy;
        }

        return iconId;

    }

    public long getmTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimezone));
        Date dateTime = new Date(getmTime()*1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setmTime(long mTime) {
        this.mTime = mTime;
    }

    public double getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(double mTemperature) {
        this.mTemperature = mTemperature;
    }

    public double getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(double mHumidity) {
        this.mHumidity = mHumidity;
    }

    public double getmPrecipChance() {
        return mPrecipChance;
    }

    public void setmPrecipChance(double mPrecipChance) {
        this.mPrecipChance = mPrecipChance;
    }

    public String getmSummary() {
        return mSummary;
    }

    public void setmSummary(String mSummary) {
        this.mSummary = mSummary;
    }
}
