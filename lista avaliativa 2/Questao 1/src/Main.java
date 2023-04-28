public class Main {

    public static void main(String[] args) {
        Peixe peixe = new Peixe("Peixe", 0.2, "Agua doce");
        Cachorro cachorro = new Cachorro("Cachorro", 8, "Salsicha");
        
        System.out.println(cachorro.toString());
        System.out.println("\n");
        System.out.println(peixe.toString());
    }
    
}
