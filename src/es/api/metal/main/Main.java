/**
 * 
 */
package es.api.metal.main;

import java.util.List;

import es.api.metal.dto.AlbumDTO;
import es.api.metal.impl.MetalArchivesApi;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MetalArchivesApi api = new MetalArchivesApi();
		
		long timeStart = System.currentTimeMillis();
		
		List<AlbumDTO> albums = api.getAlbums("305");
		
		long timeEnd = System.currentTimeMillis();
		long time = timeEnd-timeStart;
		
		System.out.println("Request and Response time: "+ time + " ms\n\n");
		
		for(AlbumDTO a: albums) {
			System.out.println("Nombre: " + a.getName());
			System.out.println("Genere: " + a.getType());
			System.out.println("Year: " + a.getYear());
		}
	}

}
