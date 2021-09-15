package com.company;

public class Main {

    public static void main(String[] args) {
	//Homework 1:
    int[] ints_1 = {2, 5, -3, 11, 193, -2};
    int sum_of_ints = 0;
    for(int one_int : ints_1) {
        System.out.print(one_int + " ");
        sum_of_ints += one_int;
    }
        System.out.println("sum: " + sum_of_ints);

    //Homework 2:
    int[] nums = {3, 5, 0, 11, 1};
    int count = 0;
    int sum = 0;

    for (int i = 0; i <= 4; i++) {
        if (!(nums[i] == 0)) {
            sum += nums[i];
            count++;
        }
    }

    if (count == 0)
        System.out.println(0);
    else
        System.out.println(sum / count);

    //Homework 3:
    int[] values = {-3, 2, 5, 4, 7};
    boolean result = true;

    for (int n = 1;result == true && n < 5; n++) {
        if (values[n] < values[n - 1]) {
            result = false;
        }
    }
        System.out.println(result);

    //Homework 4:
    int[] ints_4 = {5, 4, -7, -2, -1};
    for (int index = ints_4.length - 1; index >= 0; index--) {
        System.out.print(ints_4[index] + " ");
    }
        System.out.println("");

    //Homework 5:
    int[] ints_5 = {-3, 2, 6, -11};
    int [] cumulative_sums = new int[ints_5.length];
    for (int n = 0; n < cumulative_sums.length; n++) {
        int one_sum = 0;
        for (int i = 0; i <= n; i++) {
            one_sum += ints_5[i];
        }
        cumulative_sums[n] = one_sum;
    }
    for (int one_int : cumulative_sums) {
        System.out.print(one_int + " ");
    }

        System.out.println(" ");

    //Homework 6:
    int[] ints_6 = {4, -3, -5, 9, 1, 11};
    final int m = 1;
    int[] smaller_ints = new int[ints_6.length];
    int[] larger_ints = new int[ints_6.length];
    int smaller_ints_index = 0;
    int larger_ints_index = 0;

    for (int one_int : ints_6) {
        if (one_int < m) {
            smaller_ints[smaller_ints_index] = one_int;
            smaller_ints_index++;
        }
        if (one_int > m) {
            larger_ints[larger_ints_index] = one_int;
            larger_ints_index++;
        }
    }

    System.out.print("smaller: ");
    for (int small : smaller_ints) {
        if (small == 0)
            break;
        System.out.print(small + " ");
    }

    System.out.println(" ");
    System.out.print("larger: ");
    for (int large : larger_ints) {
        if (large == 0)
            break;
        System.out.print(large + " ");
    }

    }
}
