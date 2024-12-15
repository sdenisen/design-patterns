public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private final OldCoffeeMachine old_machine;
    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine){
        this.old_machine = machine;
    }

    @Override
    public void chooseFirstSelection() {
        this.old_machine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        this.old_machine.selectB();
    }
}
