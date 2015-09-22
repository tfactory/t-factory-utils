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
package cesarhernandezgt.utils;

import java.io.IOException;
import java.net.ServerSocket;


/**
 * Class used for port related operations.
 * @author cesarHernandezGt
 *
 */
public class PortUtils {

	/**
	 * Method that checks whether or not a port is available on the host
	 * computer.
	 * 
	 * @param pPort
	 *            Number of port to be consulted if is available or not.
	 * @return Boolean indicating true if the port is available and false if it
	 *         is not.
	 */
	public static boolean availablePort(int pPort) {

		ServerSocket newlySocket = null;
		boolean response = false;

		try {
			newlySocket = new ServerSocket(pPort);
			response = true;
		} catch (IOException e) {
			response = false;
		} finally {
			if (newlySocket != null) {
				try {
					newlySocket.close();
				} catch (IOException e) {
				}
			}
		}

		return response;
	}
}
