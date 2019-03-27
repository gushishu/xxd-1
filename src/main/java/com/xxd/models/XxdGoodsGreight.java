package com.xxd.models;

import java.math.BigDecimal;

/**
 * 商品运费信息
 * @author Liang
 * @version 1.0
 */

public class XxdGoodsGreight {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.area
     *
     * @mbggenerated
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.area_type
     *
     * @mbggenerated
     */
    private Short areaType;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.valuation_type
     *
     * @mbggenerated
     */
    private Short valuationType;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.basic_valuation_price
     *
     * @mbggenerated
     */
    private BigDecimal basicValuationPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.basic_valuation_area
     *
     * @mbggenerated
     */
    private Short basicValuationArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_greight.over_basic_valuation_price
     *
     * @mbggenerated
     */
    private BigDecimal overBasicValuationPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.id
     *
     * @return the value of xxd_goods_greight.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.id
     *
     * @param id the value for xxd_goods_greight.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.goods_id
     *
     * @return the value of xxd_goods_greight.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.goods_id
     *
     * @param goodsId the value for xxd_goods_greight.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.area
     *
     * @return the value of xxd_goods_greight.area
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.area
     *
     * @param area the value for xxd_goods_greight.area
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.area_type
     *
     * @return the value of xxd_goods_greight.area_type
     *
     * @mbggenerated
     */
    public Short getAreaType() {
        return areaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.area_type
     *
     * @param areaType the value for xxd_goods_greight.area_type
     *
     * @mbggenerated
     */
    public void setAreaType(Short areaType) {
        this.areaType = areaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.valuation_type
     *
     * @return the value of xxd_goods_greight.valuation_type
     *
     * @mbggenerated
     */
    public Short getValuationType() {
        return valuationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.valuation_type
     *
     * @param valuationType the value for xxd_goods_greight.valuation_type
     *
     * @mbggenerated
     */
    public void setValuationType(Short valuationType) {
        this.valuationType = valuationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.basic_valuation_price
     *
     * @return the value of xxd_goods_greight.basic_valuation_price
     *
     * @mbggenerated
     */
    public BigDecimal getBasicValuationPrice() {
        return basicValuationPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.basic_valuation_price
     *
     * @param basicValuationPrice the value for xxd_goods_greight.basic_valuation_price
     *
     * @mbggenerated
     */
    public void setBasicValuationPrice(BigDecimal basicValuationPrice) {
        this.basicValuationPrice = basicValuationPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.basic_valuation_area
     *
     * @return the value of xxd_goods_greight.basic_valuation_area
     *
     * @mbggenerated
     */
    public Short getBasicValuationArea() {
        return basicValuationArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.basic_valuation_area
     *
     * @param basicValuationArea the value for xxd_goods_greight.basic_valuation_area
     *
     * @mbggenerated
     */
    public void setBasicValuationArea(Short basicValuationArea) {
        this.basicValuationArea = basicValuationArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_greight.over_basic_valuation_price
     *
     * @return the value of xxd_goods_greight.over_basic_valuation_price
     *
     * @mbggenerated
     */
    public BigDecimal getOverBasicValuationPrice() {
        return overBasicValuationPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_greight.over_basic_valuation_price
     *
     * @param overBasicValuationPrice the value for xxd_goods_greight.over_basic_valuation_price
     *
     * @mbggenerated
     */
    public void setOverBasicValuationPrice(BigDecimal overBasicValuationPrice) {
        this.overBasicValuationPrice = overBasicValuationPrice;
    }
}