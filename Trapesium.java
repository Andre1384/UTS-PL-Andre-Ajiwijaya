import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trapesium {
    public static void main(String[] args) {

        String namaFile = "C:\Users\LAB_PENGEMBANGAN-11\trapesium.txt";

        List<DataTrapesium> re = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                DataTrapesium t = new DataTrapesium();
                t.A = Integer.parseInt(row [0]);
                t.B = Integer.parseInt(row [1]);
                t.T = Integer.parseInt(row [2]);

                re.add(t);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        for(DataTrapesium an : re) {
            double DataTrapesium = an.Luas();
            System.out.println("Luas Trapesium adalah: " + DataTrapesium);
        }
        for(DataTrapesium en : re) {
            double DataTrapesium = en.Kell();
            System.out.println("Keliling Trapesium adalah: " + DataTrapesium);
        }
    }
}
