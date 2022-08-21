//接口
package box;
public class Main {
    public static void main(String[] args) {
        salary[] arr = {
                new Income(10000),
                new firstIncome(9000),
                new secondIncome(8000)
        };
        double total = 0;
        for (salary income : arr) {
            total = total + income.getTax();
        }
        System.out.println(total);

        //静态字段和静态方法

        Person gao = new Person("xiaogao", 20);
        Person zhan = new Person("xiaozhan", 20);
        Person.number = 21;
        System.out.println(gao.number);
        Person.run(gao);
    }
}
