package com.example.zhangzga.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangzga on 2017/4/14.
 */

public class County extends DataSupport {
    private int id;
    private String countName;
    private int cityId;
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {

        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public int getCityId() {

        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
