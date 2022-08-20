abstract class finalIncome {
    protected double income;

    public finalIncome(double income) {
        this.income = income;
    }

    public abstract double getTax();
}

class Income extends finalIncome {

    public Income(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return income * 0.8;
    }
}

class newIncome extends finalIncome {
    public newIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return income * 0.9;
    }
}