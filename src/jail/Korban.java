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
public class Korban {
    
    private String idkorban;
    private String namakorban;
    private String umurkorban;
    private String kerugian;

    /**
     * @return the idkorban
     */
    public String getIdkorban() {
        return idkorban;
    }

    /**
     * @param idkorban the idkorban to set
     * @throws java.lang.Exception
     */
    public void setIdkorban(String idkorban) throws Exception {
      try {
                 Integer.parseInt(idkorban);
        }
        catch (Exception k){
           
            throw new Exception("Harus berupa angka!");}
      
        this.idkorban = idkorban;
    }

    /**
     * @return the nama
     */
    public String getNamaKorban() {
        return namakorban;
    }

    /**
     * @param namakorban
     * @throws java.lang.Exception
     */
    public void setNamaKorban(String namakorban) throws Exception{
                for (char l : namakorban.toCharArray()){
          
                    if( Character.isDigit(l)) {
                                        
        this.namakorban = namakorban;}
                    else {
        throw Exception ("Harus berupa huruf atau karakter ',-,. tidak boleh angka");}
    }}

   
   
    /**
     * @return the kerugian
     */
    public String getKerugian() {
        return kerugian;
    }

    /**
     * @param kerugian the kerugian to set
     */
    public void setKerugian(String kerugian) {
        this.kerugian = kerugian;
    }

    private Exception Exception(String harus_berupa_huruf_atau_karakter__tidak_b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }
