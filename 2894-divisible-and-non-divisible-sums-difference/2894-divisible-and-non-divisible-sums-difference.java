class Solution {
    public static int differenceOfSums(int n, int m) {
        int finalanswer = sumofn1(n, m) - sumofn2(n, m);
        return finalanswer;
    }
    public static int sumofn1(int n, int m){
        int sumOfn1 = 0;
        for(int i =0; i<=n; i++){
            if (i % m != 0){
                sumOfn1 = sumOfn1 + i;
            }
        }
        return sumOfn1;
    }
    public static int sumofn2(int n, int m){
        int sumOfn2 = 0;
        for(int i =0; i<=n; i++){
            if (i % m == 0){
                sumOfn2 = sumOfn2 + i;
            }
        }
        return sumOfn2;
    }
    public static void main(String[] args){
        System.out.print(differenceOfSums(10, 3));
    }
}