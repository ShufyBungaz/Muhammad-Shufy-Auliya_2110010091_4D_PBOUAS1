
package pbo;

import java.util.Scanner;

public class contohplatberaksi {
     public static void main(String[] args) {
        //objek
        //contohplat = new contohplat(""Shufy");
        
        //System.out.println(contohplat.displayInfo());
        //System.out.println(contohplat.displayInfo("Provinsi"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        contohdetail[] mobil = new contohdetail[2];
        
        //perulangan
        for(int i =0; i<mobil.length;i++){  
        System.out.print(" Masukkan plat"+(i+1)+" = ");
        String plat = scanner.nextLine();
        System.out.print(" Masukkan namamobil  "+(i+1)+" = ");
        String namamobil = scanner.nextLine();
        
        //objek
        mobil[i] = new contohdetail(plat,namamobil);
        }
        
        //perulangan
        for(contohdetail data : mobil) {
            System.out.println("====================");
            System.out.println("Nomor Seri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format plat "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format namamobil"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
    
}
