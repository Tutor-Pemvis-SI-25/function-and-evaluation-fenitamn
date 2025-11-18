//Fenita Simbolon - 12S25017

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namatugas = new String[10], nim = new String[10], matkul = new String[10], dosen = new String[10], deadline = new String[10];
        int i;

        for (i = 0; i <= 9; i++) {
            namatugas[i] = input.nextLine();
            nim[i] = input.nextLine();
            matkul[i] = input.nextLine();
        }
        addtask(namatugas, nim, matkul, dosen, deadline);
    }
    
    public static void addtask(String namatugas, String nim, String matkul, String dosen, String deadline) {
        namatugas = input.nextLine();
        nim = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
        String namatugas, nim, matkul, dosen, deadline;

    }
}
