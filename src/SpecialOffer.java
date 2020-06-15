class SpecialOffer {
    Product product;
    String description;
    String duration;
    Double promotion;

    SpecialOffer(Product p, String d, String dur, Double promo) {
        product = p;
        description = d;
        duration = dur;
        promotion = promo;
    }

    void showInfo() {
        System.out.println(product.name);
        System.out.println(description);
        System.out.println(duration);
        System.out.println(promotion);
    }

}
