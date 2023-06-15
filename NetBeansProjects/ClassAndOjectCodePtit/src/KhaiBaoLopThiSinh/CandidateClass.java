// code:
// name:
package KhaiBaoLopThiSinh;

/**
 *
 * @author Pom
 */
public class CandidateClass {
    private String name;
    private String datebirth;
    private Float score1;
    private Float score2;
    private Float score3;

    public void setName(String name) {
        this.name = name;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public void setScore1(Float score1) {
        this.score1 = score1;
    }

    public void setScore2(Float score2) {
        this.score2 = score2;
    }

    public void setScore3(Float score3) {
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public Float getScore1() {
        return score1;
    }

    public Float getScore2() {
        return score2;
    }

    public Float getScore3() {
        return score3;
    }
    
    public Float totalScore(){
        return score1 +score2 +score3;
    }
    
    
}
