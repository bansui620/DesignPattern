package principle;

//开闭原则
public class OCPTest {
     //测试
    public static void main(String[] args) {

        JavaDiscountCourse javacourse = new JavaDiscountCourse(1, "Java入门课程", 540.0);

        System.out.println(javacourse.getName()+"原价："+javacourse.getOriginPrice());
        System.out.println(javacourse.getName()+"活动价："+javacourse.getPrice());
    }
}

interface ICourse{
    Integer getId();
    String getName();
    Double getPrice();
}

class JavaCourse implements ICourse{
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return Id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

//如果要做活动，要进行价格优惠，则要修改这部分功能
class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice(){
        return super.getPrice()*0.6;
    }

}