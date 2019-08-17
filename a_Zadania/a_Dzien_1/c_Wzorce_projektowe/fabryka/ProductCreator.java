package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.fabryka;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ProductCreator {

    public static Product create(ProductType productType) {
        switch (productType) {
            case SimpleProduct:
                return new SimpleProduct();
            case VirtualProducy:
                return new VirtualProduct();
            case AdvancedProduct:
                return new AdvancedProduct();
            default:
                throw new NotImplementedException();
        }
    }

}
