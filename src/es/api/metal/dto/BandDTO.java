package es.api.metal.dto;

import java.util.List;

import es.api.metal.delarations.IMetalArchivesApi;
import es.api.metal.impl.FactoryMetalApi;

public class BandDTO 
{
	private String id;
	private String name;
	private String genere;
	private String location;
	private String urlInfo;
	private List<AlbumDTO> albums;
	
	
	public BandDTO() {
		albums = null;
	}
	
	
	public List<AlbumDTO> getAlbums() {
		if(null == albums) {
			albums = FactoryMetalApi.getApi().getAlbumsFromBand(this.id);
		}
		
		return albums;
	}
	
	public void loadMoreInfo() {
		FactoryMetalApi.getApi().getMoreInfoBand(this);
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the genere
	 */
	public String getGenere() {
		return genere;
	}
	/**
	 * @param genere the genere to set
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the urlInfo
	 */
	public String getUrlInfo() {
		return urlInfo;
	}
	/**
	 * @param urlInfo the urlInfo to set
	 */
	public void setUrlInfo(String urlInfo) {
		this.urlInfo = urlInfo;
	}
	
}
