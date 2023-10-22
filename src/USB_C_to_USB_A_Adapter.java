public class USB_C_to_USB_A_Adapter implements USB_C_Charger {
    private USB_A_Device usb_a_device;

    public USB_C_to_USB_A_Adapter(USB_A_Device device) {
        this.usb_a_device = device;
    }

    @Override
    public void chargingWithUSB_C() {
        usb_a_device.chargingWithUSB_A();
    }
}