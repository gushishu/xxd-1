package com.xxd.models;

import java.util.Date;

public class XxdCGroupArea {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.group_id
     *
     * @mbggenerated
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.area_id
     *
     * @mbggenerated
     */
    private String areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.startdate
     *
     * @mbggenerated
     */
    private Date startdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.enddate
     *
     * @mbggenerated
     */
    private Date enddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.stat
     *
     * @mbggenerated
     */
    private String stat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_group_area.cause
     *
     * @mbggenerated
     */
    private String cause;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.id
     *
     * @return the value of xxd_c_group_area.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.id
     *
     * @param id the value for xxd_c_group_area.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.group_id
     *
     * @return the value of xxd_c_group_area.group_id
     *
     * @mbggenerated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.group_id
     *
     * @param groupId the value for xxd_c_group_area.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.area_id
     *
     * @return the value of xxd_c_group_area.area_id
     *
     * @mbggenerated
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.area_id
     *
     * @param areaId the value for xxd_c_group_area.area_id
     *
     * @mbggenerated
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.startdate
     *
     * @return the value of xxd_c_group_area.startdate
     *
     * @mbggenerated
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.startdate
     *
     * @param startdate the value for xxd_c_group_area.startdate
     *
     * @mbggenerated
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.enddate
     *
     * @return the value of xxd_c_group_area.enddate
     *
     * @mbggenerated
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.enddate
     *
     * @param enddate the value for xxd_c_group_area.enddate
     *
     * @mbggenerated
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.stat
     *
     * @return the value of xxd_c_group_area.stat
     *
     * @mbggenerated
     */
    public String getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.stat
     *
     * @param stat the value for xxd_c_group_area.stat
     *
     * @mbggenerated
     */
    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_group_area.cause
     *
     * @return the value of xxd_c_group_area.cause
     *
     * @mbggenerated
     */
    public String getCause() {
        return cause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_group_area.cause
     *
     * @param cause the value for xxd_c_group_area.cause
     *
     * @mbggenerated
     */
    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }
}