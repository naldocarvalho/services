/*
 * EncomendaZ
 * 
 * Copyright (c) 2011, EncomendaZ <http://encomendaz.net>.
 * All rights reserved.
 * 
 * EncomendaZ is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://gnu.org/licenses>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.encomendaz.services;

import net.encomendaz.services.monitoring.Monitoring;
import net.encomendaz.services.monitoring.MonitoringResponse;

import org.junit.Test;

public class MonitoringServiceTest {

	/**
	 * Por enquanto, este teste ainda não é um teste, mas em breve será!
	 */
	@Test
	public void load() {
		EncomendaZ.setBaseURL("http://services.encomendaz.net");
		MonitoringResponse response = EncomendaZ.monitoring.search("<all>");

		EncomendaZ.setBaseURL("http://services.sandbox.encomendaz.net");
		String clientId = "91448300404063076307502904506675:018F14CE029B3AFA3135BDB2DA37286C77EE467AA9A72F779AB2A04B8921E448";

		MonitoringResponse response2;
		for (Monitoring m : response.getData()) {
			response2 = EncomendaZ.monitoring.register(clientId, m.getTrackId(), m.getLabel());
			System.out.println(response2);
		}
	}
	
	
	@Test
	public void loadX() {
		EncomendaZ.setBaseURL("http://services.sandbox.encomendaz.net");
		String clientId = "91448300404063076307502904506675:018F14CE029B3AFA3135BDB2DA37286C77EE467AA9A72F779AB2A04B8921E448";
		
		MonitoringResponse response= EncomendaZ.monitoring.register(clientId, "XX000000000XX", "cole");
		System.out.println(response);
	}
}