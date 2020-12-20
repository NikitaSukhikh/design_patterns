package factory.computers;

public class TestDrive {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2Gb", "500Gb", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "32Gb", "3 Tb", "3 GHz");

        System.out.println("Factory PC Config : " + pc);
        System.out.println("Factory Server Config : " + server);
    }
}
