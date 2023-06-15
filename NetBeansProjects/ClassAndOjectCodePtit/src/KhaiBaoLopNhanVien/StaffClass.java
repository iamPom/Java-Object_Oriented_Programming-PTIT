// code:
// name:
package KhaiBaoLopNhanVien;

/**
 *
 * @author Pom
 */
public class StaffClass {
    private String name,sex,daybirth,address,taxcode,daycontract,staffcode="00001";

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDaybirth(String daybirth) {
        this.daybirth = daybirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTaxcode(String texcode) {
        this.taxcode = texcode;
    }

    public void setDaycontract(String daycontract) {
        this.daycontract = daycontract;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s",
            staffcode,name,sex,daybirth,address,taxcode,daycontract); 
    }
    
}
