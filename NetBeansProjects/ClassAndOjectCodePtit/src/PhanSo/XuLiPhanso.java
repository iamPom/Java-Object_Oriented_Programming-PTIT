// code:
// name:
package PhanSo;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class XuLiPhanso {

    private long tu,mau;

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
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

}
