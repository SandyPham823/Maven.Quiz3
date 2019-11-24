package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"), PAPER("PAPER"), SCISSOR("SCISSOR");
    String signStatus;

    RockPaperScissorHandSign(String signStatus){
        this.signStatus = signStatus;
    }

    public RockPaperScissorHandSign getWinner() {
        if (signStatus.equals("ROCK"))
            return PAPER;

        else if(signStatus.equals("PAPER"))
            return SCISSOR;

        else
            return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if (signStatus.equals("ROCK"))
            return SCISSOR;

        else if(signStatus.equals("PAPER"))
            return ROCK;

        else
            return PAPER;
    }
}
