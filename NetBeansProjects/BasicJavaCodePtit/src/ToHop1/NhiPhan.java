// code:
// name:
package ToHop1;

/**
 *
 * @author Pom
 */
public class NhiPhan {
    private int n;
    public NhiPhan(int n){
        this.n = n;
    }
    void DeQuy(int n, String s){
        if(n==0) System.out.println(s);
        else{
            for(int i = 0; i <= 1; i++){
                DeQuy(n-1, s + i);
            }
        }
    }
    void inti(){
        DeQuy(n,"");
    }
}
