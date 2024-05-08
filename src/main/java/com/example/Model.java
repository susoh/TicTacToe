package com.example;

public class Model {
    public static Field campo = new Field();
    public static int s=0;
    public static void placeButton (int x, int y) {
        char segno;
        do{
            if (s%2 == 0) {
                segno = 'X';
            }else{
                segno = 'O';
            }
            s++;
            campo.campo[x][y] = segno;
        }while(turno(x, y, segno, campo.campo));
    }

    public static boolean turno (int x, int y, char segno, char campo[][]) {
        int i = 0;
        int j = 0;
        if ((campo[i][j] == segno && campo[i][j+1] == segno && campo[i][j+2] == segno)||(campo[i+1][j] == segno && campo[i+1][j+1] == segno && campo[i+1][j+2] == segno)||(campo[i+2][j] == segno && campo[i+2][j+1] == segno && campo[i+2][j+2] == segno)) {
            System.out.println("Ha vinto: " + segno);
            PrimaryController.displayWin(segno);            
            return true;
        } else if ((campo[i][j] == segno && campo[i+1][j] == segno && campo[i+2][j] == segno)||(campo[i][j+1] == segno && campo[i+1][j+1] == segno && campo[i+2][j+1] == segno)||(campo[i][j+2] == segno && campo[i+1][j+2] == segno && campo[i+2][j+2] == segno)) {
            System.out.println("Ha vinto: " + segno);
            PrimaryController.displayWin(segno);
            return true;
        } else if ((campo[0][0] == segno && campo[1][1] == segno && campo[2][2] == segno)||(campo[0][2] == segno && campo[1][1] == segno && campo[2][0] == segno)) {
            System.out.println("Ha vinto: " + segno);
            PrimaryController.displayWin(segno);
            return true;
        }
        return false;
    }
    
}
