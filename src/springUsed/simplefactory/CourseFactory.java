package springUsed.simplefactory;

public class CourseFactory {

    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if ("C".equals(name)){
            return new CCourse();
        }else{
            return null;
        }
    }

    public ICourse create1(Class<? extends ICourse> clazz) throws IllegalAccessException, InstantiationException {
        if (null!=clazz){
            return clazz.newInstance();
        }
        return null;
    }
}
