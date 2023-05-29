public class Main {

    static void main(String[] args){

        Product product1 = new Product();
        System.out.println(product1.displayInfo());
    
        Product product2 = new Product("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());
    
        Product product3 = new Product("Ок", "11", -100);
        System.out.println(product3.displayInfo());




    }

}
