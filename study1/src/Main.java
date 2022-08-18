public class Main {
    public static void main(String[] args) {
        Lesson a = new Lesson();
        a.age = 20;
        a.name = "高琬琪";
        a.sex = '女';
        System.out.println(a.name + ',' + a.sex + ',' + a.age + '岁');
        System.out.println("\n"+"九九乘法表");
        a.multiplication();
        System.out.println("\n"+"水仙花数");
        a.daffodil();
        System.out.println("\n"+"斐波那契数列");
        a.fiboracci(20);
    }
}