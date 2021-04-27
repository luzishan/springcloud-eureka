package com.snym.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.snym.entities.Dept;
import com.snym.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门controller
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/23 15:37
 */
@RestController
@RequestMapping("/1.0/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 对象传参时@RequestBody不可少
     */
    @PostMapping("add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("getById/{id}")
    @HystrixCommand(fallbackMethod = "getDeptHystrix")
    public Dept getDept(@PathVariable Long id) {
        Dept dept = deptService.findById(id);
        if(dept == null){
           throw  new RuntimeException("没有该部门！");
        }
        return dept;
    }

    public Dept getDeptHystrix(@PathVariable Long id) {
        return  new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @GetMapping("list")
    public List<Dept> getDeptAll() {
        return deptService.findAll();
    }
}
