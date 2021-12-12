public abstract class IDevice {
    protected int powerOfDevice;
    protected boolean stateOfDevice;  
    public IDevice(int powerOfDevice, boolean stateOfDevice){
    	this.powerOfDevice = powerOfDevice;
    	this.stateOfDevice = stateOfDevice;
    }
    public boolean isOn() {
    	return stateOfDevice;
    }  
    public void setOn(boolean status) {
    	this.stateOfDevice = status;
    } 
    public int getPower() {
    	return powerOfDevice;
    } 
    public void setPower(int power) {
    	this.powerOfDevice = power;
    }
    public abstract String getTypeString();
    public abstract Device_type getType();
    public abstract String toString();
}
