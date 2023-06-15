
package bai2;


public class SoDep {
    private String s;
    private boolean check;

    public SoDep() {
    }

    public SoDep(String s, boolean check) {
        this.s = s;
        this.check = check;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public boolean isCheck(String s) {
        for(int i=0; i<s.length(); i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==1||
                    s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    

    
}
