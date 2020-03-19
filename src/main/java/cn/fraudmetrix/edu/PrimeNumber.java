package cn.fraudmetrix.edu;

/**
 * 求1-100内的质数（素数）
 * 只能被1和它本身外，不能被其他自然数（0除外）整除
 */
public class PrimeNumber {
    public static void main(String[] args) {
        for(int n=1;n<=100;n++){
            boolean b=true;
            if(n!=1){
                for (int i=2;i<n;i++){
                    if (n%i==0){
                        b=false;
                        break;
                    }
                }
            }
            if (b){
                System.out.println(n+"是质数");
            }
        }

    }
}
