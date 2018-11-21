package siit.phoneHomework;

import java.util.ArrayList;

public class SamsungS9 extends Samsung {

    //    properties which cannot change
    private final static String MATERIAL = "glass";
    private final static int BATTERY_LIFE = 22;
    private final static int RAM = 4;
    //    properties that are configurable
    private String color;
    private int storage;
    //  properties that are instance specific
    private String imei;
    //  Array used
    ArrayList<String> colorOptions = new ArrayList<>();
    ArrayList<Integer> storageOptions = new ArrayList<>();

    public SamsungS9(String imei) {
        this.imei = imei;
    }

    public String getMATERIAL() {
        return MATERIAL;
    }

    public int getBatteryLife() {
        return BATTERY_LIFE;
    }

    public int getRAM() {
        return RAM;
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

        if (storage != 64 && storage != 128 && storage != 256) {
            System.out.println("Choose between the 64, 128 or 256 model!");
        }
    }

    private void setStorageOptions() {
        storageOptions.add(64);
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
        colorOptions.add("Coral Blue");
        colorOptions.add("Titanium Gray");
        colorOptions.add("Lilac Purple");
        colorOptions.add("Burgundy Red");
        colorOptions.add("Sunrise Gold");
        colorOptions.add("Ice Blue");
    }

    public void seeColorOptions() {
        setColorOptions();
        for (String colorOption : colorOptions) {
            System.out.println(colorOption);
        }
    }
}
