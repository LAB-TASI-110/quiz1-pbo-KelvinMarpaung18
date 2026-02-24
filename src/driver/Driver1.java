public class Driver1 {
public class StrukPembayaran {
 } public static void main(String[] args) {

        System.out.printf("%-20s %5s %10s %10s\n",
                "Menu", "Porsi", "Harga", "Total");
        System.out.println("=================================================");


       
        String menu1 = "Nasi Padang";
        int porsi1 = 2;
        int harga1 = 25000;
        int total1 = porsi1 * harga1;

        String menu2 = "Rendang";
        int porsi2 = 1;
        int harga2 = 30000;
        int total2 = porsi2 * harga2;

        String menu3 = "Ayam Goreng";
        int porsi3 = 1;
        int harga3 = 22000;
        int total3 = porsi3 * harga3;

        int totalPembayaran = total1 + total2 + total3;

        System.out.printf("%-20s %5d %10d %10d\n",
                menu1, porsi1, harga1, total1);
        System.out.printf("%-20s %5d %10d %10d\n",
                menu2, porsi2, harga2, total2);
        System.out.printf("%-20s %5d %10d %10d\n",
                menu3, porsi3, harga3, total3);

        System.out.println("=================================================");
        System.out.printf("%-20s %26d\n",
                "Total Pembayaran", totalPembayaran);
    }
}    
