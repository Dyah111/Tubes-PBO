import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dokter> dokterList = new ArrayList<>();
        List<Reservasi> reservasiList = new ArrayList<>();

        Admin admin = new Admin("Admin1", "admin1@gmail.com", "admin123", null, null);
        User user = new User("User1", "user1@gmail.com", "user123", null, null);
        Dokter dokter1 = new Dokter("Dokter A", "doktera@gmail.com", "dokter123");
        dokterList.add(dokter1);

        while (true) {
            System.out.println("1. Tambah Jadwal Dokter");
            System.out.println("2. Buat Reservasi");
            System.out.println("3. Batalkan Reservasi");
            System.out.println("4. Lihat Reservasi (Admin)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tanggal (YYYY-MM-DD): ");
                    String tanggal = scanner.nextLine();
                    System.out.print("Masukkan jam (HH:MM): ");
                    String jam = scanner.nextLine();
                    dokter1.tambahJadwal(new JadwalDokter(jam, tanggal, null, dokter1));
                    break;

                case 2:
                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < dokterList.size(); i++) {
                        System.out.println((i + 1) + ". " + dokterList.get(i).getNama() + " - " + dokterList.get(i).getSpesialisasi());
                    }
                    System.out.print("Pilih: ");
                    int dokterIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    Dokter selectedDokter = dokterList.get(dokterIndex);
                    selectedDokter.lihatJadwal();

                    System.out.print("Masukkan tanggal (YYYY-MM-DD): ");
                    String reservasiTanggal = scanner.nextLine();
                    System.out.print("Masukkan jam (HH:MM): ");
                    String reservasiJam = scanner.nextLine();

                    JadwalDokter jadwal = new JadwalDokter(reservasiJam, reservasiTanggal, null, selectedDokter);
                    Reservasi reservasi = new Reservasi(tanggal, user, selectedDokter, null, tanggal, jadwal);
                    reservasiList.add(reservasi);
                    user.buatReservasi(reservasi);
                    break;

                case 3:
                    user.lihatReservasi();
                    System.out.print("Masukkan ID Reservasi untuk dibatalkan: ");
                    String idReservasi = scanner.nextLine();
                    user.batalkanReservasi(idReservasi);
                    reservasiList.removeIf(r -> r.getidReservasi().equals(idReservasi));
                    break;

                case 4:
                    admin.lihatReservasi(reservasiList);
                    break;

                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}