package springUsed.prototype;

import java.io.Serializable;

public class QiTianDaShengShallow extends Monkey implements Cloneable, Serializable {
    public JinguBang jinguBang;

    public QiTianDaShengShallow() {
        this.jinguBang = jinguBang;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.shallowClone();
    }

    private QiTianDaShengShallow shallowClone() {
        QiTianDaShengShallow qi = new QiTianDaShengShallow();
        qi.height = this.height;
        qi.weight = this.weight;
        qi.jinguBang = this.jinguBang;
        return qi;
    }

}
