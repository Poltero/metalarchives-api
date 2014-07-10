/**
 * 
 */
package es.api.metal.delarations;

import java.util.List;

import es.api.metal.dto.AlbumDTO;

/**
 * @author pablo
 *
 */
public interface IMetalArchivesApi 
{
	public List<AlbumDTO> getAlbums(String id);
}
