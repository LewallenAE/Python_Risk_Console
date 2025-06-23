package Collections_and_Data_Structures;

public class ConfusionMaster {

    private String alpha;
    private int beta;
    private boolean gamma;


    public ConfusionMaster(String toast, int potato, boolean elevator) {

        this.alpha = toast;
        this.beta = potato;
        this.gamma = elevator;
    }

    public String getAlpha() {
        return alpha;
    }

    public int getBeta() {
        return beta;
    }

    public boolean isGamma() {
        return gamma;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public void setGamma(boolean gamma) {
        this.gamma = gamma;
    }
}
