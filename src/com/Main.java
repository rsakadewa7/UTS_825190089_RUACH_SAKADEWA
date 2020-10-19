package com;

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Mahasiswa> Mahasiswa_Array = new ArrayList<>();

        System.out.println("===================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tTUITION FEE");
        System.out.println("\t\t\t\t\t\t\t\tUNIVERSITY OF TATANEGARA");
        System.out.println("===================================================================================================");

        for (int i = 0; i < 45; i++) {

            int scholarcoursecount = new Random().nextInt(6);
            int thisscholarship = new Random().nextInt(1000);
            int regulercoursecount = new Random().nextInt(6);


            if (scholarcoursecount<=0){
                scholarcoursecount = 1;
            }

            if (regulercoursecount<=0){
                regulercoursecount = 1;
            }

            Mahasiswa schostu = new Beasiswa((Mahasiswa_Array.size()+1) + " , Status : Beasiswa" ,  scholarcoursecount, thisscholarship+10  );
            Mahasiswa_Array.add(schostu);

            Mahasiswa regstu = new Reguler((Mahasiswa_Array.size()+1) + " , Status : Reguler", regulercoursecount);
            Mahasiswa_Array.add(regstu);
        }

        for (int i = 0; i < Mahasiswa_Array.size(); i++) {

                int[] tes = new int[99];
                int npm;
                Random coba = new Random();

                boolean isEqual=false;
                npm = coba.nextInt(90)+10;
                tes[i] =  npm;

                for (int j = 0; j < i; j++) {
                    if(npm == tes[j])
                    {
                        isEqual=true;
                        i--;
                        break;
                    }
                }
                if(!isEqual)
                {System.out.println("Nama : Mahasiswa " + Mahasiswa_Array.get(i).getName() + ", NPM : 8251900" + npm + ", Biaya Perkuliahan(Juta Rupiah) : " + Mahasiswa_Array.get(i).getTuition() );}

        }

        System.out.println("===================================================================================================\n\n");
        System.out.println("===================================================================================================");

    }

}