package patterns.facade.t3;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src\\patterns\\facade\\t3\\src.txt",
                "src\\patterns\\facade\\t3\\des.txt");
    }
}
