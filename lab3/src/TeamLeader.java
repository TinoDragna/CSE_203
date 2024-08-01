public class TeamLeader extends ProductionWorker{
    private int requiredTrainingHours;
    private int trainingHoursAttended;

    public TeamLeader(String name, String id, String hireDay, int shift, double hourPayRate, int requiredTrainingHours,
            int trainingHoursAttended) {
        super(name, id, hireDay, shift, hourPayRate);
        this.requiredTrainingHours = requiredTrainingHours;
        this.trainingHoursAttended = trainingHoursAttended;
    }

    @Override
    public String toString() {
        return "TeamLeader [requiredTrainingHours=" + requiredTrainingHours + ", trainingHoursAttended="
                + trainingHoursAttended + "]";
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getTrainingHoursAttended() {
        return trainingHoursAttended;
    }

    public void setTrainingHoursAttended(int trainingHoursAttended) {
        this.trainingHoursAttended = trainingHoursAttended;
    }
    
    
}
