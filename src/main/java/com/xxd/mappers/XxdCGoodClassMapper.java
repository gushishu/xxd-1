package com.xxd.mappers;

import com.xxd.models.XxdCGoodClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCGoodClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_c_good_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_c_good_class (id, classid, ",
        "classname, parentid, ",
        "sort_no, isparent)",
        "values (#{id,jdbcType=INTEGER}, #{classid,jdbcType=VARCHAR}, ",
        "#{classname,jdbcType=VARCHAR}, #{parentid,jdbcType=VARCHAR}, ",
        "#{sortNo,jdbcType=SMALLINT}, #{isparent,jdbcType=CHAR})"
    })
    int insert(XxdCGoodClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCGoodClassSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCGoodClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, classid, classname, parentid, sort_no, isparent",
        "from xxd_c_good_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="classid", property="classid", jdbcType=JdbcType.VARCHAR),
        @Result(column="classname", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort_no", property="sortNo", jdbcType=JdbcType.SMALLINT),
        @Result(column="isparent", property="isparent", jdbcType=JdbcType.CHAR)
    })
    XxdCGoodClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCGoodClassSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCGoodClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_good_class
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_c_good_class",
        "set classid = #{classid,jdbcType=VARCHAR},",
          "classname = #{classname,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=VARCHAR},",
          "sort_no = #{sortNo,jdbcType=SMALLINT},",
          "isparent = #{isparent,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCGoodClass record);
}