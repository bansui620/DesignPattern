package patterns.facade.t3;

public class CipherMachine {
    public String encrypt(String plainText){
        System.out.print("数据加密，将明文转换为密文：");
        String es = "";
        for (int i = 0; i <plainText.length() ; i++) {
            String s = String.valueOf(plainText.charAt(i) % 7);
            es+=s;
        }
        System.out.println(es);
        return es;
    }
}
