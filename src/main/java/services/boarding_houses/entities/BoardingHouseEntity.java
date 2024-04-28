package services.boarding_houses.entities;

public class BoardingHouseEntity {

    private int id;
    private String name;
    private String image;
    private String size;
    private int price;
    private String address;
    private String description;
    private int quantity;
    private String category;
    private String createdAt;

    public BoardingHouseEntity(int id, String name, String image, String size, int price, String address, String description, int quantity, String category, String createdAt) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.size = size;
        this.price = price;
        this.address = address;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.createdAt = createdAt;
    }

    public BoardingHouseEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
