
public class CollegeStudent extends Student {

    private double graduationExamScores;

    public CollegeStudent(String id, String fullName, int totalCreditEarned, double averageScore,
            double graduationExamScores) {
        super(id, fullName, totalCreditEarned, averageScore);
        this.graduationExamScores = graduationExamScores;
    }

    public boolean canGraduate() {
        if (totalCreditEarned >= 100 && averageScore >= 5 && graduationExamScores >= 5) {
            return true; 
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CollegeStudent [graduationExamScores=" + graduationExamScores + "]" + "CollegeStudent [graduationExamScores=" + graduationExamScores + ", canGraduate()=" + canGraduate()
                + "]";
    }

}
