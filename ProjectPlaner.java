/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_n02_a_3112;

/**
 *
 * @author ASUS
 */
public class ProjectPlaner extends Employer {
double uangmakan_3112;
    double tunjangankinerja;
    double tunjanganjabatan;
 
    public ProjectPlaner()
    {
        jabatan_3112="project planner";
        uangmakan_3112=500000.0;
        tunjangankinerja=500000.0;
        tunjanganjabatan=1000000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3112=gajipokok_3112+uangmakan_3112+tunjangankinerja+tunjanganjabatan;
        potongan=(15.0/100.0)*gajikotor_3112;
        gajibersih_3112=gajikotor_3112-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3112);
        System.out.println ("Uang Makan : " +uangmakan_3112);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Tunjangan Jabatan : " +tunjanganjabatan);      
        System.out.println ("Gaji Kotor : " +gajikotor_3112);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3112);
     
        return gajibersih_3112;
    }    
}
