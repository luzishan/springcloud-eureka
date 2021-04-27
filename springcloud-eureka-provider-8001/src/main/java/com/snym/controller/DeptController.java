package com.snym.controller;

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
    public Dept getDept(@PathVariable Long id) {
        return deptService.findById(id);
    }

    @GetMapping("list")
    public List<Dept> getDeptAll() {
        return deptService.findAll();
    }
}
