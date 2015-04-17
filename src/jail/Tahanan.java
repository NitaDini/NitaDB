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
public class Tahanan {
   
   
    private String idtahanan;
    private String namatahanan;
    private String umurtahanan;

    /**
     * @return the idtahanan
     */
    public String getIdtahanan() {
        return idtahanan;
    }

    /**
     * @param idtahanan the idtahanan to set
     * @throws java.lang.Exception
     */
    public void setIdtahanan(String idtahanan) throws Exception {
        try {
            Integer.parseInt(idtahanan);
        }
        catch (Exception d) {
            
            throw Exception ("Harus berupa angka-angka!");
        }
        this.idtahanan = idtahanan;
    }

    /**
     * @return the namatahanan
     */
    public String getNamatahanan() {
        return namatahanan;
    }

    /**
     * @param namatahanan the namatahanan to set
     * @throws java.lang.Exception
     */
    public void setNamatahanan(String namatahanan) throws Exception { 
        
        for (char e : namatahanan.toCharArray()){
          
                    if( Character.isDigit(e)) {
                        
                        throw Exception ("Harus berupa huruf atau karakter ',-,. tidak boleh angka");
                    }
        } this.namatahanan = namatahanan;          
                      }

    private Exception Exception(String harus_berupa_angkaangka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     /**
     * @return the umur
     */
    public String getUmurTahanan() {
        return umurtahanan;
    }

    /**
     * @param umurtahanan
     * @throws java.lang.Exception
     */
    public void setUmurTahanan(String umurtahanan) throws Exception {
        try {
            
            Integer.parseInt(umurtahanan);
        }
        catch (Exception m){
           
            throw new Exception("Harus berupa angka");
        }
            if (umurtahanan.length()>=1 && umurtahanan.length()<=2)
            this.umurtahanan = umurtahanan;
    }

}