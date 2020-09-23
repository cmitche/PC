public class PC {
    //Step 1:
    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //Step 2:
    public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Step 3: Make a method called drawLogo()
    private void drawLogo(){
        this.monitor.drawPixelAt(9,19,"blue");
    }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase=" + pcCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }

    //Step 4: Create a public method called description()
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today " + toString());
    }

    //Step 6: Create a powerUp() method that is public and returns nothing but inside
    // invoke/call the PressPowerButton() method on theCase and after that it calls/invokes
    //the drawLogo() method then right after that it invokes the loadProgram() method
    // on the motherBoard ivar
    public void powerUp(){
        pcCase.pressPowerButton();
        monitor.drawPixelAt(5,10,"blue");
        motherboard.loadProgram("IntelliJ IDEA CE");
    }
}