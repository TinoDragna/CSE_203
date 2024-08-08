
public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;

    public UniversityStudent(String id, String fullName, int totalCreditEarned, double averageScore, String thesisName,
            double thesisScore) {
        super(id, fullName, totalCreditEarned, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public boolean canGraduate() {
        if (getTotalCreditEarned() >= 150
                && getAverageScore() >= 5
                && thesisScore >= 5) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " UniversityStudent [thesisName=" + thesisName + ", thesisScore=" + thesisScore + ", canGraduate=" + canGraduate() + "]";
    }

    
    
}
