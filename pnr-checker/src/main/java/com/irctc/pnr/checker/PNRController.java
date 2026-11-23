package com.irctc.pnr.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PNRController {

	@GetMapping("/checkPNR")
	@ResponseBody
	public String checkPNR() {

		System.out.println("PNRController.checkPNR()...................");
		
		return """
				IRCTC PNR STATUS
				----------------------------
				PNR Number      : 4567891230
				Train Number    : 12627
				Train Name      : Karnataka Express
				Journey Date    : 25-Nov-2026
				From            : BENGALURU (SBC)
				To              : NEW DELHI (NDLS)
				Passenger Name  : Dummy Passenger

				Booking Status  : WL/25
				Current Status  : CNF/B2/45
				Coach           : B2
				Seat Number     : 45
				Berth Type      : LOWER

				Chart Status    : PREPARED

				Status          : CONFIRMED
				----------------------------
				This is a dummy PNR response for testing.
				""";
	}

	@GetMapping("/validateCaptcha") // action name
	@ResponseBody
	public String captcha() {
		System.out.println("PNRController.captcha()!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		return "captcha validation done";
	}

}
