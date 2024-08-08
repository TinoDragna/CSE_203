
public abstract class Student implements Comparable<Student> {

    protected String id;
    protected String fullName;
    protected int totalCreditEarned;
    protected double averageScore;

    public Student(String id, String fullName, int totalCreditEarned, double averageScore) {
        this.id = id;
        this.fullName = fullName;
        this.totalCreditEarned = totalCreditEarned;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fullName=" + fullName + ", totalCreditEarned=" + totalCreditEarned
                + ", averageScore=" + averageScore + "]";
    }

    @Override
    public int compareTo(Student o) {
        String myType = this.getClass().getSimpleName();
        String oType = o.getClass().getSimpleName();
        if (myType.equals(oType) == false) {
            return myType.compareTo(oType);
        } else {
            return this.getId().compareTo(o.getId());
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTotalCreditEarned() {
        return totalCreditEarned;
    }

    public void setTotalCreditEarned(int totalCreditEarned) {
        this.totalCreditEarned = totalCreditEarned;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public abstract boolean canGraduate();

}
