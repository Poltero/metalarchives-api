package es.api.metal.delarations;

import org.jsoup.nodes.Document;

import com.google.gson.JsonArray;



public interface IHttpHelper {
	public Document getHtmlDocument(String url);
	public JsonArray getObjectJson(String url);
}
