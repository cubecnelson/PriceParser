import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;


public class URLDownloader {
	private String url;
	private String dir;
	private String filename;
	
	
	public URLDownloader(String url, String dir) {
		super();
		this.url = url;
		this.dir = dir;
		this.filename = this.getFileNameFromUrl(url);
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String downloadFromUrl(){
		{  
			  
	        try {  
	            URL httpurl = new URL(url);  
	            System.out.println(filename);  
	            File f = new File(dir + filename);  
	            FileUtils.copyURLToFile(httpurl, f);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	            return "Fault!";  
	        }   
	        return "Successful!";  
		}
	}
		
	      
	    public static String getFileNameFromUrl(String url){  
	        String name = new Long(System.currentTimeMillis()).toString() + ".X";  
	        int index = url.lastIndexOf("/");  
	        if(index > 0){  
	            name = url.substring(index + 1);  
	            if(name.trim().length()>0){  
	                return name;  
	            }  
	        }  
	        return name;  
	    }  
	
	
}
