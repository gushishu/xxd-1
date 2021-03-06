package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdCProxyAreaGood;

public class XxdCProxyAreaGoodSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_proxy_area_good
     *
     * @mbggenerated
     */
    public String insertSelective(XxdCProxyAreaGood record) {
        BEGIN();
        INSERT_INTO("xxd_c_proxy_area_good");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAreaId() != null) {
            VALUES("area_id", "#{areaId,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodId() != null) {
            VALUES("good_id", "#{goodId,jdbcType=VARCHAR}");
        }
        
        if (record.getCommision() != null) {
            VALUES("commision", "#{commision,jdbcType=REAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_proxy_area_good
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdCProxyAreaGood record) {
        BEGIN();
        UPDATE("xxd_c_proxy_area_good");
        
        if (record.getAreaId() != null) {
            SET("area_id = #{areaId,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodId() != null) {
            SET("good_id = #{goodId,jdbcType=VARCHAR}");
        }
        
        if (record.getCommision() != null) {
            SET("commision = #{commision,jdbcType=REAL}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}