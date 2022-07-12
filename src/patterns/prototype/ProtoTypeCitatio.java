package patterns.prototype;

public class ProtoTypeCitatio {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("小明", " 同学：被评为”三好学生“。", "广州软件学院");
        citation.display();

        Citation citation1 = (Citation) citation.clone();
        citation1.setName("伴随");
        citation1.display();
    }
}

