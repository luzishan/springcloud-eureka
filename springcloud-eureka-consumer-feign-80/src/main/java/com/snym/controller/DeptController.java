package com.snym.controller;

import com.snym.entities.Dept;
import com.snym.service.DeptFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门controller
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/25 14:20
 */
@RestController
@RequestMapping("1.0/consumer/dept")
public class DeptController {

    @Autowired
    private DeptFeignClientService deptFeignClientService;


    @RequestMapping(value = "add")
    public boolean add(Dept dept) {
        return deptFeignClientService.addDept(dept);
    }

    @RequestMapping(value = "getById/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptFeignClientService.getDept(id);
    }

    @RequestMapping(value = "list")
    public List list() {
        return deptFeignClientService.getDeptAll();
    }

}
