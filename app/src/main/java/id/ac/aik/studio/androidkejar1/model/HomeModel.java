package id.ac.aik.studio.androidkejar1.model;

/**
 * Created by Imam on 5/14/2017.
 */

public class HomeModel {
    public HomeModel(String nama, String alamat, String email, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noTelp = noTelp;
    }

    private String nama;
    private String alamat;
    private String email;
    private String noTelp;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}
