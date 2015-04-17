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
public class Hukuman {
    
    
    private String jeniskejahatan;
    private String hukuman;
    private String denda;
 
    

    /**
     * @return the jeniskejahatan
     */
    public String getJeniskejahatan() {
        return jeniskejahatan;
    }

    /**
     * @param jeniskejahatan the jeniskejahatan to set
     * @throws java.lang.Exception
     */
    public void setJeniskejahatan(String jeniskejahatan) throws Exception {
        
        for (char f : jeniskejahatan.toCharArray()) {
            
            if (Character.isDigit(f)){
                
                throw Exception ("Hanya Diisi dengan Huruf-huruf tidak yang lain!");
            }}
        this.jeniskejahatan = jeniskejahatan;
    }
    
   
    /**
     * @return the hukuman
     */
    public String getHukuman() {
        return hukuman;
    }

    /**
     * @param hukuman the hukuman to set
     */
    public void setHukuman(String hukuman) {
        this.hukuman = hukuman;
    }

    /**
     * @return the denda
     */
    public String getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     * @throws java.lang.Exception
     */
    public void setDenda(String denda) throws Exception{
        
        try {
            Integer.parseInt(denda);
                    }
        catch (Exception g){
            throw Exception ("Masukan nominal uangnya tanpa ada hal lainnya");
            
        }
        this.denda = denda;
    }

    private Exception Exception(String hanya_Diisi_dengan_Hurufhuruf_tidak_yang_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the jenishukuman
     */
  
    }
    