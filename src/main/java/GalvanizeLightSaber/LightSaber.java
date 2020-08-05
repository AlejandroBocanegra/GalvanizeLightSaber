package GalvanizeLightSaber;

public class LightSaber {
    
    float efficiency= 10.0f;
    int charge=0;
    String color= "green";
    int jediSerialNumber = 0;
    float minutes=0.0f;
  

    public void setCharge(int power) {
        charge= power;
    }
    
	public Integer getCharge() {
		return charge;
	}

    public void setColor(String kyber) {
        color= kyber;
    }

	public String getColor() {
		return color;
	}

    public void setJediSerialNumber(int sn) {
        jediSerialNumber=sn;
    }
    
	public int getJediSerialNumber() {
        return jediSerialNumber;
	}

	public float use(float mins) {
        minutes=mins;
        return minutes;
	}

	public float getMinutesRemaining() {
        float x= minutes *  efficiency;
        float y= charge - x;
        float minRemain= y/efficiency;
		return minRemain;
	}


}