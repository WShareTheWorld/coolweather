package com.example.zhangzga.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangzga on 2017/4/14.
 */

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProviceName() {

        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
