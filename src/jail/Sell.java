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
public class Sell {
    private String nosell;
   
    /**
     * @return the nosell
     */
    public String getNosell() {
        return nosell;
    }

    /**
     * @param nosell the nosell to set
     * @throws java.lang.Exception
     */
    public void setNosell(String nosell) throws Exception {
               
      try {
            Integer.parseInt(nosell);
        }
        catch (Exception s) {
            
            throw Exception ("Harus berupa angka-angka!");
        }
        this.nosell = nosell;
    }

    private Exception Exception(String harus_berupa_angkaangka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}