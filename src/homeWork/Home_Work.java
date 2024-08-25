package homeWork;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;

public class Home_Work {
    public static void main(String[] args) throws ClassNotFoundException {


        //получение ссылки для класса String
        Class<?> stringClass = Class.forName("java.lang.String");

        //создание массива с методами String
        Method[] methods = stringClass.getMethods();


        //создание списка с уникальными методами
        Set<String> uniqMethodString = new LinkedHashSet<>();

        //цикл с добавлением методов в список
        for(Method method : methods){
            uniqMethodString.add(method.getName());
        }

        //вывод списка методов на консоль
        for(String string : uniqMethodString){
            System.out.println(string);
        }



    }






}
