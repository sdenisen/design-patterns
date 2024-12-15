public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        OldCoffeeMachine machine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(machine);

        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}