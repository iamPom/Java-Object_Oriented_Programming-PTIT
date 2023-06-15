// code:
// name:
package ToHop1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pom
 */
public class HoanVi {
   private boolean [] arr;
   private int[] x;

    public HoanVi(int n) {
        arr = new boolean[100];
        for(int i = 1; i <= n; i++){
           arr[i] = true;
        }
        x = new int[100];  
    }
    void in(int a[], int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }
    void DeQuy(int k, int n){
        for(int i = 1; i <= n; i++){
            if(arr[i]){
                x[k] = i;
                if(k==n){
                    in(x,n);
                }
                else {
                    arr[i] = false;
                    DeQuy(k+1, n);
                    arr[i] = true;
                }
            }
        }
    }
    void init(int n){
        DeQuy(1, n);
    }
}
