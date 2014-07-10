/**
 * 
 */
package es.api.metal.http;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import es.api.metal.delarations.IHttpHelper;

/**
 * @author pablo
 *
 */
public class HttpHelper implements IHttpHelper {

	private HttpClient client;
	
	public HttpHelper() {
		client = HttpClientBuilder.create().build();
	}
	
	private String openHttpGetConnection(String url) {
		HttpGet request = new HttpGet(url);
		
		try {
			HttpResponse response = client.execute(request);
			
			String responseString = new BasicResponseHandler().handleResponse(response);
			
			return responseString;
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Document getHtmlDocument(String url) {
		String res = openHttpGetConnection(url);
	
		if(res != null) {
			Document doc = Jsoup.parse(res);
			
			return doc;
		}
		
		return null;
	}

}
