package edu.cornell.ksbclient;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.components.crypto.Merlin;

public class KSBClientCallbackHandler implements CallbackHandler {

	public void handle( Callback[] callbacks ) throws IOException, UnsupportedCallbackException {
		for( Callback thisCallback : callbacks ) {
		  
		  //Let's make sure this is the signature callback
			WSPasswordCallback pwcb = (WSPasswordCallback)thisCallback;
			int usage = pwcb.getUsage();
			
			//got call back, have to set key store password
			if( usage == WSPasswordCallback.SIGNATURE ) {
		       pwcb.setPassword(KSBServiceClient.getProperty(Merlin.KEYSTORE_PASSWORD));
			}
		}		
	}
}
