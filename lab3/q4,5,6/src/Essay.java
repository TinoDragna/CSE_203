
public class Essay extends GradedActivity {

    private int grammar;
    private int spelling;
    private int correctLenght;
    private int content;

    public Essay(int grammar, int spelling, int correctLenght, int content) {
    
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLenght = correctLenght;
        this.content = content;
    }

    public int total(int grammar, int spelling, int correctLenght, int content) {
        return grammar + spelling + correctLenght + content;
    }

    @Override
    public String toString() {
        return "\n"+"Essay score: "+ total(grammar, spelling, correctLenght, content);
    }

    public int getGrammar() {
        return grammar;
    }

    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public int getCorrectLenght() {
        return correctLenght;
    }

    public void setCorrectLenght(int correctLenght) {
        this.correctLenght = correctLenght;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    

}
