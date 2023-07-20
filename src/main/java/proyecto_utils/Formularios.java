package proyecto_utils;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Formularios {
    public static <T> T getObjetoFormulario(JFrame frame, Class<T> tClass) {
        T obj;
        try {
            obj = tClass.getDeclaredConstructor().newInstance();
            for (Field field : frame.getClass().getDeclaredFields()) {
                if (field.getType() == JTextField.class) {
                    System.out.println(field.getName());
                    field.setAccessible(true);
                    JTextField fieldValue = (JTextField) field.get(frame);
                    String fieldname = field.getName();
                    Field fieldClas = tClass.getDeclaredField(fieldname);
                    String methodname = "set" + Character.toUpperCase(fieldname.charAt(0)) + fieldname.substring(1);
                    Method method = tClass.getMethod(methodname, fieldClas.getType());
                    Object value = fieldValue.getText();
                    if (fieldClas.getType() == int.class) {
                        if (fieldValue.getText().isBlank() && fieldValue.getText().isEmpty()) {
                            value = 0;
                        } else {
                            value = Integer.parseInt(fieldValue.getText());
                        }
                    } else if (fieldClas.getType() == float.class) {
                        if (fieldValue.getText().isBlank() && fieldValue.getText().isEmpty()) {
                            value = 0f;
                        } else {
                            value = Float.parseFloat(fieldValue.getText());
                        }
                    }
                    method.invoke(obj, value);
                }
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

}
