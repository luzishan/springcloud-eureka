package com.snym.service.impl;

import com.snym.entities.Dept;
import com.snym.mapper.DeptMapper;
import com.snym.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门接口实现类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/23 15:30
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;


    /**
     * @description: 添加部门
     * @param: dept
     * @return: boolean
     * @author: lzs
     * @date: 2021/4/23 15:34
     */
    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    /**
     * @description: 根据id查询部门
     * @param: id
     * @return: com.snym.entities.Dept
     * @author: lzs
     * @date: 2021/4/23 15:35
     */
    @Override
    public Dept findById(Long id) {
        return deptMapper.findById(id);
    }

    /**
     * @description: 查询所有部门
     * @param:
     * @return: java.util.List
     * @author: lzs
     * @date: 2021/4/23 15:35
     */
    @Override
    public List findAll() {
        return deptMapper.findAll();
    }
}
