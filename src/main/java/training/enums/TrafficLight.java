package training.enums;

public enum TrafficLight {
    GREEN {
        @Override
        public String getMessage() {
            return "zöld";
        }
    }, YELLOW {
        @Override
        public String getMessage() {
            return "sárga";
        }
    }, RED {
        @Override
        public String getMessage() {
            return "piros";
        }
    };

    public abstract String getMessage();
}