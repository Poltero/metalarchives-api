/**
 * 
 */
package es.api.metal.impl;

import es.api.metal.delarations.IMetalArchivesApi;

/**
 * @author pablo
 *
 */
public class FactoryMetalApi {
	private static IMetalArchivesApi api = new MetalArchivesApi();
	
	public static IMetalArchivesApi getApi() {
		return api;
	}
}
