package siit.phoneHomework;

import java.util.ArrayList;

public class Oneplus6 extends Oneplus {

    //    properties which cannot change
    private final static String MATERIAL = "glass";
    private final static int BATTERY_LIFE = 28;
    //    properties that are configurable
    private String color;
    private int storage = 128;
    private int ram = 6;
    //    properties that are instance specific
    private String imei;
    //    Arrays used
    ArrayList<Integer> storageOptions = new ArrayList<>();
    ArrayList<String> colorOptions = new ArrayList<>();

    public Oneplus6(String imei) {
        this.imei = imei;
        setBatteryLevel(BATTERY_LIFE);
    }

    public int getBatteryLife() {
        return BATTERY_LIFE;
    }

    public String getMATERIAL() {
        return MATERIAL;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public int getStorage() {
        return storage;
    }

    public String getImei() {
        return imei;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStorage(int storage) {
        this.storage = storage;

        if (storage == 256) {
            ram = 8;
        } else if (storage != 128) {
            System.out.println("Choose between the 128 or 256 model!");
        }
    }

    private void setStorageOptions() {
        storageOptions.add(128);
        storageOptions.add(256);
    }

    public void seeStorageOptions() {
        setStorageOptions();
        for (Integer storageOption : storageOptions) {
            System.out.println(storageOption);
        }
    }

    private void setColorOptions() {
        colorOptions.add("Midnight Black");
        colorOptions.add("Mirror Black");
        colorOptions.add("Silk White");
    }

    public void seeColorOptions() {
        setColorOptions();
        for (String colorOption : colorOptions) {
            System.out.println(colorOption);
        }
    }

}
