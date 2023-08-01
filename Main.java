
public class Main {
    public static void main(String[] args) {
      
        // Membuat objek buku dan elektronik
        Book book = new Book("komunikasi data", 200_000, "Hilda");
        Electronic electronic = new Electronic("Smartphone", 2_500_000, "vivo");

        // Menampilkan informasi produk
        System.out.println("Informasi Buku:");
        System.out.println("Nama Buku: " + book.getProductName());
        System.out.println("Harga Buku: " + book.getPrice());
        System.out.println("Penulis Buku: " + book.getAuthor());
        System.out.println("Total Harga (3 buku): " + book.calculateTotalPrice(3));

        System.out.println("\nInformasi Elektronik:");
        System.out.println("Nama Elektronik: " + electronic.getProductName());
        System.out.println("Harga Elektronik: " + electronic.getPrice());
        System.out.println("Merek Elektronik: " + electronic.getBrand());
        System.out.println("Total Harga (2 unit): " + electronic.calculateTotalPrice(2));
    }
}