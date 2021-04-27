package com.snym.controller;

import com.snym.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    public static final String REST_URL_PREFIX = "http://SPRINGCLOUD-EUREKA-DEPT/1.0/dept/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "add", dept, Boolean.class);
    }

    @RequestMapping(value = "getById/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "getById/" + id, Dept.class);
    }

    @RequestMapping(value = "list")
    public List list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "list", List.class);
    }

}
