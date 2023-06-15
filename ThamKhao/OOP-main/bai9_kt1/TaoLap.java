package bai9;
import java.util.Scanner;

public class TaoLap {
    private int n;
    private double a[];
    
    Scanner scanner = new Scanner(System.in);

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public TaoLap() {
	//n = 0;
	//a = null;
    }

    public TaoLap(int n) {
	
	this.n = n;
	a = new double[n+1];
    }
    public TaoLap(double[] a) {
	
	this.n = a.length;
	this.a = new double[n+1];
	
	for (int i = 0; i < a.length; i++) {
		this.a[i] = a[i];
	}
    }

    public TaoLap(TaoLap b) {
	
	this.n = b.n;
	this.a = new double[n+1];
	
	for (int i = 0; i < this.a.length; i++) {
		this.a[i] = b.a[i];
	}
    }

    public void Input() {
	System.out.print("Nhap bac cua da thuc: ");
        //Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	
	a = new double[n+1];
	for (int i = n; i >= 0; i--) {
		System.out.print("Bac thu " + i + " ");
		a[i] = scanner.nextDouble();
	}
	System.out.println();
	
    }
    
    public void Output() {

	for (int i = a.length-1; i >= 0; i--) {
            if(a[i]!=0){
		if (i == 0)
		    System.out.print(" + " + a[i]);//+ " * X^" + i
                else if(i==a.length-1)
                    System.out.print(a[i] + " * X^" + i);
                else
		    System.out.print(" + " + a[i] + " * X^" + i);
            }           
	}
	System.out.println(" ");
    }
    
    public void tinhX0(float x0){
        //System.out.print("Nhap x0: ");
        //float x0 = scanner.nextFloat();
        float tong=0;
        for(int i=a.length-1; i>=0; i--){
            tong+=a[i] * Math.pow(x0, i);
        }
        System.out.println(tong);      
    }
    
    public void daoHam(){
        double[] b = new double[n];
        for(int i=n; i>0; i--){
            b[i-1] = a[i]*i;
        }
        for (int i = n-1; i >= 0; i--) {
            if(b[i] != 0)
		if (i == 0)
		    System.out.print(" + " + b[i]);//+ " * X^" + i
                else if(i==b.length-1)
                    System.out.print(b[i] + " * X^" + i);
                else
		    System.out.print(" + " + b[i] + " * X^" + i);
                      
	}
	System.out.println(" ");
    }
    
    public TaoLap add(TaoLap b){
        TaoLap c;
        int i,j;
        if (n>b.n) {
            c= new TaoLap(n);
            for( i=0;i<=b.n;i++){
            c.a[i]= a[i]+b.a[i];
            }
            for( j=i; j<=n;j++){
                c.a[j]= a[j];
            }
        }
        else {
            c= new TaoLap(b.n);
            for(i=0;i<=n;i++)
                c.a[i]= a[i]+b.a[i];
            for(j= i;j<=b.n;j++)
                c.a[j]= b.a[j];
        }
        
        return c;
    }
    
    public TaoLap sub(TaoLap b){
        TaoLap c;
        int i,j;
        if (n>b.n) {
            c= new TaoLap(n);
            for( i=0;i<=b.n;i++){
            c.a[i]= a[i]-b.a[i];
            }
            for( j=b.n+1; j<=n;j++){
                c.a[j]= a[j];
            }
        }
        else {
            c= new TaoLap(b.n);
            for(i=0;i<=n;i++)
                c.a[i]= a[i]-b.a[i];
            for(j= n+1;j<=b.n;j++)
                c.a[j]= -b.a[j];
        }
        
        return c;
    }
    
   
}
