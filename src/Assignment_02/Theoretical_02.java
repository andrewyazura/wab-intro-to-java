package Assignment_02;

interface Visible {
    boolean makeVisible();

    boolean makeInvisible();
}


public class Theoretical_02 implements Visible {
    private boolean isVisible;

    public Theoretical_02() {
        isVisible = false;
    }

    @Override
    public boolean makeVisible() {
        if (!isVisible) {
            isVisible = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean makeInvisible() {
        if (isVisible) {
            isVisible = false;
            return true;
        }
        return false;
    }
}
