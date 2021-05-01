package bg.softuni.homerestate.models.binding;

import bg.softuni.homerestate.models.entities.enums.Category;
import bg.softuni.homerestate.models.entities.enums.City;
import bg.softuni.homerestate.models.entities.enums.Type;

import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class OfferEditBindingModel {
    private Type type;
    private Category category;
    @Positive(message = "The price must be positive number")
    private BigDecimal price;
    private City city;
    @Size(max = 80, message = "The address should be between 5 and 80 characters long")
    private String address;
    @Positive(message = "The area must be a positive number")
    private Integer area;
    @Positive(message = "The floor must be a positive number")
    private Integer floor;
    @Positive(message = "The number of rooms must be positive")
    private Integer rooms;
//    @Size(min = 0, message = "Description must be at least 5 characters long")
    private String description;
    private List<String> imgUrl = new ArrayList<>();


    public OfferEditBindingModel() {
    }

    public Type getType() {
        return type;
    }

    public OfferEditBindingModel setType(Type type) {
        this.type = type;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public OfferEditBindingModel setCategory(Category category) {
        this.category = category;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEditBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public City getCity() {
        return city;
    }

    public OfferEditBindingModel setCity(City city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public OfferEditBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getArea() {
        return area;
    }

    public OfferEditBindingModel setArea(Integer area) {
        this.area = area;
        return this;
    }

    public Integer getFloor() {
        return floor;
    }

    public OfferEditBindingModel setFloor(Integer floor) {
        this.floor = floor;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEditBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public OfferEditBindingModel setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Integer getRooms() {
        return rooms;
    }

    public OfferEditBindingModel setRooms(Integer rooms) {
        this.rooms = rooms;
        return this;
    }
}
