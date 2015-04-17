/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jail;



/**
 *
 * @author Nita Tri Andini
 */
public class Jail {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Polisi polisi1 = new Polisi();
        try {
            polisi1.setIdpol("3456782323");
            
                                     }
        catch (Exception a) {
           System.out.println( "Terjadi error :" + a.getMessage());}
        
        try {
            polisi1.setNamaPol("Suparman");
        }
                catch (Exception b) {
            System.out.println("Terjadi error :" +b.getMessage());
        }
                    
        try {
            polisi1.setJabatan("Briptu");
        }
        
        catch (Exception c) {
            System.out.println("Terjadi error :" +c.getMessage());
        }
                    
        
        
        Tahanan tahanan1 = new Tahanan();
       try { 
           tahanan1.setIdtahanan("67686677878781");
               
           }
       catch (Exception d) {
           System.out.println( "Terjadi error :" + d.getMessage());
       }
       
       try {
            tahanan1.setNamatahanan("Munarto");
        }
        
        catch (Exception e) {
            System.out.println("Terjadi error :" +e.getMessage());
        }
       try {
            tahanan1.setUmurTahanan("33");
        }
        
        catch (Exception m) {
            System.out.println("Terjadi error :" +m.getMessage());
        }      
      
       

        Hukuman hukuman1= new Hukuman();
        try {
            hukuman1.setJeniskejahatan("Pencurian");
            
            }
        catch (Exception f) {
            System.out.println("Terjadi error :" +f.getMessage());}
        
        try {
            hukuman1.setDenda("10000000");
        }
        
        catch (Exception g) {
            System.out.println("Terjadi error :" +g.getMessage());
        }
        
                    hukuman1.setHukuman("Kurungan 3 tahun");
        
         
        
        
       Korban korban1= new Korban();
       try {
           korban1.setIdkorban("5217879089797");
           
           
           
       }
       catch (Exception k) {
           System.out.println("Terjadi error :" + k.getMessage());}
       
       try {
            korban1.setNamaKorban("Sholeh");
        }
        
        catch (Exception l) {
            System.out.println("Terjadi error :" +l.getMessage());
        }
       
       
       
       korban1.setKerugian("Kehilangan Laptop, Mas, dan Mobil");
        
       
       
       Sell sell1 = new Sell();
       
       try {
           sell1.setNosell("23");
           
       }
       
       catch (Exception s) {
           System.out.println("Terjadi error :" +s.getMessage());
       }
      
       
        
       
        
        
        
            Laporan laporan1 = new Laporan();
            laporan1.setKodelaporan("B09");
            laporan1.setPolisi(polisi1);
            laporan1.setTahanan(tahanan1);
            laporan1.setKorban(korban1);
            laporan1.setHukuman(hukuman1);
            laporan1.setSell(sell1);
           
           
    
        
        cetakLaporan(laporan1);
    }
        
         static void cetakLaporan(Laporan laporan1){
            
           System.out.println(laporan1.getKodelaporan());  
           System.out.println(laporan1.getPolisi());
           System.out.println(laporan1.getTahanan());
           System.out.println(laporan1.getHukuman());
           System.out.println(laporan1.getKorban());
           System.out.println(laporan1.getSell());
          
            
        }}
    
       
 

        
     
