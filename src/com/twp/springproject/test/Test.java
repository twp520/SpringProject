package com.twp.springproject.test;

import com.twp.springproject.dao.CostMapperDao;
import com.twp.springproject.vo.Page;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
        CostMapperDao dao = (CostMapperDao) ctx.getBean("costMapperDao");
        Page page = new Page(2,2);
        dao.findAll(page).stream().forEach(costEntity ->
                System.out.println(costEntity.toString())
        );

    }
}
