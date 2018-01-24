package com.twp.springproject.dao;

import com.twp.springproject.entity.CostEntity;
import com.twp.springproject.vo.Page;

import java.util.List;

@MyBatisDao
public interface CostMapperDao {

    List<CostEntity> findAll(Page page);

    void addCost(CostEntity entity);

    CostEntity findCostById(Integer id);

    void updateCostById(CostEntity cost);

    int getCostCount();
}
