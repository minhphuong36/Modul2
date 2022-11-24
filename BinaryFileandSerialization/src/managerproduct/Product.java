package managerproduct;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String localBrand;
    private double priceProduct;

    public Product(String codeProduct, String nameProduct, String localBrand, double priceProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.localBrand = localBrand;
        this.priceProduct = priceProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getLocalBrand() {
        return localBrand;
    }

    public void setLocalBrand(String localBrand) {
        this.localBrand = localBrand;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return codeProduct + " " +  nameProduct + " "+ localBrand +" "+ priceProduct ;
    }


}