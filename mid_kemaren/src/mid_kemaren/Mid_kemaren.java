/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_kemaren;

import javax.swing.*;
/**
 *
 * @author ERVAN KURNIAWAN
 * you can add your name for participant at below:
 * Modified by: (your name) :D
 */
public class Mid_kemaren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nmKyTemp;
        String[] jabatanKyTemp = new String[75];
        String[] golKyTemp = new String[75];
        String[] statusKyTemp = new String[75];
        String[] nmKy = new String[75];
        int[] jabatanKy = new int[75];
        int[] gajiKy = new int[75];
        int[] dGol = new int[75];
        int[] tunGol = new int[75];
        int[] dStatus = new int[75];
        int[] tunStatus = new int[75];
        int[] totGaji = new int[75];
        int i = 0;
        nmKyTemp = JOptionPane.showInputDialog("Nama Karyawan : ");
        while (!nmKyTemp.equals("0")) {            
            nmKy[i] = nmKyTemp;
            jabatanKy[i] = Integer.parseInt(JOptionPane.showInputDialog("Jabatan: \n1.Ketua\n2.Wakil\n3.Staff\n\nPilih: "));
            switch(jabatanKy[i]){
                case 1:
                    jabatanKyTemp[i] = "Ketua";
                    gajiKy[i] = 3000000;
                    break;
                case 2:
                    jabatanKyTemp[i] = "Wakil";
                    gajiKy[i] = 2000000;
                    break;
                case 3:
                    jabatanKyTemp[i] = "Staff";
                    gajiKy[i] = 1000000;
                    break;
            }
            dGol[i] = Integer.parseInt(JOptionPane.showInputDialog("Golongan: \n1.IIIA\n2.IIIB\n3.IIIC\n4.IVA\n\nPilih: "));
            switch(dGol[i]){
                case 1:
                    golKyTemp[i] = "IIIA";
                    tunGol[i] = 2000000;
                    break;
                case 2:
                    golKyTemp[i] = "IIIB";
                    tunGol[i] = 1500000;
                    break;
                case 3:
                    golKyTemp[i] = "IIIC";
                    tunGol[i] = 1000000;
                    break;
                case 4:
                    golKyTemp[i] = "IVA";
                    tunGol[i] = 700000;
                    break;
            }
            dStatus[i] = Integer.parseInt(JOptionPane.showInputDialog("Status: \n1.Menikah\n2.Single\n3.Berpisah haha\n\nPilih: "));
            switch(dStatus[i]){
                case 1:
                    statusKyTemp[i] = "Menikah";
                    tunStatus[i] = 500000;
                    break;
                case 2:
                    statusKyTemp[i] = "Single";
                    tunStatus[i] = 250000;
                    break;
                case 3:
                    statusKyTemp[i] = "Berpisah";
                    tunStatus[i] = 100000;
                    break;
            }
            totGaji[i] = gajiKy[i] + tunGol[i] + tunStatus[i];
            i++;
            nmKyTemp = JOptionPane.showInputDialog("Nama Karyawan : ");
        }
        for (int j = 0; nmKy[j] != null; j++) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Nama Karyawan : " + nmKy[j]);
            System.out.println("Jabatan       : " + jabatanKyTemp[j] + "   | Gaji               : " + gajiKy[j]);
            System.out.println("Golongan      : " + golKyTemp[j] + "    | Tunjangan Golongan : " + tunGol[j]);
            System.out.println("Status        : " + statusKyTemp[j] +  " | Status             : " + tunStatus[j]);
            System.out.println("Total Gaji    : " + totGaji[j]);
        }
    }
    
}
