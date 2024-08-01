
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

    

}

