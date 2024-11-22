package training.controls;

public class ControlsMain {

    public static void main(String[] args) {
        int i = 5;
        int j = switch (i) {
            case 0 -> 0;
            default -> 1;
        };
    }
}
