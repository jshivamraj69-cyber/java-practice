public class KGMath {
    public static void main(String[] args) {
        System.out.println("Welcome to KGMath");
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.max(5, 7));
        System.out.println( Math.min(5, 7));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.PI);
        for(int i = 0; i < 10; i++){
            double random = Math.random() * 100;
            System.out.println(random);
        }

    }

}
