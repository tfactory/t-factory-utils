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
import java.util.List;

/**
 * Class representing a Server (remote slave machine that host one or more
 * tomcat instances).
 * 
 * @author cesarHernandezGt
 *
 */
public class Server implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private AgentDto agentDto;
	private List<InstanceDto> listInstanceDto;
	
	
	
	
	/**
	 * Overriding of hashcode method utiliced for the attribute  agentDto.path
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agentDto.getPath() == null) ? 0 : agentDto.getPath().hashCode());
		return result;
	}
	
	
	/**
	 *Overriding of equals method utiliced for the attribute  agentDto.path .
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Server other = (Server) obj;
		if (agentDto.getPath() == null) {
			if (other.agentDto.getPath() != null)
				return false;
		} else if (!agentDto.getPath().equals(other.agentDto.getPath()))
			return false;
		return true;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AgentDto getAgentDto() {
		return agentDto;
	}
	public void setAgentDto(AgentDto agentDto) {
		this.agentDto = agentDto;
	}


	public List<InstanceDto> getListInstanceDto() {
		return listInstanceDto;
	}


	public void setListInstanceDto(List<InstanceDto> listInstanceDto) {
		this.listInstanceDto = listInstanceDto;
	}

	
	
	
}
