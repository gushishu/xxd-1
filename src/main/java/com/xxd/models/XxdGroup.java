package com.xxd.models;

public class XxdGroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.goods_group_id
     *
     * @mbggenerated
     */
    private Integer goodsGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.sta
     *
     * @mbggenerated
     */
    private Short sta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.no
     *
     * @mbggenerated
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.nums
     *
     * @mbggenerated
     */
    private Short nums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.start_time
     *
     * @mbggenerated
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_group.end_time
     *
     * @mbggenerated
     */
    private String endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.id
     *
     * @return the value of xxd_group.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.id
     *
     * @param id the value for xxd_group.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.uid
     *
     * @return the value of xxd_group.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.uid
     *
     * @param uid the value for xxd_group.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.goods_group_id
     *
     * @return the value of xxd_group.goods_group_id
     *
     * @mbggenerated
     */
    public Integer getGoodsGroupId() {
        return goodsGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.goods_group_id
     *
     * @param goodsGroupId the value for xxd_group.goods_group_id
     *
     * @mbggenerated
     */
    public void setGoodsGroupId(Integer goodsGroupId) {
        this.goodsGroupId = goodsGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.sta
     *
     * @return the value of xxd_group.sta
     *
     * @mbggenerated
     */
    public Short getSta() {
        return sta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.sta
     *
     * @param sta the value for xxd_group.sta
     *
     * @mbggenerated
     */
    public void setSta(Short sta) {
        this.sta = sta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.no
     *
     * @return the value of xxd_group.no
     *
     * @mbggenerated
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.no
     *
     * @param no the value for xxd_group.no
     *
     * @mbggenerated
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.nums
     *
     * @return the value of xxd_group.nums
     *
     * @mbggenerated
     */
    public Short getNums() {
        return nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.nums
     *
     * @param nums the value for xxd_group.nums
     *
     * @mbggenerated
     */
    public void setNums(Short nums) {
        this.nums = nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.start_time
     *
     * @return the value of xxd_group.start_time
     *
     * @mbggenerated
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.start_time
     *
     * @param startTime the value for xxd_group.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_group.end_time
     *
     * @return the value of xxd_group.end_time
     *
     * @mbggenerated
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_group.end_time
     *
     * @param endTime the value for xxd_group.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }
}