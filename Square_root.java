//upload to github

import java.util.Scanner;

class SquareRoot{
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int root = floor_square_root_of(x);
        System.out.println(root);
    }

    static int floor_square_root_of(int num) {

        if (num == 0 || num == 1)
            return num;
        else {
            int start = 0;
            int end = num;
            int mid = (start + end) / 2;
            int ans=0;
            while (start <= end) {
                if (mid * mid == num)  // number is
                    return mid;

                if (mid * mid < num) {
                    start = mid + 1;
                    ans = mid;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
    }
