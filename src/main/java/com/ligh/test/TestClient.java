package com.ligh.test;

import com.ligh.interceptor.TestInterceptor;
import com.ligh.service.TargetService;
import com.ligh.serviceImpl.TargetServiceImpl;

import java.lang.reflect.Proxy;

/**
 * Created by ${ligh} on 2019/2/21 下午4:08
 */
public class TestClient {
    public static void main(String[] args) throws Throwable {

//        //真实角色
//        TargetService t = new TargetServiceImpl();
//        //将真实角色传给代理生成类,方便动态生成代理角色
//        TestInterceptor ti = new TestInterceptor(t);
//        ti.invoke((TargetService)Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(),ti),
//                t.getClass().getDeclaredMethod("say",null),null);
    }
}
