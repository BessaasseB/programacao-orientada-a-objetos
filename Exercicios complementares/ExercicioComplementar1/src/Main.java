public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        
        r.setLength(-1);
        r.setWidth(10);
        
        System.out.println(r.area());
        System.out.println(r.perimetro());
    }
    
}
