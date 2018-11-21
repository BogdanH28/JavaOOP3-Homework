package siit.phoneHomework;

import java.util.ArrayList;

public class Oneplus3 extends Oneplus {

    //      properties which cannot change
    private final static String MATERIAL = "aluminium";
    private final static int BATTERY_LIFE = 32;
    private final static int RAM = 6;
    private final static int STORAGE = 64;
    //      properties that are configurable
    private String color;
    //      properties that are instance specific
    private String imei;
    //      Array used
    ArrayList<String> colorOptions = new ArrayList<>();

    public Oneplus3(String imei) {
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

    public int getSTORAGE() {
        return STORAGE;
    }

    public String getColor() {
        return color;
    }

    public String getImei() {
        return imei;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void setColorOptions() {
        colorOptions.add("Graphite");
        colorOptions.add("Soft Gold");
    }

    public void seeColorOptions() {
        setColorOptions();
        for (String colorOption : colorOptions) {
            System.out.println(colorOption);
        }
    }
}
