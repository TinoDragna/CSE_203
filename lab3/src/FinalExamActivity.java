
public class FinalExamActivity extends GradedActivity {

    private double score; // Minimum passing score

    public FinalExamActivity(double numericScore) {
        score = numericScore;
    }

    @Override
    public String toString() {
        return "FinalExamActivity [score=" + score + "]";
    }

}
