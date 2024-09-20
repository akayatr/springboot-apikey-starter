package springboot.apikey.starter.Sysdate;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysdateController {
	
	private static final Logger log = LoggerFactory.getLogger(SysdateController.class);
	
	@GetMapping("/test/sysdate1")
	Sysdate getSysdate1() {
		return new Sysdate(LocalDateTime.now());
	}
	
	@GetMapping("/test/sysdate2")
	Sysdate getSysdate2() {
		Sysdate s = new Sysdate(LocalDateTime.now());
		log.info("getSysdate2 " + s.getSysdate().toString());
		return s;
	}

}
