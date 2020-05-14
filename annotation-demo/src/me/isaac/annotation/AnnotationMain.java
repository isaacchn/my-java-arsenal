package me.isaac.annotation;

import java.lang.reflect.Field;

/**
 * Java注解示例
 */
public class AnnotationMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MarkerParam param = new MarkerParamChild();

        Field[] fields = param.getClass().getDeclaredFields();
        for (Field field : fields) {
            RequestParamField requestParamField = field.getAnnotation(RequestParamField.class);
            if (requestParamField != null) {
                System.out.println(requestParamField.paramName());
                System.out.println(requestParamField.operator());
            }
        }
    }
}
