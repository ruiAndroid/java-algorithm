package com.rui.primary.array_algorithm;

import java.util.Arrays;

/**
 * title:旋转数组
 * des:给定一个数组，将数组中的元素向右移动k个位置,其中k是非负数
 * 要求使用空间复杂度为O(1)的原地算法
 */
public class RotateArray {
    public static void main(String[] args) {
        rotateArray();
    }

    public static void rotateArray(){
        int[] ints = new int[5];
        ints[0] = 2;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 3;
        ints[4] = 4;
        int distance=4;
//        int[] result = new int[5];
        for(int i=0;i<ints.length;i++){
            if(i+distance<ints.length){
                ints[i+distance]=ints[i];
            }else{
                ints[i+distance-ints.length]=ints[i];
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
