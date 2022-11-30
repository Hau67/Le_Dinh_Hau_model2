package ss18.thuchanh.service;

import ss18.thuchanh.model.Product;

public interface IServiceproduct {
    void addProduct(Product product);
    void displayProduct(Product product);
    void search(Product product);
}
