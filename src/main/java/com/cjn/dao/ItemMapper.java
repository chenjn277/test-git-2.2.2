package com.cjn.dao;

import com.cjn.entity.Item;
import com.cjn.util.PageUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public interface ItemMapper {

    /**
     * 根据ID删除
     * @param item
     * @return
     */
    int deleteById(Item item);

    /**
     * 查询商品列表集合
     * @param pageUtil
     * @return
     */
    List<Item> selectItemList(PageUtil<Item> pageUtil);

    /**
     * 查询总条数
     * @param pageUtil
     * @return
     */
    int selectItemListCount(PageUtil<Item> pageUtil);

    /**
     * 新增
     * @param item
     * @return
     */
    int insertSelective(Item item);

    /**
     * 逻辑删除 单个
     * @param item
     * @return
     */
    int deleteLogicItem(Item item);

    /**
     * 根据ID集合 批量逻辑删除
     * @param idsList
     * @return
     */
    int deleteLogicItemMatch(ArrayList<BigDecimal> idsList);

    /**
     * 根据ID集合 批量删除
     * @param idsList
     * @return
     */
    int deleteItemMatch(ArrayList<BigDecimal> idsList);
}