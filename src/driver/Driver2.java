public class Driver2 {
    class PenjumlahanKelompok {

    }public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String baris = input.nextLine();
        String[] data = baris.split(" ");

        int N = data.length;
        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
            nilai[i] = Integer.parseInt(data[i]);
        }

        int kelompok = input.nextInt();

        int index = 0;
        int total = 0;

        for (int i = 1; i <= kelompok; i++) {

            int jumlahAnggota = i;

            if (i == kelompok) {
                for (int j = 0; j < jumlahAnggota && index < N; j++) {
                    total += nilai[index];
                    index++;
                }
            } else {
                index += jumlahAnggota;
            }
        }

        System.out.println(total);

        input.close();
    }
}
