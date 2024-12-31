import java.util.*;

public class HospitalApp {
    public static void main(String[] args) {
        ArrayList<Dokter> daftarDokter = new ArrayList<>();
        Admin admin = new Admin("A001", "Admin Satu", "admin@hospital.com", "admin123");
        User user = new User("U001", "User Satu", "user@hospital.com", "user123");

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Rumah Sakit ===");
            System.out.println("1. Tambah Dokter (Admin)");
            System.out.println("2. Lihat Dokter");
            System.out.println("3. Tambah Jadwal Dokter");
            System.out.println("4. Buat Reservasi (User)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Dokter: ");
                    String idDokter = scanner.nextLine();
                    System.out.print("Masukkan Nama Dokter: ");
                    String namaDokter = scanner.nextLine();
                    System.out.print("Masukkan Spesialis Dokter: ");
                    String spesialis = scanner.nextLine();
                    Dokter dokter = new Dokter(idDokter, namaDokter, spesialis);
                    admin.addDokter(daftarDokter, dokter);
                    break;

                case 2:
                    System.out.println("Daftar Dokter:");
                    for (Dokter d : daftarDokter) {
                        System.out.println("ID: " + d.getIdDokter() + " | Nama: " + d.getNama() + " | Spesialis: " + d.getSpesialis());
                        d.showJadwal();
                    }
                    break;

                case 3:
                    System.out.println("Pilih Dokter untuk Menambah Jadwal:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i).getNama() + " (" + daftarDokter.get(i).getSpesialis() + ")");
                    }
                    System.out.print("Pilih nomor dokter: ");
                    int pilihDokterJadwal = scanner.nextInt();
                    scanner.nextLine();

                    if (pilihDokterJadwal > 0 && pilihDokterJadwal <= daftarDokter.size()) {
                        Dokter dipilihDokter = daftarDokter.get(pilihDokterJadwal - 1);
                        System.out.print("Masukkan Tanggal (yyyy-MM-dd): ");
                        String tanggalInput = scanner.nextLine();
                        System.out.print("Masukkan Jam Mulai (HH:mm): ");
                        String jamMulai = scanner.nextLine();
                        System.out.print("Masukkan Jam Selesai (HH:mm): ");
                        String jamSelesai = scanner.nextLine();
                        JadwalDokter jadwalBaru = new JadwalDokter(jamMulai, jamSelesai, new Date()); // Simplifikasi dengan Date
                        dipilihDokter.addJadwal(jadwalBaru);
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                    case 4:
                    System.out.println("Pilih Dokter untuk Reservasi:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i).getNama() + " (" + daftarDokter.get(i).getSpesialis() + ")");
                    }
                    System.out.print("Pilih nomor dokter: ");
                    int pilihDokter = scanner.nextInt();
                    scanner.nextLine();
                
                    if (pilihDokter > 0 && pilihDokter <= daftarDokter.size()) {
                        Dokter dipilih = daftarDokter.get(pilihDokter - 1);
                        System.out.print("Masukkan Nama Anda: ");
                        String namaUser = scanner.nextLine();
                        System.out.print("Masukkan Tanggal Reservasi (yyyy-MM-dd): ");
                        String tanggalInput = scanner.nextLine();
                        System.out.print("Masukkan Jam Reservasi (HH:mm): ");
                        String jam = scanner.nextLine();
                        user.buatReservasi(daftarDokter, dipilih, tanggalInput, jam, "Dipesan");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}