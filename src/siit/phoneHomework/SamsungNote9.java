package siit.phoneHomework;

import java.util.ArrayList;

public class SamsungNote9 extends Samsung {

    //      properties which cannot change
    private final static String MATERIAL = "glass";
    private final static int BATTERY_LIFE = 29;
    //      properties that are configurable
    private String color;
    private int storage = 128;
    private int ram = 6;
    //      properties that are instance specific
    private String imei;
    //      Array used
    ArrayList<String> colorOptions = new ArrayList<>();
    ArrayList<Integer> storageOptions = new ArrayList<>();

    public SamsungNote9(String imei) {
        this.imei = imei;
    }

    public String getMATERIAL() {
        return MATERIAL;
    }

    public int getBatteryLife() {
        return BATTERY_LIFE;
    }

    public String getColor() {
        return color;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getImei() {
        return imei;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStorage(int storage) {
        this.storage = storage;

        if (storage == 512) {
            ram = 8;
        } else if (storage != 128) {
            System.out.println("Choose between the 128 or 512 model!");
        }
    }

    private void setStorageOptions() {
        storageOptions.add(256);
        storageOptions.add(512);
    }

    public void seeStorageOptions() {
        setStorageOptions();
        for (Integer storageOption : storageOptions) {
            System.out.println(storageOption);
        }
    }

    private void setColorOptions() {
        colorOptions.add("Metallic Copper");
        colorOptions.add("Lavender Purple");
        colorOptions.add("Ocean Blue");
        colorOptions.add("Midnight Black");
        colorOptions.add("Pure White");
    }

    public void seeColorOptions() {
        setColorOptions();
        for (String colorOption : colorOptions) {
            System.out.println(colorOption);
        }
    }
}
