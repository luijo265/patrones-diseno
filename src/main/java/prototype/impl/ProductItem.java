package prototype.impl;

/**
 * @author oscar javier blancarte iturralde
 * @see http://www.oscarblancarteblog.com
 */
public class ProductItem implements IPrototype<ProductItem> {

    private Product product;
    
    public ProductItem(){
    }

    public ProductItem(Product product){
        this.product = product;
    }

    public ProductItem(String name, double price) {
        this();
        this.product= new Product(name, price);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(String name, double price) {
        product.setName(name);
        product.setPrice(price);
    }

    @Override
    public ProductItem clone() {
        return new ProductItem(product);
    }

    @Override
    public ProductItem deepClone() {
        return new ProductItem(product.getName(), product.getPrice());
    }

    @Override
    public String toString() {
        return "ProductItem{" + "name=" + product.getName() + ", price=" + product.getPrice() + '}';
    }
}