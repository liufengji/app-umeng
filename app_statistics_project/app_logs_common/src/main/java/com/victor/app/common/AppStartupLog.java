package com.victor.app.common;

/**
 * @author liufengji
 */
public class AppStartupLog extends AppBaseLog {

    /**
     * 国家，终端不用上报，服务器自动填充该属性
     */
    private String country;
    /**
     * 省份，终端不用上报，服务器自动填充该属性
     */
    private String province;
    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 网络
     */
    private String network;
    /**
     * 运营商
     */
    private String carrier;

    /**
     * 品牌
     */
    private String brand;
    /**
     * 分辨率
     */
    private String screenSize;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
