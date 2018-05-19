package com.a365weather.android.db;


import org.litepal.crud.DataSupport;
/***
 * 省表
 */
public class Province extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


    private int id;//每个实体类中的字段
    private String provinceName;//省名
    private int provinceCode;//省代号
}
