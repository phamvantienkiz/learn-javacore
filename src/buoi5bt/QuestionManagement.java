package buoi5bt;

public class QuestionManagement {
    private int totalQuestion;
    private Question[] questions;

    public QuestionManagement(Question[] questions) {
        this.questions = questions;
        this.totalQuestion = this.questions.length;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public float totalPoint() {
        float totalPoint = 0;
        for (int i = 0; i < totalQuestion; i++) {
            if (questions[i].checkAnswer() == true) {
                totalPoint = totalPoint + 1;
            }
        }
        return totalPoint;
    }

    public void dokhoQuestion(String doKho) {
        for (int i = 0; i < totalQuestion; i++) {
            if (questions[i].getDokho() == doKho) {
                System.out.println(questions[i].getContent());
                System.out.println(questions[i].getAnswer1()+ "  "+questions[i].getAnswer2()+"  "+questions[i].getAnswer3()+"  "+questions[i].getAnswer4());
            }
        }
    }


}
