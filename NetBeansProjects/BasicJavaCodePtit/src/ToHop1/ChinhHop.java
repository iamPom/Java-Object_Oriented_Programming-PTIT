/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToHop1;

/**
 *
 * @author Pom
 */
public class ChinhHop {
    private int dem = 0;
    private int n;
    private int k;
    private int[] check;
    private int[] arr;
    public ChinhHop(int n, int k){
        this.n = n;
        this.k = k;
        check = new int[100];
        arr = new int[100];
    }
    void in(int a[], int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }
    void DeQuy(int i){
        for(int j  =1; j <= n; j++){
           if(check[j] == 0){
               arr[i] = j;
               if(i == k){
                   in(arr,k);
               }
               else{
                   check[j] = 1;
                   DeQuy(i+1);
                   check[j] = 0;
               }
           }
        }
    }
    void init(){
        for(int i = 1; i <= n; i++){
            check[i] = 0;
        }
        DeQuy(1);
    }
}
