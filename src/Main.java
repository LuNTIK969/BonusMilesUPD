public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 8_000;
        int miles = service.calculate(price);
        System.out.println("Your bonus is " + miles + " mile(s).");
    }
}