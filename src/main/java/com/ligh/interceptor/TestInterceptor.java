package com.ligh.interceptor;

import com.ligh.entity.MyInvacation;
import com.ligh.interfaces.InterceptorLogic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ${ligh} on 2019/2/21 下午4:01
 */
public class TestInterceptor implements InvocationHandler{

    private Object target;

    private InterceptorLogic interceptorLogic;

    /**
     *  声明真实角色,即需要被拦截(代理)的接口或类
     *
     * @param target interceptorLogic
     */
    public TestInterceptor(Object target, InterceptorLogic interceptorLogic) {
        this.target = target;
        this.interceptorLogic = interceptorLogic;
    }

    //将动态生成代理类移到这里,符合迪米特原则,因为所用到的参数都是本类中定义的
    public Object newProxy(Object object,InterceptorLogic interceptorLogic) throws Throwable {

        //在执行目标对象方法之前添加自己的拦截逻辑
//        System.out.println("begin  拦截逻辑");
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TestInterceptor(target,interceptorLogic));

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在执行目标对象方法之前添加自己的拦截逻辑
        return interceptorLogic.doSth(new MyInvacation(method,args,target));
    }
}
