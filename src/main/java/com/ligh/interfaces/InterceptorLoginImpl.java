package com.ligh.interfaces;

import com.ligh.entity.MyInvacation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by ${ligh} on 2019/2/21 下午5:34
 */
public class InterceptorLoginImpl implements InterceptorLogic{

    @Override
    public Object doSth(MyInvacation myInvacation) {
        System.out.println("begin ...");

        try {
            return myInvacation.doSth();
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
