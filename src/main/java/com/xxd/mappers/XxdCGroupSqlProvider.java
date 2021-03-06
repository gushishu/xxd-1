package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdCGroup;

public class XxdCGroupSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_group
     *
     * @mbggenerated
     */
    public String insertSelective(XxdCGroup record) {
        BEGIN();
        INSERT_INTO("xxd_c_group");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGroupid() != null) {
            VALUES("groupid", "#{groupid,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerId() != null) {
            VALUES("manager_id", "#{managerId,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupname() != null) {
            VALUES("groupname", "#{groupname,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getNotice() != null) {
            VALUES("notice", "#{notice,jdbcType=VARCHAR}");
        }
        
        if (record.getHomegroup() != null) {
            VALUES("homegroup", "#{homegroup,jdbcType=VARCHAR}");
        }
        
        if (record.getStat() != null) {
            VALUES("stat", "#{stat,jdbcType=CHAR}");
        }
        
        if (record.getProxynum() != null) {
            VALUES("proxynum", "#{proxynum,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_group
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdCGroup record) {
        BEGIN();
        UPDATE("xxd_c_group");
        
        if (record.getGroupid() != null) {
            SET("groupid = #{groupid,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerId() != null) {
            SET("manager_id = #{managerId,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupname() != null) {
            SET("groupname = #{groupname,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getNotice() != null) {
            SET("notice = #{notice,jdbcType=VARCHAR}");
        }
        
        if (record.getHomegroup() != null) {
            SET("homegroup = #{homegroup,jdbcType=VARCHAR}");
        }
        
        if (record.getStat() != null) {
            SET("stat = #{stat,jdbcType=CHAR}");
        }
        
        if (record.getProxynum() != null) {
            SET("proxynum = #{proxynum,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}