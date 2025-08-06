/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab3;

/**
 *
 * @author PC 24 - LAB R1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
public class Bab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.print("halo dunia");
//        System.out.println("halo" + "" + "Dunia");
//        System.out.println(2 + "" + 5);
//        System.out.println(2 + 5);
//        System.out.println("Angka" + "" + 5);
//        System.out.println("2+5" + "=" + 2 + 5);
//        System.out.println("2+5" + "=" + (2 + 5));
//        
//        String namaDepan = "";
//        String namaBelakang = "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nama Depan : ");
//        //membaca inputan user
//        namaDepan = input.next();
//        System.out.println("Nama Belakang : ");
//        //membaca inputan user
//        namaBelakang = input.next();
//        System.out.println("Nama Saya adalah :");
//        System.out.println(namaDepan + " " + namaBelakang);
//        
     
//        String namaDepan = "";
//        String namaBelakang = "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nama Depan : ");
//        //membaca inputan user
//        namaDepan = input.next();
//        System.out.println("Nama Belakang : ");
//        //membaca inputan user
//        namaBelakang = input.next();
//        System.out.println("Nama Saya adalah :");
//        System.out.println(namaDepan + " " + namaBelakang);

//          String a =JOptionPane.showInputDialog("Masukan nilai untuk variabel a : ");
//          String b =JOptionPane.showInputDialog("Masukan nilai untuk variabel b : ");
//          System.out.println("Hasil :" +(Integer.parseInt(a) *Integer.parseInt(b)));

          JOptionPane.showMessageDialog(
          null, "Sebuah peringatan.","Peringatan",
          JOptionPane.WARNING_MESSAGE);
          
          JOptionPane.showMessageDialog(
              null, "Sebuah Pertanyaan.", "Pertanyaan",
              JOptionPane.QUESTION_MESSAGE);
            
          JOptionPane.showMessageDialog(null, "Sebuah Plain Message."
                  ,"Plain Message",JOptionPane.PLAIN_MESSAGE);

          { int pertanyaan =
          JOptionPane.showConfirmDialog(null, "Pilih Yes atau No ?", "Pertanyaan", JOptionPane. YES_NO_OPTION);
          if (JOptionPane. YES_OPTION == pertanyaan) {
          JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
          }else if(JOptionPane.NO_OPTION == pertanyaan) {
          JOptionPane.showMessageDialog(null, "Kamu memilih No."); }}



          }
        
    }
      
  

  
    
