package springboot.apikey.starter.Sysdate;

import java.time.LocalDateTime;

public class Sysdate {
	
	LocalDateTime sysdate;
	
	public Sysdate(LocalDateTime sysdate) {
		this.sysdate = sysdate;
	}

	public LocalDateTime getSysdate() {
		return sysdate;
	}

	public void setSysdate(LocalDateTime sysdate) {
		this.sysdate = sysdate;
	}	

}
