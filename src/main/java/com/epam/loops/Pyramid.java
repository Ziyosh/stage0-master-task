package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for(int i=1; i<=cathetusLength; i++){
            for(int j=i; j<=cathetusLength-1; j++){
                System.out.print(" ");
            }

            for(int k=i; k>0; k--){
                System.out.print(k + "");
            }

            for(int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(7);

    }

}
