public class Main {
    public static void main(String[] args) {
        USB_A_Device device = new USB_A_Device();
        USB_C_Charger adapter = new USB_C_to_USB_A_Adapter(device);

        adapter.chargingWithUSB_C();

    }
}