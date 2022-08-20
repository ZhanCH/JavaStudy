//多态
//面向抽象编程
public class Main {
    public static void main(String[] args) {
        finalIncome[] Tax = {
                new Income(5000),
                new newIncome(9000),
        };
        double total = 0;
        for (finalIncome n : Tax)
            total = total + n.getTax();
        System.out.println(total);
    }
}
