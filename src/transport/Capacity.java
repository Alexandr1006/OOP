package transport;

public enum Capacity {

    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    BIG(60,80),
    VERY_BIG(100, 120);

    private final int capacityLowerLimit;
    private final int capacityUpperLimit;

    Capacity(int capacityLowerLimit, int capacityUpperLimit) {
        this.capacityLowerLimit = capacityLowerLimit;
        this.capacityUpperLimit = capacityUpperLimit;
    }

    public int getCapacityLowerLimit() {
        return capacityLowerLimit;
    }

    public int getCapacityUpperLimit() {
        return capacityUpperLimit;
    }

    @Override
    public String toString() {
        return "от " + capacityLowerLimit + " до " + capacityUpperLimit;
    }
}
