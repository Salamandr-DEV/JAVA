public class Device extends IDevice{
	private Device_type typeOfDevice;
    public Device(Device_type typeOfDevice, int powerOfDevice, boolean stateOfDevice) {
        super(powerOfDevice, stateOfDevice);
    	this.typeOfDevice = typeOfDevice;
    }
    @Override
    public String getTypeString() {
        return "Device type = " + typeOfDevice;
    }
    @Override
    public Device_type getType() {
        return typeOfDevice;
    }
    @Override
    public String toString() {
        return "Device{" +
                "type ='" + typeOfDevice + '\'' +
                ", power ='" + powerOfDevice + '\'' +
                ", state ='" + stateOfDevice + '\'' +
                '}';
    }
}
