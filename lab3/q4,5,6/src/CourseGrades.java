
import java.util.*;

public class CourseGrades extends GradedActivity{
    private GradedActivity[] grades;
    private int size = 4;

    public CourseGrades () {
        grades = new GradedActivity[size];
    }

    public void setLab (GradedActivity lab){
        grades[0]= lab;
    }

    public void setPassFailExam (GradedActivity passFailExam){
        grades[1]= passFailExam;
    }
    public void setEssay (GradedActivity essay){
        grades[2]= essay;
    }

    public void setFinal (GradedActivity finalScore){
        grades[3]= finalScore;
    }

    @Override
    public String toString() {
        return "CourseGrades [grades=" + Arrays.toString(grades) + ", size=" + size + "]";
    }

    public double  getAverage (){
        double total = 0;
        for (GradedActivity grade : grades) {
            if (grade != null) {
                total += grade.getScore();
            }
        }
        total /= size;
        return total;
    }

    public GradedActivity getLowest (){
        GradedActivity lowest = grades[0];
        for (int i = 0; i < size; i++) {
            if (grades[i].getScore()< lowest.getScore()){
                lowest = grades[i];
            }
        }
        return lowest;
    }

    public GradedActivity getHighest (){
        GradedActivity highest = grades[0];
        for (int i = 0; i < size; i++) {
            if (grades[i].getScore()> highest.getScore()){
                highest = grades[i];
            }
        }
        return highest;
    }

    public void print (){
            System.out.println("Average: " + getAverage());
            System.out.println("Lowest: " + getLowest());
            System.out.println("Highest: " + getHighest());
    }


}

