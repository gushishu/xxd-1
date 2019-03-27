package com.xxd.mappers;

import com.xxd.models.XxdCashOrder;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCashOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_cash_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_cash_order (id, uid, ",
        "time, price, sta, ",
        "fail_reason)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{time,jdbcType=VARCHAR}, #{price,jdbcType=DECIMAL}, #{sta,jdbcType=SMALLINT}, ",
        "#{failReason,jdbcType=VARCHAR})"
    })
    int insert(XxdCashOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCashOrderSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCashOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, uid, time, price, sta, fail_reason",
        "from xxd_cash_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="fail_reason", property="failReason", jdbcType=JdbcType.VARCHAR)
    })
    XxdCashOrder selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, uid, time, price, sta, fail_reason",
        "from xxd_cash_order"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="fail_reason", property="failReason", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<XxdCashOrder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCashOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCashOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_cash_order
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_cash_order",
        "set uid = #{uid,jdbcType=INTEGER},",
          "time = #{time,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=DECIMAL},",
          "sta = #{sta,jdbcType=SMALLINT},",
          "fail_reason = #{failReason,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCashOrder record);
}