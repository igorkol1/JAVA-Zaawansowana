package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fabryka;

public class Main2 {

    public static void main(String[] args) {
        Product simpleProduct = ProductCreator.create(ProductType.SimpleProduct);
        System.out.println(simpleProduct.toString());

        Product advanceProduct = ProductCreator.create(ProductType.AdvancedProduct);
        System.out.println(advanceProduct.toString());
    }
}

