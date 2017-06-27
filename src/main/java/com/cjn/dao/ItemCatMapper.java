package com.cjn.dao;

import com.cjn.entity.ItemCat;

import java.math.BigDecimal;
import java.util.List;

public interface ItemCatMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    ItemCat selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ItemCat record);

    int updateByPrimaryKey(ItemCat record);

    /**
     * 查询商品类目下拉列表
     * @return
     */
    List<ItemCat> selectItemCat();
}