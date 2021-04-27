package com.snym.service;

import com.snym.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 部门feign接口，注意：这里的请求路径要和提供者Controller中的请求路径要完全一致
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/27 15:28
 */
@FeignClient(value = "SPRINGCLOUD-EUREKA-DEPT", fallbackFactory = DeptFeignClientServiceFallbackFactory.class)
public interface DeptFeignClientService {

    @PostMapping("/1.0/dept/add")
    boolean addDept(@RequestBody Dept dept);

    @GetMapping("/1.0/dept/getById/{id}")
    Dept getDept(@PathVariable("id") Long id);

    @GetMapping("/1.0/dept/list")
    List<Dept> getDeptAll();
}
