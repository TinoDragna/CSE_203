public class courseGradesTest {
    public static void main(String[] args) {
        CourseGrades courseGrades = new CourseGrades();
        

        GradedActivity lab = new Lab(70);
        GradedActivity essay = new Essay(10, 20, 20, 10);

        GradedActivity finalScore = new FinalExam(50, 5);
        
        GradedActivity passFail = new PassFailExam(50,7,25);

        courseGrades.setLab(lab);
        courseGrades.setEssay(essay);
        courseGrades.setFinal(finalScore); 
        courseGrades.setPassFailExam(passFail);
        System.out.println(courseGrades+"\n");

        courseGrades.print();
        
    }

}
