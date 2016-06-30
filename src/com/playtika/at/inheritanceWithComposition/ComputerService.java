package com.playtika.at.inheritanceWithComposition;

public class ComputerService extends ComputerTasks {

    public static void main(String[] args) {

        ComputerService service = new ComputerService();
        ComputerInstance dell = setCurrentSystem();
        service.getCurrentSystem(dell);
    }

    private static ComputerInstance setCurrentSystem() {
        ComputerInstance dell = new ComputerInstance();

        dell.tower.setProcessor("Intel");
        dell.tower.setRam(8);
        dell.tower.setHardDrive(500);
        dell.tower.setVideoCard("NVidia");

        dell.monitor.setBrand("LG");
        dell.monitor.setScreenSize(21);

        dell.mouse.setWireless(true);
        dell.mouse.setBrand("Microsoft");

        dell.keyboard.setBrand("Logitech");
        dell.keyboard.setWireless(true);
        return dell;
    }

    private void getCurrentSystem(ComputerInstance instance){

        System.out.println("Keyboard: " + instance.keyboard.getBrand());

        instance.calculate();
        instance.inputText();
        instance.playGames();
        instance.playMovies();

    }
}
