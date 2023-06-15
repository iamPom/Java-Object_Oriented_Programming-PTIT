// code:
// name:
package KhaiBaoLopSinhVien;

/**
 *
 * @author Pom
 */
public class StudentClass {

    private String name, classname, daybirth;
    private float gpa;

    public StudentClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDaybirth() {
        return daybirth;
    }

    public void setDaybirth(String daybirth) {
        this.daybirth = daybirth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void convertbirth() {
        String s[] = daybirth.split("/");
        if (s[0].length() == 1) {
            s[0] = "0" + s[0];
        }
        if (s[1].length() == 1) {
            s[1] = "0" + s[1];
        }
        daybirth = String.join("/", s);
    }

    @Override
    public String toString() {
        return String.format("B20DCCN001 %s %s %s %.2f", 
                name, classname, daybirth, gpa);
    }
}
