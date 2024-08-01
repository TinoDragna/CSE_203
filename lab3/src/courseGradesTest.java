public class courseGradesTest {
    public static void main(String[] args) {
        CourseGrades courseGrades = new CourseGrades();

        GradedActivity lab = new labAcivity(70);
        GradedActivity essay = new Essay(10, 20, 20, 10);
        GradedActivity finalScore = new FinalExamActivity(50);
        GradedActivity passFail = new PassFailActivity(50);

        courseGrades.setLab(lab);
        courseGrades.setEssay(essay);
        courseGrades.setFinal(finalScore);
        courseGrades.setPassFailExam(passFail);
        System.out.println(courseGrades);
    }

}
