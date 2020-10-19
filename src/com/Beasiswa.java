package com;

public class Beasiswa extends Mahasiswa implements MataKuliah {

    private final float scholarship;
    private float tuition;

    public Beasiswa(String name, int course_count, float scholarship) {
        super(name, course_count);
        this.scholarship = scholarship;
    }

    public float getTuition(){
        float former_cost = this.getCost();
        if ((former_cost - this.scholarship) >= max_tuition) {
            tuition = max_tuition;
        }
        else if (former_cost - this.scholarship >= 0){
            tuition = this.getCost()-scholarship;
        }
        else if (former_cost - this.scholarship <= 0){
            tuition = 0;
        }
        return this.tuition;
    }

}
