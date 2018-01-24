package com.twp.springproject.controller;

import com.twp.springproject.dao.CostMapperDao;
import com.twp.springproject.entity.CostEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/fee")
public class FeeAddController {

    @Resource
    private CostMapperDao dao;

    @RequestMapping("/toAdd")
    public String toAdd() {

        return "fee/fee_add";
    }

    @RequestMapping("/addCost")
    public String addCost(CostEntity cost) {
        if (cost != null) {
            dao.addCost(cost);
        }
        return "redirect:/fee/list.do";
    }
}
