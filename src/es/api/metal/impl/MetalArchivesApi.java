/**
 * 
 */
package es.api.metal.impl;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import es.api.metal.delarations.IHttpHelper;
import es.api.metal.delarations.IMetalArchivesApi;
import es.api.metal.dto.AlbumDTO;
import es.api.metal.http.HttpHelper;

/**
 * @author pablo
 *
 */
public class MetalArchivesApi implements IMetalArchivesApi
{
	private IHttpHelper http;
	
	public MetalArchivesApi() {
		http = new HttpHelper();
	}
	
	@Override
	public List<AlbumDTO> getAlbums(String id) {
		String uri = "http://www.metal-archives.com/band/discography/id/"+id;
		Document doc = http.getHtmlDocument(uri);
		List<AlbumDTO> albums = null;
		
		if(doc != null) {
			Elements thbody = doc.getElementsByTag("tbody");
			Elements albumRows = thbody.get(0).getElementsByTag("tr");
			
			albums = new ArrayList<AlbumDTO>();
			
			for(Element e: albumRows) {
				Elements cols = e.getElementsByTag("td");
				
				AlbumDTO album = new AlbumDTO();
				
				album.setName(cols.get(0).getElementsByTag("a").html());
				album.setType(cols.get(1).html());
				album.setYear(cols.get(2).html());
				
				albums.add(album);
			}
		}
		
		return albums;
	}
}
