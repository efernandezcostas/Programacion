package com.efernandezc.arraybidimensional;

public class ArrayBidimensional {

    public static void main(String[] args) {
        
        String listaBidimensional [][]=new String [8][8];
        
        listaBidimensional[0][0]="T";
        listaBidimensional[0][1]="C";
        listaBidimensional[0][2]="A";
        listaBidimensional[0][3]="Rey";
        listaBidimensional[0][4]="Reina";
        listaBidimensional[0][5]="A";
        listaBidimensional[0][6]="C";
        listaBidimensional[0][7]="T";
        
        listaBidimensional[1][0]="P";
        listaBidimensional[1][1]="P";
        listaBidimensional[1][2]="P";
        listaBidimensional[1][3]="P";
        listaBidimensional[1][4]="P";
        listaBidimensional[1][5]="P";
        listaBidimensional[1][6]="P";
        listaBidimensional[1][7]="P";
        
        listaBidimensional[6][0]="P";
        listaBidimensional[6][1]="P";
        listaBidimensional[6][2]="P";
        listaBidimensional[6][3]="P";
        listaBidimensional[6][4]="P";
        listaBidimensional[6][5]="P";
        listaBidimensional[6][6]="P";
        listaBidimensional[6][7]="P";
        
        listaBidimensional[7][0]="T";
        listaBidimensional[7][1]="C";
        listaBidimensional[7][2]="A";
        listaBidimensional[7][3]="Reina";
        listaBidimensional[7][4]="Rey";
        listaBidimensional[7][5]="A";
        listaBidimensional[7][6]="C";
        listaBidimensional[7][7]="T";
        
        for (String element1[]:listaBidimensional){
            for (String element2:element1){
                if (element2!=null){
                    System.out.print(" |"+element2+"| ");
                }                
            }
        }        
    }
}
