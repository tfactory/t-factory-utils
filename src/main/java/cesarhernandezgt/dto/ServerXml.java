/**
 * Copyright (C) 2015 Cesar Hernandez. (https://github.com/tfactory)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cesarhernandezgt.dto;

import java.io.Serializable;

/**
 * Class representing a file server.xml from a tomcat instance.
 * @author cesarHernandezGt.
 *
 */
public class ServerXml implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int shutDown;
	private int http;
	private int httpRedirect;
	private int ajpRedirect;
	private int ajp;
	
	
	public ServerXml() {
		super();
	}
	public int getShutDown() {
		return shutDown;
	}
	public void setShutDown(int shutDown) {
		this.shutDown = shutDown;
	}
	public int getHttp() {
		return http;
	}
	public void setHttp(int http) {
		this.http = http;
	}
	public int getHttpRedirect() {
		return httpRedirect;
	}
	public void setHttpRedirect(int httpRedirect) {
		this.httpRedirect = httpRedirect;
	}
	public int getAjpRedirect() {
		return ajpRedirect;
	}
	public void setAjpRedirect(int ajpRedirect) {
		this.ajpRedirect = ajpRedirect;
	}
	public int getAjp() {
		return ajp;
	}
	public void setAjp(int ajp) {
		this.ajp = ajp;
	}
	
	/*
	 * Getters and Setters
	 */
	
}
