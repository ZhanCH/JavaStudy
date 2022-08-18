public class Lesson {
        String name;
        int age;
        char sex;
        void multiplication() {
                for (int i = 1; i < 10; i++) {
                        for (int j = 1; j < i + 1; j++) {
                                System.out.print(i + "*" + j + "=" + i * j + "\t");
                                if (i == j) System.out.println();
                        }
                }
        }
        void daffodil(){
                int a,b,c;
                for (int i = 1; i < 1000; i++){
                        a = i % 10;
                        b = (i % 100 - a) / 10;
                        c = (i - a - b * 10) / 100;
                        if (a*a*a+b*b*b+c*c*c==i){
                                System.out.println(i+"是水仙花数");
                        }
                }
        }
        void fiboracci(int n){
                int[] arr = new int[n];
                arr[0] = 1;
                arr[1] = 2;
                for (int i = 2; i < n; i++ ){
                        arr[i] = arr[i-1] + arr[i-2];
                        System.out.print("第"+(i+1)+"项为"+arr[i]+"\t");
                        if (i % 5 == 0) System.out.println();
                }
        }
}
