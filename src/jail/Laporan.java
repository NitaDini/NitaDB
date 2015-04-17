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
public class Laporan {
    private String kodelaporan;
    private Polisi polisi;
    private Tahanan tahanan;
    private Hukuman hukuman;
    private Korban korban;
    private Sell sell;

    /**
     * @return the kodelaporan
     */
    public String getKodelaporan() {
        return kodelaporan;
    }

    /**
     * @param kodelaporan the kodelaporan to set
     */
    public void setKodelaporan(String kodelaporan) {
        this.kodelaporan = kodelaporan;
    }

    /**
     * @return the polisi
     */
    public Polisi getPolisi() {
        return polisi;
    }

    /**
     * @param polisi the polisi to set
     */
    public void setPolisi(Polisi polisi) {
        this.polisi = polisi;
    }

    /**
     * @return the tahanan
     */
    public Tahanan getTahanan() {
        return tahanan;
    }

    /**
     * @param tahanan the tahanan to set
     */
    public void setTahanan(Tahanan tahanan) {
        this.tahanan = tahanan;
    }

    /**
     * @return the hukuman
     */
    public Hukuman getHukuman() {
        return hukuman;
    }

    /**
     * @param hukuman the hukuman to set
     */
    public void setHukuman(Hukuman hukuman) {
        this.hukuman = hukuman;
    }

    /**
     * @return the korban
     */
    public Korban getKorban() {
        return korban;
    }

    /**
     * @param korban the korban to set
     */
    public void setKorban(Korban korban) {
        this.korban = korban;
    }

    /**
     * @return the sell
     */
    public Sell getSell() {
        return sell;
    }

    /**
     * @param sell the sell to set
     */
    public void setSell(Sell sell) {
        this.sell = sell;
    }
    
    
}
