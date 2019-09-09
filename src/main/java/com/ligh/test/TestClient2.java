package com.ligh.test;

import com.ligh.interceptor.TestInterceptor;
import com.ligh.interfaces.InterceptorLogic;
import com.ligh.interfaces.InterceptorLoginImpl;
import com.ligh.service.TargetService;
import com.ligh.serviceImpl.TargetServiceImpl;


/**
 * Created by ${ligh} on 2019/2/21 下午5:31
 */
public class TestClient2 {
    public static void main(String[]args) throws IllegalArgumentException, NoSuchMethodException, SecurityException, Throwable {
        TargetService target = new TargetServiceImpl();//真实角色

        InterceptorLogic logic =new InterceptorLoginImpl();

        TestInterceptor ti = new TestInterceptor(target,logic);//将真实角色传给代理生成类，方便动态生成代理角色

        TargetService proxy = (TargetService) ti.newProxy(target, logic);//代理类

        ti.invoke(proxy, target.getClass().getDeclaredMethod("say", null), null);
    }
}
