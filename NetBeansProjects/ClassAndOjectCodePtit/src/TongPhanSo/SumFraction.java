// code:
// name:
package TongPhanSo;

/**
 *
 * @author Pom
 */
public class SumFraction {

    private long tu, mau;

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public long gcdByEuclidsAlgorithm(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public void rutGon(long a, long b) {
        long n = gcdByEuclidsAlgorithm(a, b);
        System.out.println(a / n + "/" + b / n);
    }

    public void sumFraction(long tu1, long mau1, long tu2, long mau2) {
        long tumoi = tu1 * mau2 + tu2 * mau1;
        long maumoi = mau1 * mau2;
        rutGon(tumoi, maumoi);
    }

}
