package com.snym.mapper;

import com.snym.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * @description: 添加部门
     * @param: dept
     * @return: boolean
     * @author: lzs
     * @date: 2021/4/23 15:34
     */
    public boolean addDept(Dept dept);

    /**
     * @description: 根据id查询部门
     * @param: id
     * @return: com.snym.entities.Dept
     * @author: lzs
     * @date: 2021/4/23 15:35
     */
    public Dept findById(Long id);

    /**
     * @description: 查询所有部门
     * @param:
     * @return: java.util.List
     * @author: lzs
     * @date: 2021/4/23 15:35
     */
    public List findAll();
}
