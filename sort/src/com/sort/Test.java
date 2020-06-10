package com.sort;

import java.sql.Time;

public class Test {

    public static void main(String[] args) {
        Utils u = new Utils();
        int[] a = {12, 23, 34, 21, 32, 55, 76, 35, 87, 99, 1, 5, 22, 56, 78, 98, 46};
        long startTime=System.currentTimeMillis();   //获取开始时间
        System.out.println("开始时间："+ startTime);
        System.out.println("------------------------ 快速排序开始 ---------------------");
        System.out.print("排序前：");
        u.printInt(a);

        //---------- 直接插入排序
        /*InsertSort insertSort = new InsertSort();
        insertSort.insertSort01(a);*/

        //----------- 冒泡排序
        /*BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);*/

        //---------- 选择排序
        ChooseSort chooseSort = new ChooseSort();
        chooseSort.chooseSort(a);

        //---------- 希尔排序
        /*HillSort hillSort = new HillSort();
        hillSort.hillSort(a);*/

        //---------- 快速排序
        /*FastSort fastSort = new FastSort();
        fastSort.fastSort(a);*/




        System.out.print("\n排序后：");
        u.printInt(a);
        System.out.println("\n------------------------ 冒泡排序结束 ---------------------");
       long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("结束时间："+endTime);
        System.out.println("总花费时间：" + (endTime - startTime) + "ms");
    }
}
