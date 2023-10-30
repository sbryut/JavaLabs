package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class TestClass {
    public static void callAnnotatedMethods(Object obj) throws InvocationTargetException, IllegalAccessException {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    int callNum = method.getAnnotation(MyAnnotation.class).value();
                    for (int i = 0; i < callNum; i++) {
                        method.setAccessible(true);
                        Object[] params = new Object[method.getParameterTypes().length];
                        for (int j = 0; j < params.length; j++) {
                            params[j] = getDefaultValue(method.getParameterTypes()[j]);
                        }
                        method.invoke(obj, params);
                    }
                }
            }
        }
    }

    private static Object getDefaultValue(Class<?> type) {
        return switch (type.getName()) {
            case "boolean" -> true;
            case "char" -> 'A';
            case "byte" -> (byte) 100;
            case "short" -> (short) 1;
            case "int" -> -155;
            case "long" -> 3L;
            case "float" -> 0.1f;
            case "double" -> 0.65;
            case "java.lang.String" -> "Example";
            default -> null;
        };
    }

    public static void main(String[] args) {
        BaseClass methods = new BaseClass();
        try {
            callAnnotatedMethods(methods);
        } catch (InvocationTargetException | IllegalAccessException e) {
            System.err.println("The error occurred during program execution.\n");
            e.printStackTrace();
        }
    }
}