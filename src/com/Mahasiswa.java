package com;

public abstract class Mahasiswa implements MataKuliah {


    private final String name;
    private final int jumlah_matkul;
    private float cost;


    public Mahasiswa(String name, int jumlah_matkul){
        this.name= name;
        this.jumlah_matkul = jumlah_matkul;
    }


    public float getCost(){
        cost = jumlah_matkul * biaya_matkul;
        return this.cost;
    }


    public float getTuition(){
        cost = getCost();
        float tuition;
        if (cost <= max_tuition) {
            tuition = cost;
        }
        else {
            tuition = max_tuition;
        }
        return tuition;
    }


    public String getName(){
        return this.name;
    }
}

