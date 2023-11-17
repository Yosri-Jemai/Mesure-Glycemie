package com.example.yosrijemai_lsi3_mesure_glycemie.model;

public class Patient {
    private int age;
    private boolean jeunez;
    private float mesure;

    public Patient(int age, boolean jeunez, float mesure){
        this.age = age;
        this.jeunez = jeunez;
        this.mesure = mesure;
    }

    public int getAge(){
        return this.age;
    }

    public boolean getJeunez(){
        return  this.jeunez;
    }

    public float getMesure(){
        return  this.mesure;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setJeunez(boolean jeunez){
        this.jeunez = jeunez;
    }

    public void setMesure(float mesure){
        this.mesure = mesure;
    }

    public void calculer(){
        if (jeunez) {
            if (age > 13) {
                if (mesure >= 5.0 && mesure <= 7.2) {

                    System.out.println("Niveau de glycémie est normale");
                } else if (mesure < 5.0) {

                    System.out.println("Niveau de glycémie est trop bas");
                } else if (mesure > 7.2) {

                    System.out.println("Niveau de glycémie est trop élevée");
                }
            } else if (age >= 6 && age <= 12) {
                if (mesure >= 5.0 && mesure <= 10.0) {

                    System.out.println("Niveau de glycémie est normale");
                } else {
                    System.out.println("Niveau de glycémie est trop bas");
                }
            } else if (age < 6) {
                if (mesure >= 5.5 && mesure <= 10.0) {

                    System.out.println("Niveau de glycémie est normale");
                } else {
                    System.out.println("Niveau de glycémie est trop bas");
                }
            }
        } else {
            if (mesure < 10.5) {

                System.out.println("Niveau de glycémie est normale");
            } else {
                System.out.println("Niveau de glycémie est trop élevée");
            }
        }
    }
}
