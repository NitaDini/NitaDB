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
public class Polisi {
    
   
    private String idpol;
    private String namapol;
    private String jabatan;
    

    /**
     * @return the idpol
     */
    public String getIdpol() {
        return idpol;
    }

    /**
     * @param idpol the idpol to set
     * @throws java.lang.Exception
     */
    public void setIdpol(String idpol) throws Exception {

        try {
            Integer.parseInt(idpol);

        } catch (Exception a) {
            throw Exception("ID Polisi harus diisi dengan angka!");
        }
        this.idpol = idpol;
    }

    /**
     * @return the nama
     */
    public String getNamaPol() {
        return namapol;
    }

    /**
     * @param namapol
     * @throws java.lang.Exception
     */
    public void setNamaPol(String namapol) throws java.lang.Exception {

        for (char b : namapol.toCharArray()) {
            if (Character.isDigit(b)) {

                throw Exception("Harus berupa huruf atau karakter ',-,. tidak boleh angka");
            }
        }

        this.namapol = namapol;
    }

    /**
     * @return the jabatan
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     * @throws java.lang.Exception
     */
    public void setJabatan(String jabatan) throws Exception {
        for (char c : jabatan.toCharArray()) {

            if (Character.isDigit(c)) {
                throw Exception("Harus berupa Huruf dan tidak yang lain!");
            }
        }
        this.jabatan = jabatan;
    }

    private Exception Exception(String harus_berupa_huruf_atau_karakter__tidak_b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   