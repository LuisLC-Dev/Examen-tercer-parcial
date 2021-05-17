package uaslp.objetos.exams;

public class Score {
    int partial;
    int score;

    public Score(int partial, int score) {
        this.partial = partial;
        this.score = score;
    }

    public int getPartial() {
        return partial;
    }

    public void setPartial(int partial) {
        this.partial = partial;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
