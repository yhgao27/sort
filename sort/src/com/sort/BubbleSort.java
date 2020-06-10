package com.sort;

public class BubbleSort {
    Utils u = new Utils();
    public void bubbleSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1-i; j++) {
                int temp = a[j];
                if (a[j] > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("\n第" + i + "轮：");
            u.printInt(a);
        }

    }

}
