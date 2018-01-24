package com.twp.springproject.controller;

import com.twp.springproject.dao.CostMapperDao;
import com.twp.springproject.entity.CostEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/fee")
public class FeeUpdateController {

    @Resource
    private CostMapperDao dao;

    @RequestMapping("/toUpdatePage")
    public String toUpdate(@RequestParam(name = "id") Integer id, Model model) {
        if (id != null) {
            CostEntity costById = dao.findCostById(id);
            model.addAttribute("cost", costById);
        }
        return "fee/fee_modi";
    }

    @RequestMapping("/updateCost")
    public String updateCost(CostEntity cost) {
        if (cost != null) {
            System.out.println(cost.toString());
            dao.updateCostById(cost);
        }
        return "redirect:/list.do";
    }
}
