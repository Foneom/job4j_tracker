package ru.job4j.block_2oop.pojo;


public class Shop {

    public Product[] delete(Product[] products, int index) {
            for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public void print(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Product[] products = new Product[6];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        shop.delete(products, 1);
        shop.print(products, 1);
    }
}