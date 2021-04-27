package com.snym.service;

import com.snym.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 统一处理服务熔断
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/27 16:40
 */
@Component
public class DeptFeignClientServiceFallbackFactory implements FallbackFactory<DeptFeignClientService> {
    @Override
    public DeptFeignClientService create(Throwable throwable) {
        return new DeptFeignClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept getDept(Long id) {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> getDeptAll() {
                return null;
            }
        };
    }
}
