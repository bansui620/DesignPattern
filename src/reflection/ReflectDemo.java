package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class<?> c1 = Class.forName("reflection.User");

        User user = (User) c1.newInstance();
        //获得包名+类名
        System.out.println(c1.getName());
        //获得类名
        System.out.println(c1.getSimpleName());

        System.out.println("-----------获得类的全部public属性-----------");
        //获得类的属性
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------获得类的全部属性----------");

        Field[] fields1 = c1.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("-----------获得类指定属性的值---------");

        Field id = c1.getField("id");
        System.out.println(id);
        //属性修改
        id.set(user,"123");
        //验证属性修改
        System.out.println(user.id);

        System.out.println("-------获得当前类和父类的public方法--------");

        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-------获得当前类的所有方法-----------");

        Method[] methods1 = c1.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }

        System.out.println("-------------获取指定的public方法-------------");

        Method u1 = c1.getMethod("u1", String.class);
        System.out.println(u1);

        System.out.println("-------------获取任意指定方法-------------");

        Method u2 = c1.getDeclaredMethod("u2", null);
        u2.setAccessible(true);
        u2.invoke(user,null);
        System.out.println(u2);

        System.out.println("--------------获取所有public的构造器---------------");

        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("--------------获取所有的构造器---------------");

        Constructor<?>[] constructors1 = c1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors1) {
            System.out.println(constructor);
        }

        System.out.println("----------获取指定的构造器----------");

        Constructor<?> constructor = c1.getConstructor(String.class, int.class, String.class);
        System.out.println(constructor);
        //也可使用指定构造器实例化对象
        User user2 = (User) constructor.newInstance("20", 100, "伴随");
        System.out.println(user2.toString());
    }
}

