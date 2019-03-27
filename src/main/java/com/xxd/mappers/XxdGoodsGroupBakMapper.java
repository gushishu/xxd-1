package com.xxd.mappers;

import com.xxd.models.XxdGoodsGroup;
import com.xxd.models.XxdGoodsGroupBak;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdGoodsGroupBakMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_goods_group_bak",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_goods_group_bak (id, goods_id, ",
        "group_num, group_start_time, ",
        "group_end_time, group_sta, ",
        "group_vaild_time, group_times, ",
        "time, group_picture, ",
        "group_title)",
        "values (#{id,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{groupNum,jdbcType=SMALLINT}, #{groupStartTime,jdbcType=VARCHAR}, ",
        "#{groupEndTime,jdbcType=VARCHAR}, #{groupSta,jdbcType=SMALLINT}, ",
        "#{groupVaildTime,jdbcType=SMALLINT}, #{groupTimes,jdbcType=INTEGER}, ",
        "#{time,jdbcType=VARCHAR}, #{groupPicture,jdbcType=VARCHAR}, ",
        "#{groupTitle,jdbcType=VARCHAR})"
    })
    int insert(XxdGoodsGroupBak record);
    
    @Insert({
        "insert into xxd_goods_group_bak (id, goods_id, ",
        "group_num, group_start_time, ",
        "group_end_time, group_sta, ",
        "group_vaild_time, group_times, ",
        "time, group_picture, ",
        "group_title)",
        "values (#{id,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{groupNum,jdbcType=SMALLINT}, #{groupStartTime,jdbcType=VARCHAR}, ",
        "#{groupEndTime,jdbcType=VARCHAR}, #{groupSta,jdbcType=SMALLINT}, ",
        "#{groupVaildTime,jdbcType=SMALLINT}, #{groupTimes,jdbcType=INTEGER}, ",
        "#{time,jdbcType=VARCHAR}, #{groupPicture,jdbcType=VARCHAR}, ",
        "#{groupTitle,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insertGoodsGroup(XxdGoodsGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdGoodsGroupBakSqlProvider.class, method="insertSelective")
    int insertSelective(XxdGoodsGroupBak record);
    
    @Insert({
        "insert into",
        "xxd_goods_group_bak(id, goods_id, group_num, group_start_time, group_end_time, group_sta, group_vaild_time, group_times, time, group_picture, group_title)",
        "select id, goods_id, group_num, group_start_time, group_end_time, group_sta, group_vaild_time, group_times, time, group_picture, group_title",
        "from xxd_goods_group",
        "where group_end_time = date_format(now(), '%Y-%m-%d 22:00:00')"
    })
    int insertFromOverGroup();
    
    @Delete({
        "delete from xxd_goods_group",
        "where group_end_time = date_format(now(), '%Y-%m-%d 22:00:00')"
    })
    int deleteFromOverGroup();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, goods_id, group_num, group_start_time, group_end_time, group_sta, group_vaild_time, ",
        "group_times, time, group_picture, group_title",
        "from xxd_goods_group_bak",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="group_num", property="groupNum", jdbcType=JdbcType.SMALLINT),
        @Result(column="group_start_time", property="groupStartTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_end_time", property="groupEndTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_sta", property="groupSta", jdbcType=JdbcType.SMALLINT),
        @Result(column="group_vaild_time", property="groupVaildTime", jdbcType=JdbcType.SMALLINT),
        @Result(column="group_times", property="groupTimes", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_picture", property="groupPicture", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_title", property="groupTitle", jdbcType=JdbcType.VARCHAR)
    })
    XxdGoodsGroupBak selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdGoodsGroupBakSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdGoodsGroupBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_group_bak
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_goods_group_bak",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "group_num = #{groupNum,jdbcType=SMALLINT},",
          "group_start_time = #{groupStartTime,jdbcType=VARCHAR},",
          "group_end_time = #{groupEndTime,jdbcType=VARCHAR},",
          "group_sta = #{groupSta,jdbcType=SMALLINT},",
          "group_vaild_time = #{groupVaildTime,jdbcType=SMALLINT},",
          "group_times = #{groupTimes,jdbcType=INTEGER},",
          "time = #{time,jdbcType=VARCHAR},",
          "group_picture = #{groupPicture,jdbcType=VARCHAR},",
          "group_title = #{groupTitle,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdGoodsGroupBak record);
}