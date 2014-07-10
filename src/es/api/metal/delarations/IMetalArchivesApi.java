/**
 * 
 */
package es.api.metal.delarations;

import java.util.List;

import es.api.metal.dto.AlbumDTO;
import es.api.metal.dto.ArtistDTO;
import es.api.metal.dto.BandDTO;
import es.api.metal.dto.TrackDTO;

/**
 * @author pablo
 *
 */
public interface IMetalArchivesApi 
{
	public List<AlbumDTO> getAlbumsFromBand(String idBand);
	
	public List<ArtistDTO> getInfoArtists(String urlArtist);
	
	public List<TrackDTO> getTracksFromAlbum(String urlAlbum);
	
	public String getLyricsFromTrack(String idTrack);
	
	public void getMoreInfoBand(BandDTO band);
	
	public List<BandDTO> searchBand(String name);
	
	public List<ArtistDTO> searchArtist(String name);
}
