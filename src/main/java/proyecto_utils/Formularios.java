package proyecto_utils;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Formularios {
    public static <T> T getObjetoFormulario(JFrame frame, Class<T> tClass) {
        T obj;
        try {
            obj = tClass.getDeclaredConstructor().newInstance();
            for (Field field : frame.getClass().getDeclaredFields()) {
                if (field.getType() == JTextField.class || field.getType() == JComboBox.class) {
                    System.out.println(field.getName());
                    field.setAccessible(true);
                    Object value = null;
                    if (field.getType() == JTextField.class) {
                        JTextField fieldValue = (JTextField) field.get(frame);
                        value = fieldValue.getText();
                    } else if (field.getType() == JComboBox.class) {
                        JComboBox fieldValue = (JComboBox) field.get(frame);
                        value = fieldValue.getSelectedIndex() + 1;
                    }

                    String fieldname = field.getName();
                    try {
                        Field fieldClas = tClass.getDeclaredField(fieldname);
                        String methodname = "set" + Character.toUpperCase(fieldname.charAt(0)) + fieldname.substring(1);
                        Method method = tClass.getMethod(methodname, fieldClas.getType());

                        String valor = String.valueOf(value);
                        if (fieldClas.getType() == int.class) {
                            if (valor.isEmpty()||valor.isBlank()){
                                value = 0;
                            }else{
                                value = Integer.parseInt(valor);
                            }
                        } else if (fieldClas.getType() == float.class) {
                            if (valor.isEmpty()||valor.isBlank()){
                                value = 0f;
                            }else{
                                value = Float.parseFloat(valor);
                            }
                        }
                        method.invoke(obj, value);
                    } catch (NoSuchFieldException | NoSuchMethodException ignored) {
                    }

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
        }
        return obj;
    }

}
