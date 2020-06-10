package com.sort;

public class ChooseSort {
    Utils u = new Utils();
    public void chooseSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i];
            int tempi = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];//拿到最小的数，临时保存
                    tempi = j;//拿到最小的数的索引
                }
            }
            a[tempi] = a[i];//把要比较的数和最小的数换一下
            a[i] = temp;

            System.out.print("\n第" + i + "轮：");
            u.printInt(a);
        }


    }

}
