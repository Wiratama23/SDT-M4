import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nama, String kelas, String matkulPraktikum, int nim){
        this.nama = nama;
        this.kelas = kelas;
        this.matkulPraktikum = matkulPraktikum;
        this.nim = nim;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Mamang","4J","Struktur Data",12342));
        mhs.put("2", new Mahasiswa("Damang","4J","Struktur Data",12341));
        mhs.put("3", new Mahasiswa("Bamang","4J","Struktur Data",12340));

        System.out.print("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);

        if(data != null){
            System.out.println("\nData Mahasiswa : " + data.nama + " , Kelas : "
                    + data.kelas + " , Mata Kuliah Praktikum : " + data.matkulPraktikum +
                    " , NIM : " + data.nim);
        }
    }
}