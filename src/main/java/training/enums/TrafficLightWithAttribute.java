package training.enums;

public enum TrafficLightWithAttribute {
    YELLOW(5, "sárga") {
        @Override
        public TrafficLightWithAttribute next() {
            return GREEN;
        }
    },
    RED(1, "piros") {
        @Override
        public TrafficLightWithAttribute next() {
            return YELLOW;
        }
    },
    GREEN(10, "zöld") {
        @Override
        public TrafficLightWithAttribute next() {
            return RED;
        }
    };

    private int number;

    private String message;

    TrafficLightWithAttribute(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }

    public abstract TrafficLightWithAttribute next();
}
