/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;
import java.util.Scanner;
/**
 *
 * @author USER
 */


    /**
     * @param args the command line arguments
     */
    
        
 
public class KasirEkspedisi {



    static int wadah(String pack){
        int biaya=0;
        if(pack.equalsIgnoreCase("Tidak Ada")){
            biaya = 0;
        }else if(pack.equalsIgnoreCase("Bubble Wrap")){
            biaya = 2000;
        }else if(pack.equalsIgnoreCase("Kayu")){
            biaya = 10000;
        }else if(pack.equalsIgnoreCase("Kardus")){
            biaya = 5000;
        }
        return biaya;
    }
    
    static double berat(double bb){
        int biaya = 0;
        if(bb<=1){
            biaya = 0;
                       
        }else if(bb>1 && bb<=7){
            biaya = 3000;
            
        }else if(bb>7 && bb<=15){
            biaya = 5000;
        }
        return biaya;
    }
    
    static int layanan(String jp){
        int ongkos = 0;
        
        if(jp.equalsIgnoreCase("Cargo")){
            ongkos = 40000;
        }else{
            ongkos = 15000;
        }
        return ongkos;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String jatim [] = {"Bangkalan","Banyuwangi","Blitar","Bojonegoro"
                ,"Bondowoso","Gresik","Jember","Jombang","Kediri","Lamongan","Lumajang"
                ,"Madiun","Magetan","Malang","Mojokerto","Nganjuk","Ngawi","Pacitan"
                ,"Pamekasan","Pasuruan","Ponorogo","Probolinggo","Sampang","Sidoarjo"
                ,"Situbondo","Sumenep","Trenggalek","Tuban","Tulungagung","Surabaya"};
        
        String jateng [] = {"Banjarnegara","Banyumas","Batang","Blora","Boyolali"
                ,"Brebes","Cilacap","Demak","Grobongan","Jepara","Karanganyar","Kebumen"
                ,"Kendal","Klaten","Kudus","Magelang","Pati","Pekalongan","Pemalang"
                ,"Purbalingga","Purworejo","Rembang","Semarang","Sragen","Sukoharjo"
                ,"Salatiga","Surakarta","Tegal","temanggung","Wonogiri","Wonosobo"};
        
        int[] tarif = {50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000
                      ,65000,65000,65000,65000,65000,65000,65000,65000,65000,65000,65000,65000,65000
                      ,65000,65000,65000,65000};
        int [] tarif1 = {90000,90000,90000,90000,90000,90000,90000,90000,90000,90000,90000,90000,90000,90000,90000
                        ,110000,110000,110000,110000,110000,110000,110000,110000,110000,110000,110000,110000,110000
                        ,110000,110000,110000};
       
        System.out.println("==========================EKSPEDISI SI RYAN========================");
        System.out.println("-----------------------------Pengiriman----------------------------");
        System.out.println("Provinsi \t: JAWA TIMUR ");
        System.out.println("Kota \t\t: SURABAYA ");
        System.out.print("Pengirim \t: ");
        String pengirim = sc.nextLine();
        System.out.print("No. Telepon \t: ");
        String tlp =  sc.nextLine();
        System.out.print("Kecamatan \t: ");
        String kec = sc.nextLine(); 
        System.out.print("Alamat Lengkap  : ");
        String alamat = sc.nextLine();
        System.out.println("");
        
        int harga = 0;
        int i =0;
        String kota = null;
        String kode = null;
        System.out.println("-------------------------Tujuan Pengiriman-------------------------");
        System.out.print("Provinsi Jawa Timur/Jawa Tengah \t: ");
        String prov = sc.nextLine();
        if(prov.equalsIgnoreCase("Jawa Timur")){
            kode = "JATIM";
            System.out.print("Kota \t\t: ");         
            kota = sc.nextLine();
            for( i=0; i<jatim.length; i++){
                if(kota.equalsIgnoreCase(jatim[i])){
                    harga=tarif[i];
                }
            }                               
        }else if(prov.equalsIgnoreCase("Jawa Tengah")){
            kode = "JATENG";
            System.out.print("Kota \t\t: ");         
            kota = sc.nextLine();
            for( i=0; i<jateng.length; i++){
                if(kota.equalsIgnoreCase(jateng[i])){
                    harga=tarif1[i];
                }
            }                    
        }else{
            System.out.println("\t\t\t ===PROVINSI TIDAK TERDAFTAR===");
        }
        
        System.out.print("Penerima \t: ");
        String penerima = sc.nextLine();
        System.out.print("No. Telepon \t: ");
        String tlpn = sc.nextLine();
        System.out.print("Kecamatan \t: ");
        String kecp = sc.nextLine();
        System.out.print("Alamat Lengkap  : ");
        String address = sc.nextLine();
        System.out.println("");
        
        System.out.println("==========================Informasi Barang=========================");
        System.out.println("-------------------------Pilih Jenis Barang------------------------");
        System.out.println("1. Reguler ");
        System.out.println("2. Pecah Belah ");
        System.out.print("Jenis Barang : ");
        String jenis = sc.nextLine();
        System.out.print("Deskripsi Barang : ");
        String des = sc.nextLine();
        System.out.println("");
        
        System.out.println("------------------------Pilih Jenis Pengiriman------------------------");
        System.out.println("1. Cargo");
        System.out.println("2. Reguler");
        System.out.print("Jenis Layanan : ");
        String jp = sc.nextLine();
        System.out.println("Biaya : " +"Rp. "+ layanan(jp));
        System.out.println("");
        
        System.out.println("--------------------------Jenis Packaging--------------------------");
        System.out.println("1. Bubble Wrap");
        System.out.println("2. Kayu");
        System.out.println("3. Kardus");
        System.out.println("4. Tidak Ada");
        System.out.print("Pacakging : ");
        String pack = sc.nextLine();
        System.out.println("Biaya Packaging : "+"Rp. " + wadah(pack));
        
        System.out.print("Jumlah Barang : ");
        int jmlbrg = sc.nextInt();
        
        System.out.print("Berat Barang (Kg) : ");
        double bb = sc.nextDouble();
        
        System.out.println("Biaya Tambahan : "+"Rp. " + (int)berat(bb));
        
        System.out.println("Biaya Kirim : Rp. " + harga);
                 
        System.out.println("");
      
        int total = layanan(jp) + wadah(pack) + (int)berat(bb) + harga;
        System.out.println("Total Biaya yang Harus Dibayarkan : "+"Rp. " + total);
        
      
        System.out.print("Masukkan jumlah uang: Rp. ");
        double jumlahUang = sc.nextDouble();

        double kembalian = jumlahUang - total;

        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp. " + kembalian);
        } else {
            System.out.println("Nominal Uang Kurang");
        }

  
        for(i = 0; i<3; i++){
            System.out.println("");
        }
        System.out.print("Cetak Resi (Y/T)?");
        String cetak = sc.next();
        if(cetak.equalsIgnoreCase("Y")){
            System.out.println("________________________________________________________________________________");
            System.out.println("");
            System.out.println("=====================================RESI========================================");
            System.out.println("SI RYAN JAWA TIMUR N JAWA TENGAH");
            System.out.println("RUNGKUT ASRI TIMUR, RUNGKUT KIDUL, GUNUNG ANYAR");
            System.out.println("SURABAYA");
            System.out.println("Kode Pos : 60293");
            System.out.println("Telepon : 0812 1659 6184");
            System.out.println("================================================================================");     
            System.out.println("-------------Asal Pengiriman------------------Tujuan Pengiriman-----------------");
            System.out.println("Provinsi \t: JAWA TIMUR \t\t Provinsi \t : " + prov);
            System.out.println("Kota \t\t: SURABAYA     \t\t Kota \t\t : " + kota);
            System.out.println("");

            System.out.println("Pengirim : ---------------------------------------------------------------------");
            System.out.println(pengirim + "\t\t\t\t\t" + "No. Telp: " + "\n" + kec + "\t\t\t\t" +  tlp + "\n" + alamat);
            System.out.println("");
            System.out.println("Penerima : ---------------------------------------------------------------------");
            System.out.println(penerima + "\t\t\t\t\t" + "No. Telp: " + "\n" + kec + "\t\t\t\t" +  tlpn + "\n" + address);
            System.out.println("................................................................................");
            System.out.println("\t\t    RESI \t" + kode + "184" + tlp + jmlbrg + (int)bb);
            System.out.println("................................................................................");
            System.out.println("");
            System.out.println("DETAIL BARANG                                                    Biaya ");
            System.out.println("Jenis Barang  : " + jenis);
            System.out.println("Deskripsi     : " + des);
            System.out.println("Jumlah Barang : " + jmlbrg + " Buah");
            System.out.println("Packaging     : " + pack + "\t\t\t\t\t\tRp." + wadah(pack));        
            System.out.println("Berat Barang  : " + bb + " Kg" + "\t\t\t\t\t\tRp." + (int)berat(bb));
            System.out.println("Service       : " + jp + "\t\t\t\t\t\tRp." + layanan(jp));
            System.out.println("Biaya Kirim   : " + "\t\t\t\t\t\tRp." + harga);
            System.out.println("===================================TRANSAKSI====================================");
            System.out.println("Total Biaya   :                                                 " + "Rp." + total);
            System.out.println("Tunai         :                                                 " + "Rp." + jumlahUang);
            System.out.println("Kembalian     :                                                 " + "Rp." + kembalian);
            System.out.println("--------------------------------------------------------------------------------");

            System.out.println("================================================================================");
            System.out.println("________________________________________________________________________________");
        }else{
            System.out.println("********** TERIMAKASIH EHE :v *********");
        }
    }
}
       
    
         
