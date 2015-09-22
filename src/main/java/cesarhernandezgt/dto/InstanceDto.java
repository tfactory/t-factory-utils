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
 * Class Dto representing a Tomcat Instance.
 * @author cesarHernandezGt
 *
 */
public class InstanceDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pathLocation;
	private String name;
	private ServerXml serverXml;
	/**
	 * 0 normal, anything else anormal status.
	 * 
	 */
	private String status;
	
	public InstanceDto(){
		
	}


	public InstanceDto(String pathLocation, String name, ServerXml serverXml,
			String status) {
		super();
		this.pathLocation = pathLocation;
		this.name = name;
		this.serverXml = serverXml;
		this.status = status;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pathLocation == null) ? 0 : pathLocation.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InstanceDto other = (InstanceDto) obj;
		if (pathLocation == null) {
			if (other.pathLocation != null)
				return false;
		} else if (!pathLocation.equals(other.pathLocation))
			return false;
		return true;
	}



	//GETTERS and SETTERS

	public String getPathLocation() {
		return pathLocation;
	}





	public void setPathLocation(String pathLocation) {
		this.pathLocation = pathLocation;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public ServerXml getServerXml() {
		return serverXml;
	}





	public void setServerXml(ServerXml serverXml) {
		this.serverXml = serverXml;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}











	
	
}
