package com.ligh.entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ${ligh} on 2019/2/21 下午5:21
 */
public class MyInvacation {

    private Method method;

    private Object[] args;

    private Object target;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //将自己成员变量的操作尽量放到自己内部，不需要Interceptor获得自己的成员变量再去操作它们，
    //除非这样的操作需要Interceptor的其他支持。然而这里不需要。
    public Object doSth() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }


    public MyInvacation(Method method, Object[] args, Object target) {
        this.method = method;
        this.args = args;
        this.target = target;
    }
}
