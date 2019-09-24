package common;





public class Common {
/* some thing
 * 
 */
	
	public static void sleep (int seconds) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 public static String getRandomEmail( String firstName, String lastName ) {
	        String[] emails = { "@gmail.com", "@yahoo.com", "@hotmail.com", "@aol.com", "@hotmail.co.uk", "@hotmail.fr",
	                "@msn.com", "@yahoo.fr", "@wanadoo.fr", "@orange.fr", "@comcast.net", "@yahoo.co.uk", "@yahoo.com.br",
	                "@yahoo.co.in", "@live.com", "@rediffmail.com", "@free.fr", "@gmx.de", "@web.de", "@yandex.ru",
	                "@ymail.com", "@libero.it", "@outlook.com", "@uol.com.br", "@bol.com.br", "@mail.ru", "@cox.net",
	                "@hotmail.it", "@sbcglobal.net", "@sfr.fr", "@live.fr", "@verizon.net", "@live.co.uk",
	                "@googlemail.com", "@yahoo.es", "@ig.com.br", "@live.nl", "@bigpond.com", "@terra.com.br", "@yahoo.it",
	                "@neuf.fr", "@yahoo.de", "@alice.it", "@rocketmail.com", "@att.net", "@laposte.net", "@facebook.com",
	                "@bellsouth.net", "@yahoo.in", "@hotmail.es", "@charter.net", "@yahoo.ca", "@yahoo.com.au",
	                "@rambler.ru", "@hotmail.de", "@tiscali.it", "@shaw.ca", "@yahoo.co.jp", "@sky.com", "@earthlink.net",
	                "@optonline.net", "@freenet.de", "@t-online.de", "@aliceadsl.fr", "@virgilio.it", "@home.nl", "@qq.com",
	                "@telenet.be", "@me.com", "@yahoo.com.ar", "@tiscali.co.uk", "@yahoo.com.mx", "@voila.fr", "@gmx.net",
	                "@mail.com", "@planet.nl", "@tin.it", "@live.it", "@ntlworld.com", "@arcor.de", "@yahoo.co.id",
	                "@frontiernet.net", "@hetnet.nl", "@live.com.au", "@yahoo.com.sg", "@zonnet.nl", "@club-internet.fr",
	                "@juno.com", "@optusnet.com.au", "@blueyonder.co.uk", "@bluewin.ch", "@skynet.be", "@sympatico.ca",
	                "@windstream.net", "@mac.com", "@centurytel.net", "@chello.nl", "@live.ca", "@aim.com",
	                "@bigpond.net.au" };
	        return (firstName + "." + lastName + emails [ getRandomInt(0, (emails.length-1)) ]).toLowerCase();
	    }

	
	public static int getRandomInt ( int min, int max ) {
        return (int)(Math.random() * (( max - min ) + 1 )) + min;
    }

 public static void main(String[] args) {
	System.out.println(getRandomEmail("mushfig", "tahir"));
}

//	public static void main(String[] args) {
//        WebDriver driver = Driver.getDriver("chrome");
//        driver.get("https://email-verify.my-addr.com/list-of-most-popular-email-domains.php");
//        List<WebElement> rowElements = driver.findElements(By.xpath("//h2[text()='Top 100']/..//table//tr"));
//        for (int index = 1; index <= rowElements.size(); index++) {
//            String email = driver
//                    .findElement(By.xpath("((//h2[text()='Top 100']/..//table//tr)[" + index + "]//td)[3]")).getText();
//            email = "\"@" + email + "\", ";
//            System.out.print(email);
//        }
//      ((//h2[text()='Top 100']/..//table//tr)[99]//td)[3]
//      console output 
//      "@gmail.com", "@yahoo.com", 
//      
//      driver.findElements(By.id("")) -- > List<WebElements>
//      loop thru List and add double quotes and @ sign in front of email domain --> "@gmail.com"
//      separate each email domain by comma --> "@gmail.com", "@yahoo.com", etc.
//	}
}


