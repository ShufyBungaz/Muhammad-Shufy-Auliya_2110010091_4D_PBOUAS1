
package pbo;

public class contohdetail extends contohplat{
    //overriding
    
    
    public contohdetail(String namamobil, String plat) {
        super(plat, namamobil);
    }

    public String getProvinsi() {
        String kodeProvinsi = getPlat().substring(0, 2);
        //seleksi swicth
        switch(kodeProvinsi) {
            case "DA":
                return "Kalimantan selatan";
            case "KH":
                return "Kalimantan Tengah";
            case "KT":
                return "Kalimantan Timut";
            case "KB":
                return "Kalimantan Barat";
            case "KU":
                return "Kalimantan Utara";
            default:
                return "Provinsi lain";
        }
    }
    
    public int getNomorseri(){
          return Integer.parseInt(getPlat().substring(2, 6));   
    }
    
    public String getKabupaten(){
        String kodekabupaten = getPlat().substring(6, 8);
        //seleksi swicth
        switch(kodekabupaten) {
            case "01":
                return "Kandangan(kalsel)";
            case "02":
                return "Muara Teweh(Kalteng)";
            case "DL":
                return "Bontang(Kaltim)";
            case "LP":
                return "Landak(Kalbar)";
            case "SB":
                return "Malinau(Kalut)";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nProvinsi = "+getProvinsi()+
            "\nNomorseri = "+getNomorseri()+
            "\nkabupaten = "+getKabupaten();
        }
    
}
