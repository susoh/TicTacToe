package com.example;

public class Field {
    public char campo[][];

    public Field() {
        this.campo = new char[3][3];
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                campo[i][j] = ' ';
            }
        }
    }

    
}
