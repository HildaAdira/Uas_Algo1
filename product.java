
    // Contoh penggunaan class abstract pada sistem pembayaran produk

// Class abstract Product yang mengandung informasi umum tentang produk
abstract class Product {
    protected String productName;
    protected double price;

    // Constructor untuk menginisialisasi nama produk dan harga
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method abstract untuk menghitung total harga
    public abstract double calculateTotalPrice(int quantity);

    // Getter untuk mendapatkan nama produk
    public String getProductName() {
        return productName;
    }

    // Getter untuk mendapatkan harga produk
    public double getPrice() {
        return price;
    }
}

// Class Book merupakan subclass dari Product
class Book extends Product {
    private String author;

    // Constructor untuk menginisialisasi data buku
    public Book(String productName, double price, String author) {
        super(productName, price);
        this.author = author;
    }

    // Implementasi method abstract untuk menghitung total harga buku
    @Override
    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }

    // Getter untuk mendapatkan nama penulis buku
    public String getAuthor() {
        return author;
    }
}

// Class Electronic merupakan subclass dari Product
class Electronic extends Product {
    private String brand;

    // Constructor untuk menginisialisasi data elektronik
    public Electronic(String productName, double price, String brand) {
        super(productName, price);
        this.brand = brand;
    }

    // Implementasi method abstract untuk menghitung total harga elektronik
    @Override
    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }

    // Getter untuk mendapatkan merek elektronik
    public String getBrand() {
        return brand;
    }
}