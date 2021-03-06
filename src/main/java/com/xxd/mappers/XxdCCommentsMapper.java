package com.xxd.mappers;

import com.xxd.models.XxdCComments;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_c_comments",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_c_comments (id, commid, ",
        "good_id, user_id, ",
        "parentid, description, ",
        "createtime, stat)",
        "values (#{id,jdbcType=INTEGER}, #{commid,jdbcType=VARCHAR}, ",
        "#{goodId,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{stat,jdbcType=CHAR})"
    })
    int insert(XxdCComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCCommentsSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, commid, good_id, user_id, parentid, description, createtime, stat",
        "from xxd_c_comments",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="commid", property="commid", jdbcType=JdbcType.VARCHAR),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="stat", property="stat", jdbcType=JdbcType.CHAR)
    })
    XxdCComments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCCommentsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_comments
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_c_comments",
        "set commid = #{commid,jdbcType=VARCHAR},",
          "good_id = #{goodId,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "stat = #{stat,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCComments record);
}