import java.util.ArrayList;
import java.util.List;

public class Proyek {
    public String idProyek;
    public String namaProyek;
    public String lokasi;
    public int anggaran;
    public String status;
    private List<Material> materials; 

    public Proyek(String idProyek, String namaProyek, String lokasi, int anggaran, String status) {
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.lokasi = lokasi;
        this.anggaran = anggaran;
        this.status = status;
        this.materials = new ArrayList<>();
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getAnggaran() {
        return anggaran;
    }

    public int totalBudget() {
        return anggaran;
    }

    public void setLocation(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void displayProject() {
        System.out.println("Proyek: " + namaProyek + ", Lokasi: " + lokasi + ", Anggaran: " + anggaran + ", Status: " + status);
        System.out.println("Daftar Material:");
        for (Material material : materials) {
            material.displayMaterial();
        }
    }

    public String getIdProyek() {
        return idProyek;
    }
}
