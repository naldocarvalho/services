///*
// * EncomendaZ
// * 
// * Copyright (c) 2011, EncomendaZ <http://encomendaz.net>.
// * All rights reserved.
// * 
// * EncomendaZ is free software; you can redistribute it and/or modify it
// * under the terms of the GNU Lesser General Public License as published
// * by the Free Software Foundation; either version 3 of the License.
// *
// * This library is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// * Lesser General Public License for more details.
// *
// * You should have received a copy of the GNU Lesser General Public
// * License along with this library; if not, see <http://gnu.org/licenses>
// * or write to the Free Software Foundation, Inc., 51 Franklin Street,
// * Fifth Floor, Boston, MA  02110-1301, USA.
// */
//package net.encomendaz.rest.util;
//
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsync;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClient;
//
//public class Mailer {
//
//	public static AmazonSimpleEmailServiceAsync client() {
//		String accessKey = Configuration.awsAccessKey();
//		String secretKey = Configuration.awsSecretKey();
//
//		AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
//		return new AmazonSimpleEmailServiceAsyncClient(credentials);
//	}
// }
