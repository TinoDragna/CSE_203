
public class labAcivity extends GradedActivity
{
   private double score; // Minimum passing score

   public labAcivity(double score)
   {
      this.score = score;
   }

@Override
public String toString() {
    return "labAcivity [score=" + score + "]";
}
   
   
}