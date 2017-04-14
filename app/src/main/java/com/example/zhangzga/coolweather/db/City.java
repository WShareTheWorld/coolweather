package com.example.zhangzga.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangzga on 2017/4/14.
 */

public class City extends DataSupport {
    private int id;
    private String cityNmae;
    private int intproviceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntproviceId() {

        return intproviceId;
    }

    public void setIntproviceId(int intproviceId) {
        this.intproviceId = intproviceId;
    }

    public String getCityNmae() {

        return cityNmae;
    }

    public void setCityNmae(String cityNmae) {
        this.cityNmae = cityNmae;
    }
}
