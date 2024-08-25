package task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class<?> personalClass = Class.forName("task1.Person");


        //получить список всех полей
        Field[] fields = personalClass.getDeclaredFields();
        for(Field field : fields){
            System.out.println("Поле: " + field.getName());
        }
        //получить список всех конструкторов
        Constructor[] constructors
                = personalClass.getConstructors();


        //создание экземляра класса
        Object personalInstance = constructors[0].newInstance(null);

        Field nameField = personalInstance.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personalInstance, "Alice");

        Field ageField = personalInstance.getClass().getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(personalInstance, 30);


        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
        displayInfoMethod.invoke(personalInstance);
    }
}