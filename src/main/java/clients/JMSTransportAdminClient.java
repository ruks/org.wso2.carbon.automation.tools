package clients;

import client.support.modules.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.testng.Assert;
import client.configuration.AutomationConfigurationReader;
import org.wso2.carbon.transport.jms.stub.JMSTransportAdminStub;
import org.wso2.carbon.transport.jms.stub.types.carbon.TransportParameter;


/**
 * Auto generated JMSTransportAdmin service Client
 *
 * Service name : JMSTransportAdmin
 * Service WSDL : JMSTransportAdmin.wsdl
 * Service stub class : JMSTransportAdminStub
 * Client Library : JMSTransportAdminLibrary
 *
 * @author rukshan
 * 
 */

public class JMSTransportAdminClient{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private JMSTransportAdminStub stub;


	//Constructor		
	public JMSTransportAdminClient(){

	}		

	public TransportParameter[] getGloballyDefinedOutParameters()  throws java.lang.Exception{

		this.getGloballyDefinedOutParameters=stub.getGloballyDefinedOutParameters();
		return this.getGloballyDefinedOutParameters;

	}

	private TransportParameter[] getGloballyDefinedOutParameters;

	public void  AssertgetGloballyDefinedOutParameters(TransportParameter[] expected) {	
		Assert.assertEquals(getGloballyDefinedOutParameters , expected );		
	}
	public void updateGloballyDefinedInParameters(TransportParameter[] arg)  throws java.lang.Exception{

	stub.updateGloballyDefinedInParameters(arg);

	}

	public void disableTransportListener()  throws java.lang.Exception{

	stub.disableTransportListener();

	}

	public void removeConnectionFactory(String arg0,String arg1,boolean arg)  throws java.lang.Exception{

	stub.removeConnectionFactory(arg0,arg1,arg);

	}

	public void updateServiceSpecificInParameters(String arg0,TransportParameter[] arg)  throws java.lang.Exception{

	stub.updateServiceSpecificInParameters(arg0,arg);

	}

	public void updateServiceSpecificOutParameters(String arg0,TransportParameter[] arg)  throws java.lang.Exception{

	stub.updateServiceSpecificOutParameters(arg0,arg);

	}

	public TransportParameter[] getServiceSpecificOutParameters(String arg)  throws java.lang.Exception{

		this.getServiceSpecificOutParameters=stub.getServiceSpecificOutParameters(arg);
		return this.getServiceSpecificOutParameters;

	}

	private TransportParameter[] getServiceSpecificOutParameters;

	public void  AssertgetServiceSpecificOutParameters(TransportParameter[] expected) {	
		Assert.assertEquals(getServiceSpecificOutParameters , expected );		
	}
	public TransportParameter[] getGloballyDefinedInParameters()  throws java.lang.Exception{

		this.getGloballyDefinedInParameters=stub.getGloballyDefinedInParameters();
		return this.getGloballyDefinedInParameters;

	}

	private TransportParameter[] getGloballyDefinedInParameters;

	public void  AssertgetGloballyDefinedInParameters(TransportParameter[] expected) {	
		Assert.assertEquals(getGloballyDefinedInParameters , expected );		
	}
	public TransportParameter[] getServiceSpecificInParameters(String arg)  throws java.lang.Exception{

		this.getServiceSpecificInParameters=stub.getServiceSpecificInParameters(arg);
		return this.getServiceSpecificInParameters;

	}

	private TransportParameter[] getServiceSpecificInParameters;

	public void  AssertgetServiceSpecificInParameters(TransportParameter[] expected) {	
		Assert.assertEquals(getServiceSpecificInParameters , expected );		
	}
	public void addConnectionFactory(TransportParameter arg0,String arg1,boolean arg)  throws java.lang.Exception{

	stub.addConnectionFactory(arg0,arg1,arg);

	}

	public void disableTransportSender()  throws java.lang.Exception{

	stub.disableTransportSender();

	}

	public void updateGloballyDefinedOutParameters(TransportParameter[] arg)  throws java.lang.Exception{

	stub.updateGloballyDefinedOutParameters(arg);

	}




	public void initJMSTransportAdmin() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "JMSTransportAdmin";
		String endPoint;
		String host = AutomationConfigurationReader.context(AutomationConfigurationReader.PRODUCT_HOST);
		String port = AutomationConfigurationReader.context(AutomationConfigurationReader.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
		stub = new JMSTransportAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}