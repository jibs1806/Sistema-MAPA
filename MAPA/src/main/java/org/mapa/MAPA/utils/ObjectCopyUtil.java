package org.mapa.MAPA.utils;

import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectCopyUtil<T> {
    public void copyNonNullProperties(T source, T destination) {
        for (PropertyDescriptor propertyDescriptor : BeanUtils.getPropertyDescriptors(source.getClass())) {
            Method getter = propertyDescriptor.getReadMethod();
            Method setter = propertyDescriptor.getWriteMethod();

            if (getter != null && setter != null) {
                try {
                    Object value = getter.invoke(source);
                    if (value != null) {
                        setter.invoke(destination, value);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    // Handle exceptions appropriately
                    e.printStackTrace();
                }
            }
        }
    }

}
