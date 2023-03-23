public class FactorGenerator {
    private int numberToFactor;
    private int currentFactor = 1;

    public FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    public int nextFactor() {
        currentFactor += 1;

        for (; currentFactor < numberToFactor; currentFactor++) {
            if (numberToFactor % currentFactor == 0) {
                break;
            }
        }

        return currentFactor;
    }

    public boolean hasMoreFactors() {
        if (currentFactor >= numberToFactor) {
            return false;
        } else {
            return true;
        }
    }
}
