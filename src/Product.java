class Product {
    String name;
    String description;
    Double price;
    Category category;

    Product(String n, String d, Double p, Category c) {
        name = n;
        description = d;
        price = p;
        category = c;
    }

    Product(String n, String d, Double p) {
        name = n;
        description = d;
        price = p;
    }

    void showInfoNoCategory() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);

    }

    void showInfo() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(category.name);
        System.out.println(category.description);
    }

}
