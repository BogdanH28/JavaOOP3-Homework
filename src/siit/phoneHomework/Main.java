package siit.phoneHomework;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Oneplus6("1firstphone1");

        phone1.addContact("1", "123", "b", "h");
        phone1.addContact("1", "321", "a", "s");
        phone1.listContacts();

        phone1.sendMessage("123", "Hi 123!");
        phone1.sendMessage("123", "What's up 123!");
        phone1.sendMessage("321", "Hi 321!");
        phone1.sendMessage("321", "How are you 321!");
        phone1.listMessages("321");
        System.out.println(phone1.getBatteryLevel());

        phone1.call("123");
        phone1.call("321");
        phone1.viewHistory();
        System.out.println(phone1.getBatteryLevel());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        For phones with multiple choices for storage you can use ".seeStorageOptions()"
//        For phone with multiple choices for colors you can use ".seeColorOptions()"

//        For Oneplus6 phones you can set the color and the storage, the ram wil be different on 128 or 256 versions
//        Material is always glass, battery life is always 28.

//        Oneplus6 oneplus6 = new Oneplus6("2secondphone2");
//        oneplus6.seeStorageOptions();
//        oneplus6.seeColorOptions();

//        oneplus6.setStorage(256);
//        oneplus6.setColor("Midnight Black");
//        System.out.println(oneplus6.getColor());
//        System.out.println(oneplus6.getBatteryLife());
//        System.out.println(oneplus6.getStorage());
//        System.out.println(oneplus6.getMATERIAL());
//        System.out.println(oneplus6.getRam());
//        System.out.println(oneplus6.getImei());

//        For Oneplus3 phones you can set only color.
//        Material is always aluminium, battery life is always 32, storage is 64 and ram is 6.

//        Oneplus3 oneplus3 = new Oneplus3("3thirdphone3");
//        oneplus3.seeColorOptions();
//
//        oneplus3.setColor("Graphite");
//        System.out.println(oneplus3.getColor());
//        System.out.println(oneplus3.getBatteryLife());
//        System.out.println(oneplus3.getSTORAGE());
//        System.out.println(oneplus3.getMATERIAL());
//        System.out.println(oneplus3.getRAM());
//        System.out.println(oneplus3.getImei());

//        For Samsung Note9 phones you can set color and storage, ram will be 6 on 128 or 8 on 512.
//        Material is always glass, battery life is always 29.

//        SamsungNote9 samsungNote9 = new SamsungNote9("4forthphone4");
//        samsungNote9.seeStorageOptions();
//        samsungNote9.seeColorOptions();
//
//        samsungNote9.setStorage(512);
//        samsungNote9.setColor("Pure White");
//        System.out.println(samsungNote9.getColor());
//        System.out.println(samsungNote9.getBatteryLife());
//        System.out.println(samsungNote9.getStorage());
//        System.out.println(samsungNote9.getMATERIAL());
//        System.out.println(samsungNote9.getRam());
//        System.out.println(samsungNote9.getImei());


//        For Samsung S9 phones you can set color and storage(64, 128, 256), ram will not change with storage.
//        Material is always glass, battery life is always 22, ram is 4.

//        SamsungS9 samsungS9 = new SamsungS9("5fifthphone5");
//        samsungS9.seeStorageOptions();
//        samsungS9.seeColorOptions();
//
//        samsungS9.setStorage(512);
//        samsungS9.setColor("Burgundy Red");
//        System.out.println(samsungS9.getColor());
//        System.out.println(samsungS9.getBatteryLife());
//        System.out.println(samsungS9.getStorage());
//        System.out.println(samsungS9.getMATERIAL());
//        System.out.println(samsungS9.getRAM());
//        System.out.println(samsungS9.getImei());
    }
}
