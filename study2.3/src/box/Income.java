package box;
interface salary {
    double getTax();
}

class Income implements salary {
    private double income;

    Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.3;
    }

}

class firstIncome implements salary {
    private double income;
    public firstIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.7;
    }
}

class secondIncome implements salary {
    private double income;
    public secondIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return income;
    }
}

