package com.xxd.models;

public class XxdCGoodPhotes {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_good_photos.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_good_photos.phid
     *
     * @mbggenerated
     */
    private String phid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_good_photos.album
     *
     * @mbggenerated
     */
    private String album;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_good_photos.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_c_good_photos.homePname
     *
     * @mbggenerated
     */
    private String homepname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_good_photos.id
     *
     * @return the value of xxd_c_good_photos.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_good_photos.id
     *
     * @param id the value for xxd_c_good_photos.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_good_photos.phid
     *
     * @return the value of xxd_c_good_photos.phid
     *
     * @mbggenerated
     */
    public String getPhid() {
        return phid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_good_photos.phid
     *
     * @param phid the value for xxd_c_good_photos.phid
     *
     * @mbggenerated
     */
    public void setPhid(String phid) {
        this.phid = phid == null ? null : phid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_good_photos.album
     *
     * @return the value of xxd_c_good_photos.album
     *
     * @mbggenerated
     */
    public String getAlbum() {
        return album;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_good_photos.album
     *
     * @param album the value for xxd_c_good_photos.album
     *
     * @mbggenerated
     */
    public void setAlbum(String album) {
        this.album = album == null ? null : album.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_good_photos.remark
     *
     * @return the value of xxd_c_good_photos.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_good_photos.remark
     *
     * @param remark the value for xxd_c_good_photos.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_c_good_photos.homePname
     *
     * @return the value of xxd_c_good_photos.homePname
     *
     * @mbggenerated
     */
    public String getHomepname() {
        return homepname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_c_good_photos.homePname
     *
     * @param homepname the value for xxd_c_good_photos.homePname
     *
     * @mbggenerated
     */
    public void setHomepname(String homepname) {
        this.homepname = homepname == null ? null : homepname.trim();
    }
}