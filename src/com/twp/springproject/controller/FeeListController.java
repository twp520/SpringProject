package com.twp.springproject.controller;

import com.twp.springproject.dao.CostMapperDao;
import com.twp.springproject.entity.CostEntity;
import com.twp.springproject.vo.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/fee")
@SessionAttributes("page")
public class FeeListController {

    @Resource
    private CostMapperDao dao;

    @RequestMapping("/list")
    public String exe(Page page, Model model) {
        int total = dao.getCostCount();
        page.setCount(total);
        if (page.getPageIndex() > page.getTotalPage()) {
            page.setPageIndex(page.getTotalPage());
        }
        List<CostEntity> list = dao.findAll(page);
        model.addAttribute("costs", list);
        model.addAttribute("page", page);
        return "fee/fee_list";
    }

}
