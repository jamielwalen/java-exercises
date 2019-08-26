package studios;

import java.util.ArrayList;
import java.util.HashMap;

public class quiz {

    public class Quiz {
        private ArrayList<question> questions = new ArrayList<>();

        public Quiz() {
        }

        public Quiz(ArrayList<question> questionsList) {
            this.questions = questionsList;
        }

        public ArrayList<question> getQuestions() {
            return questions;
        }

        public void setQuestions(ArrayList<question> questions) {
            this.questions = questions;
        }

        public void addQuestion(question aQuestion) {

            this.questions.add(aQuestion);

    }
    }

    public class question extends Quiz{

        private String name;
        private String type;

        public question(){
        }

        public question(String aName, String aType) {
            this.name = aName;
            this.type = aType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }

    public class multiple extends question{

        private String poss;
        private String answer;

        public multiple () {
        }

        public multiple (String aName, String aType, String aPoss, String aAnswer) {
            super(aName, aType);
            this.poss = aPoss;
            this.answer = aAnswer;
        }

        public String getPoss() {
            return poss;
        }

        public void setPoss(String poss) {
            this.poss = poss;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }


    }

    public class checkbox extends question{

        private String poss;
        private String answer;

        public checkbox () {
        }

        public checkbox (String aPoss, String aAnswer) {
            this.poss = aPoss;
            this.answer = aAnswer;
        }

        public String getPoss() {
            return poss;
        }

        public void setPoss(String poss) {
            this.poss = poss;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }

    public class true_false extends question{

        private String poss;
        private Boolean answer;

        public true_false () {
        }

        public true_false (String aPoss, Boolean aAnswer) {
            this.poss = aPoss;
            this.answer = aAnswer;
        }

        public String getPoss() {
            return poss;
        }

        public void setPoss(String poss) {
            this.poss = poss;
        }

        public Boolean getAnswer() {
            return answer;
        }

        public void setAnswer(Boolean answer) {
            this.answer = answer;
        }
    }

}
