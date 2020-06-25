package com.apex.test;

import java.util.Scanner;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.apex.test
 * @created : 2019/9/11
 * @description :
 */
public class Test02 {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入要打印的三角形的行数");
        int num=s.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.println("\t*");
            }
            //System.out.println();
        }

           buy(200,1);
    }


      public static void buy(int money,int index){
                   int last_money;
                   int buy_nodels=5;
          switch(index){
              case 1:
                  last_money=money-buy_nodels;
                  System.out.println("买BWM"+"剩余金额:"+last_money);
                  break;
              case 2:
                  System.out.println("买房");
                  break;
              case 3:
                  System.out.println("热干面");
                  break;

          }
      }
}
