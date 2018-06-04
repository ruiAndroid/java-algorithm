package com.rui.primary.array_algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * title:从排序数组中删除重复项
 * des:给定一个排序数组,你需要在原地删除重复出现的元素,使得每个元素只出现一次,返回移除后数组的新长度
 * 不要使用额外的数组空间,必须在原地修改输入数组并在使用O(1)额外空间的条件下完成
 */
public class DelRepeatInArray {
    public static void main(String[] args) {
        //先初始化一个有序的数组
        delRepeat();
    }
    /**
     * 对有序数组进行去重
     * 返回去重后的数组的长度
     */
    private static void delRepeat() {
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 3;
        ints[4] = 4;
        //快慢指针法1 1 2 3 4
        int slow = 1;
        for (int fast = 1; fast < ints.length; fast++) {
            if (ints[fast] != ints[slow - 1]) {
                ints[slow] = ints[fast];
                slow++;
            }
        }
    }
}
