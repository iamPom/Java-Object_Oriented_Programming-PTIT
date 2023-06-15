// code:
// name:
package ToHop1;

/**
 *
 * @author Pom
 */
public class ToHop {
   private int[] x;
   private int k;
   private int n;
    public ToHop(int k, int n) {
        x = new int[100];
        this.k = k;
        this.n = n;
        System.out.println("k: " + k);
    }
    void in(int a[], int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }
    void DeQuy(int h, int k, int n){
       for (int i = x[h-1] + 1; i <= n - (k-h); i++){
		x[h] = i;
		if (h == k) in(x, k);
		else {
			DeQuy(h+1, k, n);
		}
	}
    }
    void init(){
        x[0] = 0;
        DeQuy(1, k ,n);
    }
}
