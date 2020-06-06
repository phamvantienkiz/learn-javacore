package buoi5bt;

public class Question {
    private String content;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctanswer;
    private String dokho;

    public Question(String content, String answer1, String answer2, String answer3, String answer4, String correctanswer, String dokho) {
        this.content = content;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctanswer = correctanswer;
        this.dokho = dokho;
    }

    public Question() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    public String getDokho() {
        return dokho;
    }

    public void setDokho(String dokho) {
        this.dokho = dokho;
    }

    public boolean checkAnswer() {
        String answer = null;
        if (answer == correctanswer) {
            return true;
        }
        return false;
    }

}
