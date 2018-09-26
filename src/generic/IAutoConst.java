package generic;

public interface IAutoConst {
	//if u remove public static final in all these 4 also it ll work
	public static final String CHROME_KEY="webdriver.chrome.driver";
	public static final String CHROME_VALUE="./driver/chromedriver.exe";
	public static final String GECKO_KEY="webdriver.gecko.driver";
	public static final String GECKO_VALUE="./driver/geckodriver.exe";
	
	String CONFIG_PATH="./config.properties";
	String SUMMARY_PATH="./result/summary.xlsx";
	

}
