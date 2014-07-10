/**
 * 
 */
package es.api.metal.main;

import java.util.List;

import es.api.metal.dto.AlbumDTO;
import es.api.metal.dto.BandDTO;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BandDTO band = new BandDTO();
		band.setId("305");
		
		List<AlbumDTO> albums = band.getAlbums();
		
		
		for(AlbumDTO a: albums) {
			System.out.println("Nombre: " + a.getName());
			System.out.println("Genere: " + a.getType());
			System.out.println("Year: " + a.getYear());
			System.out.println("Url: " + a.getUrlInfo());
		}
	}

}
