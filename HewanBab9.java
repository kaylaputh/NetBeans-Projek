/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyHP
 */
public class HewanBab9 {
    public String jenisKelamin;
    public int umur;
    public String warnaBulu;

    // constructor default
    public HewanBab9() {
    }

    // constructor dengan parameter
    public HewanBab9(String jenisKelamin, int umur, String warnaBulu) {
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public String melompat() {
        return "Anjing melompat dengan lincah!";
    }

    public String melompat(String parameter) {
        String perilaku = "Anjing melompati " + parameter + ".";
        return perilaku;
    }

    public void memakan() {
        System.out.println("Anjing sedang memakan daging.");
    }

    public void memakan(String parameter) {
        System.out.println("Anjing sedang memakan " + parameter + ".");
    }

    public static void main(String[] args) {
        HewanBab9 anjing = new HewanBab9();
        anjing.jenisKelamin = "Jantan";
        anjing.umur = 5;
        anjing.warnaBulu = "Cokelat";

        System.out.println("Anjing " + anjing.jenisKelamin + " berumur " + anjing.umur + " tahun berbulu " + anjing.warnaBulu);

        // cara memanggil prosedur
        System.out.println(anjing.melompat("Kursi"));
        // cara memanggil prosedur
        anjing.memakan();
        // cara memanggil prosedur
        anjing.memakan("daging");
    }
}
