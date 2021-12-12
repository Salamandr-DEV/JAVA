public class LR2 {	
	public static int Power(Device[] devices) {
		int power = 0;
		for (int i = 0; i < devices.length; i++){
			if (devices[i].isOn()) {
				power += devices[i].getPower();
			}
		}
		return power;
	}	
	public static void Sort(Device[] devices) {		
		boolean isSorted = false;
		Device buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < devices.length-1; i++) {
                if(devices[i].getPower() > devices[i+1].getPower()){
                    isSorted = false;
 
                    buf = devices[i];
                    devices[i] = devices[i+1];
                    devices[i+1]= buf;
                }
            }
        }
	}	
	public static Device Find(Device[] devices, Device_type typeOfDevice, int powerOfDevice, boolean stateOfDevice) {
		Device finded_device = null;
		for (int i = 0; i < devices.length; i++){
			if (devices[i].getType() == typeOfDevice && devices[i].getPower() == powerOfDevice && devices[i].isOn() == stateOfDevice) {
				finded_device = devices[i];
			}
		}
		return finded_device;
	}
	public static void main(String[] args)
	{
        Device[] devices = new Device[5];
        devices[0] = new Device(Device_type.TV, 100, true);
        devices[1] = new Device(Device_type.COMPUTER, 800, false);
        devices[2] = new Device(Device_type.COOKER, 2000, false);
        devices[3] = new Device(Device_type.KETTLE, 1500, true);
        devices[4] = new Device(Device_type.LAMP, 15, true);        
        System.out.println(Power(devices));       
        Sort(devices);    
        for (int i = 0; i < devices.length; i++)
		{
        	System.out.println(devices[i].getTypeString());
		}    
        System.out.println(Find(devices, Device_type.COMPUTER, 800, false).toString()); 
    }
}