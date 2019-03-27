package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdGoodsPriceFlashBak;

public class XxdGoodsPriceFlashBakSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_flash_bak
     *
     * @mbggenerated
     */
    public String insertSelective(XxdGoodsPriceFlashBak record) {
        BEGIN();
        INSERT_INTO("xxd_goods_price_flash_bak");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsFlashBakId() != null) {
            VALUES("goods_flash_bak_id", "#{goodsFlashBakId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPriceStock() != null) {
            VALUES("goods_price_stock", "#{goodsPriceStock,jdbcType=INTEGER}");
        }
        
        if (record.getFormatName() != null) {
            VALUES("format_name", "#{formatName,jdbcType=VARCHAR}");
        }
        
        if (record.getMarketPrice() != null) {
            VALUES("market_price", "#{marketPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMemberPrice() != null) {
            VALUES("member_price", "#{memberPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFlashMemberPrice() != null) {
            VALUES("flash_member_price", "#{flashMemberPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImg() != null) {
            VALUES("img", "#{img,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsPriceStockBak() != null) {
            VALUES("goods_price_stock_bak", "#{goodsPriceStockBak,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_flash_bak
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdGoodsPriceFlashBak record) {
        BEGIN();
        UPDATE("xxd_goods_price_flash_bak");
        
        if (record.getGoodsFlashBakId() != null) {
            SET("goods_flash_bak_id = #{goodsFlashBakId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsPriceStock() != null) {
            SET("goods_price_stock = #{goodsPriceStock,jdbcType=INTEGER}");
        }
        
        if (record.getFormatName() != null) {
            SET("format_name = #{formatName,jdbcType=VARCHAR}");
        }
        
        if (record.getMarketPrice() != null) {
            SET("market_price = #{marketPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMemberPrice() != null) {
            SET("member_price = #{memberPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFlashMemberPrice() != null) {
            SET("flash_member_price = #{flashMemberPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImg() != null) {
            SET("img = #{img,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodsPriceStockBak() != null) {
            SET("goods_price_stock_bak = #{goodsPriceStockBak,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}