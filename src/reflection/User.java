package reflection;

public class User extends People{

    public String id;
    private int age;
    private String name;

    public User() {
    }

    public User(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void u1(String str){}
    private void u2(){}
    private void u3(){}

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
