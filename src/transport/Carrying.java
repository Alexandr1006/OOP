package transport;

public enum Carrying {
    N1(0d, 3.5),
    N2(3.5, 12d),
    N3(13D, null);


    private final Double carryingLowerLimit;
    private final Double carryingUpperLimit;

    Carrying(Double carryingLowerLimit, Double carryingUpperLimit) {
        this.carryingLowerLimit = carryingLowerLimit;
        this.carryingUpperLimit = carryingUpperLimit;
    }

    public Double getCarryingLowerLimit() {
        return carryingLowerLimit;
    }

    public Double getCarryingUpperLimit() {
        return carryingUpperLimit;
    }

    @Override
    public String toString() {
        return   "от " + carryingLowerLimit + " до " +carryingUpperLimit;
    }
}
