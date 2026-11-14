package org.nibblesec.tools.util;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocationHandler implements InvocationHandler, Serializable {

    private static final long serialVersionUID = 1L;

    private final Object target;

    public TestInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        return target;
    }
}
