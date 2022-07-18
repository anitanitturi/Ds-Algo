package com.dsalgo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseurl");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");

		return chromepath;
	}

	public String getFirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getEdgepath() {
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
	public String getCode() {
		String code=pro.getProperty("code");
		return code;
	}
	public String GetCode() {
		String code1= pro.getProperty("code1");
		return code1;
	}
	public String getSigninurl() {
		String url1= pro.getProperty("signurl");
				return url1;
	}
	public String getHomeurl() {
		String url2=pro.getProperty("homeurl");
		return url2;
	}
	public String getqurl() {
		String qurl=pro.getProperty("Qurl");
		return qurl;
	}
}







