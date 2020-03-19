package cn.fraudmetrix.edu;

/**
 * 斐波拉切数列：输出前20项，每输出5个数换行
 * 前两个数之和等于后一个数
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        /**
         * 算法一,定义3个变量法
         */
//        int a=1,b=1,c=0;
//        System.out.println("斐波拉切数列前20项为： ");
//        System.out.print(a+'\t'+b+'\t');
//        for (int i=1;i<=18;i++){
//            c=a+b;
//            a=b;
//            b=c;
//            System.out.print(c+'\t');
//            if(i%5==0){
//                System.out.println();
//            }
//        }
        /**
         * 算法二：定义数组法
         */
//        int arr[] = new int[20];
//        arr[0] = arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        System.out.println("斐波那契数列的前20项如下所示：");
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 5 == 0)
//                System.out.println();
//            System.out.print(arr[i] + "\t");
//        }
        /**
         * 算法三：使用递归方法
         */
        System.out.println("斐波那契数列的前20项如下所示：");
        for (int j = 1; j <= 20; j++) {
            System.out.print(getFibo(j) + "\t");
            if (j % 5 == 0)
                System.out.println();
        }

    }
    private static int getFibo(int i){
        if (i == 1 || i == 2)
            return 1;
        else
            return getFibo(i - 1) + getFibo(i - 2);
    }

}
