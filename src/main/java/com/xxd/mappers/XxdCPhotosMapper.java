package com.xxd.mappers;

import com.xxd.models.XxdCPhotos;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCPhotosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_c_photos",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_c_photos (id, pid, ",
        "good_ph_id, comm_id, ",
        "album, hrefaddr, ",
        "remark, type)",
        "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=VARCHAR}, ",
        "#{goodPhId,jdbcType=VARCHAR}, #{commId,jdbcType=VARCHAR}, ",
        "#{album,jdbcType=VARCHAR}, #{hrefaddr,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{type,jdbcType=CHAR})"
    })
    int insert(XxdCPhotos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCPhotosSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCPhotos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, pid, good_ph_id, comm_id, album, hrefaddr, remark, type",
        "from xxd_c_photos",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="good_ph_id", property="goodPhId", jdbcType=JdbcType.VARCHAR),
        @Result(column="comm_id", property="commId", jdbcType=JdbcType.VARCHAR),
        @Result(column="album", property="album", jdbcType=JdbcType.VARCHAR),
        @Result(column="hrefaddr", property="hrefaddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR)
    })
    XxdCPhotos selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCPhotosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCPhotos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_photos
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_c_photos",
        "set pid = #{pid,jdbcType=VARCHAR},",
          "good_ph_id = #{goodPhId,jdbcType=VARCHAR},",
          "comm_id = #{commId,jdbcType=VARCHAR},",
          "album = #{album,jdbcType=VARCHAR},",
          "hrefaddr = #{hrefaddr,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCPhotos record);
}