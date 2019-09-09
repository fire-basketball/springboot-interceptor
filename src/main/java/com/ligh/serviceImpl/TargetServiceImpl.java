package com.ligh.serviceImpl;

import com.ligh.service.TargetService;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * Created by ${ligh} on 2019/2/21 下午4:00
 */
@Service
public class TargetServiceImpl implements TargetService{
    @Override
    public void say() {
        System.out.println("我是要被拦截的方法....");
    }
}

