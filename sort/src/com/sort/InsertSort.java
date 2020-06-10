package com.sort;

public class InsertSort {
    Utils u = new Utils();
    public void insertSort01(int[] a) {
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            int j = i-1;
            for (; j >= 0&&a[j] > temp; j--) {  //将前面的每一个数都和temp比一下
                a[j+1] = a[j];  //将大于temp的数整体向后移一位
            }
            a[j+1] = temp;  //直到没有比temp大的以后就把temp赋值到这里
            System.out.print("\n第" + i + "轮：");
            u.printInt(a);
        }

    }
}
