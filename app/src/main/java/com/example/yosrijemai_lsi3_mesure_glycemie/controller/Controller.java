package com.example.yosrijemai_lsi3_mesure_glycemie.controller;

import com.example.yosrijemai_lsi3_mesure_glycemie.model.Patient;

public class Controller {
    public Patient patient;

    public Controller(){

    }

    public void createPatient(int age, boolean jeunez, float mesure){
        this.patient = new Patient(age, jeunez, mesure);
    }

    public void getResponse(){
        if(patient != null){
            this.patient.calculer();
        }
        else {
            System.out.println("Patient non initialisé");
        }
    }
}
