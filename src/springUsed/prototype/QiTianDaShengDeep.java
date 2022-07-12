package springUsed.prototype;

import java.io.*;

public class QiTianDaShengDeep extends Monkey implements Cloneable, Serializable {
    public JinguBang jinguBang;

    public QiTianDaShengDeep() {
        this.jinguBang = new JinguBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private QiTianDaShengDeep deepClone() {

        try {
            /**
             * 将要复制的本对象，串行化为二进制数据
             * 此时会将对象中包含的对象也进行串行化 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            /** 进行深克隆：将二进制数据反串行化为对象实现 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaShengDeep qi =(QiTianDaShengDeep)ois.readObject();
            return qi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
