package com.rui.primary.array_algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExistRepeatInArray {

    /**
     * title:存在重复
     * des:给定一个整数数组，判断是否存在重复元素。
     * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
     *
     * 示例 1:
     * 输入: [1,2,3,1]
     * 输出: true
     *
     * 示例 2:
     * 输入: [1,2,3,4]
     * 输出: false
     *
     * 示例 3:
     * 输入: [1,1,1,3,3,4,3,2,4,2]
     * 输出: true
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(existRepeatInArray());
    }

    public static boolean existRepeatInArray(){
        int[] ints=new int[4];
        ints[0]=1;
        ints[1]=2;
        ints[2]=3;
        ints[3]=4;
        //解法一，相当的不优雅
       /* for(int i=0;i<ints.length;i++){
            for(int j=i+1;j<ints.length;j++){
                if(ints[i]==ints[j]){
                    return true;
                }
            }
        }*/
        //解法二 利用hashmap key不重复的特性
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<ints.length;i++){
            hashMap.put(ints[i],ints[i]);
        }

        if(ints.length==hashMap.size()){
            return false;
        }else{
            return true;
        }

    }
}
