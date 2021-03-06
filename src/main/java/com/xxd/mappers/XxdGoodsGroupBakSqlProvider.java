package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdGoodsGroupBak;

public class XxdGoodsGroupBakSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    public String insertSelective(XxdGoodsGroupBak record) {
        BEGIN();
        INSERT_INTO("xxd_goods_group_bak");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGroupNum() != null) {
            VALUES("group_num", "#{groupNum,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupStartTime() != null) {
            VALUES("group_start_time", "#{groupStartTime,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupEndTime() != null) {
            VALUES("group_end_time", "#{groupEndTime,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupSta() != null) {
            VALUES("group_sta", "#{groupSta,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupVaildTime() != null) {
            VALUES("group_vaild_time", "#{groupVaildTime,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupTimes() != null) {
            VALUES("group_times", "#{groupTimes,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupPicture() != null) {
            VALUES("group_picture", "#{groupPicture,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupTitle() != null) {
            VALUES("group_title", "#{groupTitle,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdGoodsGroupBak record) {
        BEGIN();
        UPDATE("xxd_goods_group_bak");
        
        if (record.getGoodsId() != null) {
            SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGroupNum() != null) {
            SET("group_num = #{groupNum,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupStartTime() != null) {
            SET("group_start_time = #{groupStartTime,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupEndTime() != null) {
            SET("group_end_time = #{groupEndTime,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupSta() != null) {
            SET("group_sta = #{groupSta,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupVaildTime() != null) {
            SET("group_vaild_time = #{groupVaildTime,jdbcType=SMALLINT}");
        }
        
        if (record.getGroupTimes() != null) {
            SET("group_times = #{groupTimes,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupPicture() != null) {
            SET("group_picture = #{groupPicture,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupTitle() != null) {
            SET("group_title = #{groupTitle,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}