package com.genspark.studentAssign1.entity;

public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }


    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
