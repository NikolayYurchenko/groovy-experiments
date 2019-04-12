package com.example.demo
import java.util.Scanner
import java.util.*
import java.io.*;

class TestMain {

    public static void main(String[] args) {
        int[] fibon = new int [100]
        int indexarray = 2
        fibon[0]=0
        fibon[1]=1
        for (indexarray;indexarray < 100;indexarray++){
            fibon[indexarray] = fibon[indexarray - 1 ] + fibon[indexarray - 2]

        }
        println "Enter number for starting"
        Scanner sc = new Scanner(System.in)
        int userNumb = sc.nextInt()
        for ( int j = 0;j< 100;j++) {
            if (fibon[j] == userNumb){
             while(j < 100){
                 j++
                 println "element $j = " + fibon[j]
             }
            }else{
                println "Your number is not belong to fibonachi numbers"
                break;
                }
            }
        for(int k = 0; k < 100;k++){
            println "elem $k = "  + fibon[k]
          }

        }


    }

