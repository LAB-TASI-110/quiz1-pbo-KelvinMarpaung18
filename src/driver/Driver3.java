public class Driver3 {
    public class LaundryApp {

    }public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("=== SISTEM LAUNDRY ===");

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Nama Asrama    : ");
        String asrama = input.nextLine();

        System.out.print("Jumlah & Jenis Pakaian : ");
        String pakaian = input.nextLine();

        System.out.print("Hari           : ");
        String hari = input.nextLine();

        System.out.print("Tanggal (dd-mm-yyyy) : ");
        String tanggal = input.nextLine();

        System.out.println("\nData Laundry Berhasil Disimpan!");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nama Asrama    : " + asrama);
        System.out.println("Pakaian        : " + pakaian);
        System.out.println("Hari           : " + hari);
        System.out.println("Tanggal        : " + tanggal);

        input.close();
    }
}

