package cn.edu.xust.bean;

import java.math.BigDecimal;

/**
 * 电表实体类
 *
 * @author ：huangxin
 * @modified ：
 * @since ：2020/02/18 18:28
 */
public class ElectricMeter {


    /**
     * 电表号：DLT645协议中的地址码
     */
    private String electricMeterId;
    /**
     * 余额
     */
    private BigDecimal userBalance;
    /**
     * 电价
     */
    private BigDecimal electricityPrice;
    /**
     * 当前总用电量
     */
    private Double currentTotalElectricity;
    /**
     * 当前超峰时总用电量
     */
    private Double currentTotalSuperPeakElectricity;
    /**
     * 当前峰时总用电量
     */
    private Double currentTotalPeakElectricity;
    /**
     * 当前正常时间总用电量
     */
    private Double currentTotalNormalElectricity;
    /**
     * 当前谷时总用电量
     */
    private Double currentTotalValleyElectricity;

    /**
     * 电表IP
     */
    private String electricityIp;

    /**
     * 电表的区域
     */
    private String electricityArea;


    public String getElectricMeterId() {
        return electricMeterId;
    }

    public void setElectricMeterId(String electricMeterId) {
        this.electricMeterId = electricMeterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.user_balance
     *
     * @return the value of electric_meter.user_balance
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.user_balance
     *
     * @param userBalance the value for electric_meter.user_balance
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.electricity_ip
     *
     * @return the value of electric_meter.electricity_ip
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public String getElectricityIp() {
        return electricityIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.electricity_ip
     *
     * @param electricityIp the value for electric_meter.electricity_ip
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setElectricityIp(String electricityIp) {
        this.electricityIp = electricityIp == null ? null : electricityIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.electricity_price
     *
     * @return the value of electric_meter.electricity_price
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public BigDecimal getElectricityPrice() {
        return electricityPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.electricity_price
     *
     * @param electricityPrice the value for electric_meter.electricity_price
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setElectricityPrice(BigDecimal electricityPrice) {
        this.electricityPrice = electricityPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.electricity_area
     *
     * @return the value of electric_meter.electricity_area
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public String getElectricityArea() {
        return electricityArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.electricity_area
     *
     * @param electricityArea the value for electric_meter.electricity_area
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setElectricityArea(String electricityArea) {
        this.electricityArea = electricityArea == null ? null : electricityArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.current_total_electricity
     *
     * @return the value of electric_meter.current_total_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public Double getCurrentTotalElectricity() {
        return currentTotalElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.current_total_electricity
     *
     * @param currentTotalElectricity the value for electric_meter.current_total_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setCurrentTotalElectricity(Double currentTotalElectricity) {
        this.currentTotalElectricity = currentTotalElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.current_total_super_peak_electricity
     *
     * @return the value of electric_meter.current_total_super_peak_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public Double getCurrentTotalSuperPeakElectricity() {
        return currentTotalSuperPeakElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.current_total_super_peak_electricity
     *
     * @param currentTotalSuperPeakElectricity the value for electric_meter.current_total_super_peak_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setCurrentTotalSuperPeakElectricity(Double currentTotalSuperPeakElectricity) {
        this.currentTotalSuperPeakElectricity = currentTotalSuperPeakElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.current_total_peak_electricity
     *
     * @return the value of electric_meter.current_total_peak_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public Double getCurrentTotalPeakElectricity() {
        return currentTotalPeakElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.current_total_peak_electricity
     *
     * @param currentTotalPeakElectricity the value for electric_meter.current_total_peak_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setCurrentTotalPeakElectricity(Double currentTotalPeakElectricity) {
        this.currentTotalPeakElectricity = currentTotalPeakElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.current_total_normal_electricity
     *
     * @return the value of electric_meter.current_total_normal_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public Double getCurrentTotalNormalElectricity() {
        return currentTotalNormalElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.current_total_normal_electricity
     *
     * @param currentTotalNormalElectricity the value for electric_meter.current_total_normal_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setCurrentTotalNormalElectricity(Double currentTotalNormalElectricity) {
        this.currentTotalNormalElectricity = currentTotalNormalElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electric_meter.current_total_valley_electricity
     *
     * @return the value of electric_meter.current_total_valley_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public Double getCurrentTotalValleyElectricity() {
        return currentTotalValleyElectricity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electric_meter.current_total_valley_electricity
     *
     * @param currentTotalValleyElectricity the value for electric_meter.current_total_valley_electricity
     * @mbg.generated Thu Feb 20 18:11:23 CST 2020
     */
    public void setCurrentTotalValleyElectricity(Double currentTotalValleyElectricity) {
        this.currentTotalValleyElectricity = currentTotalValleyElectricity;
    }
}