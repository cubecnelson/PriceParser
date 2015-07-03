import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws Exception {
		String url = "http://s.taobao.com/search?spm=a213y.6633709.2015012211.97.Wsh14G&q=%E6%97%A5%E7%B3%BBpolo%E8%A1%AB%E7%94%B7&js=1&stats_click=search_radio_all%253A1&initiative_id=staobaoz_20150402&cps=yes&cat=50354019";
		TaoBaoPriceParser tb = new TaoBaoPriceParser(url);
        String result = tb.doGet();
        ArrayList<Integer> list = tb.getAllIndex(result, "\"view_price\":");
        
        ArrayList<Double> prices = tb.getAllPrice(result, list);
        for(int i = 0; i < prices.size(); i++)
        	System.out.println(prices.get(i));
        
        
    }
}
