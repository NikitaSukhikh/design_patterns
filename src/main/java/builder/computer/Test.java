package builder.computer;

public class Test {

    public static void main(String[] args) {

        Computer comp = new Computer.ComputerBuilder("500 Gb", "2 Gb").setBluetoothEnabled (true).setGraphicsCardEnabled(true).build();
        System.out.println(comp.getHDD());
    }
}
