import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Parser {
	protected String input;
	protected String result;
	
	public Parser(String url){

			this.input = url;
			
	}
	
	public void parse(){
		File file = new File(input);
		String result = "";
		try {
			FileInputStream in = new FileInputStream(file);
			int tempbyte;
            while ((tempbyte = in.read()) != -1) {
                System.out.write(tempbyte);
            }
            in.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	public String getUrl() {
		return input;
	}

	public void setUrl(String url) {
		this.input = url;
	}
	
	
	
	
}
