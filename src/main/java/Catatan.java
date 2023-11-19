public class Catatan {
    //class catatan memiliki atribut tanggal, tema, dan isi
    String tanggal, tema, isi;

    //konstruktor dengan parameter untuk menginisialisasikan atau mengisi atribut
    public Catatan(String tanggal, String tema, String isi) {
        this.tanggal = tanggal;
        this.tema = tema;
        this.isi = isi;
    }

    // Konstruktor kosong untuk menginisialisasi atribut dengan nilai default dengan string kosong.
    public Catatan() {
        this.tanggal = "";
        this.tema = "";
        this.isi = "";
    }

    /**
     * line 23-45
     * merupakan getter and setter yang berfungsi memungkinkan akses dan modifikasi nilai dari atribut class catatan
     */
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
    
}
