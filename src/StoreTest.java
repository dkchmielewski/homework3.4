class StoreTest {
    public static void main(String[] args) {
        Category category1 = new Category("Diary", "Delicious diary");
        Product product1 = new Product("Milk", "Whole milk 3.2% fat", 3.99, category1);
        Product product2 = new Product("Cheese", "Swiss cheese", 6.99, category1);
        Category category2 = new Category("Fruits", "Fresh fruits");
        Product product3 = new Product("Bananas", "3kg", 2.99, category2);
        Product product4 = new Product("Beer", "Indian Pale Ale 6-pack", 9.99);

        SpecialOffer offer1 = new SpecialOffer(product3, "Only today buy more and pay less!",
                "6/14/20 - 6/21/20", 0.5);

        product1.showInfo();
        System.out.println();
        product2.showInfo();
        System.out.println();
        product3.showInfo();
        System.out.println();
        product4.showInfoNoCategory();
        System.out.println();
        offer1.showInfo();


    }
}
