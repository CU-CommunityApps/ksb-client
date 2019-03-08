package edu.cornell.ksbclient;

import java.util.Properties;

import org.apache.rampart.RampartConfigCallbackHandler;
import org.apache.rampart.policy.model.CryptoConfig;
import org.apache.rampart.policy.model.RampartConfig;

public class KSBClientSecurityCallbackHandler implements RampartConfigCallbackHandler {

    @Override
    public void update(RampartConfig config) {
        Properties properties = KSBServiceClient.getProperties();
        config.setSigCryptoConfig(buildSignatureCryptoConfig(properties));
        config.setUser(KSBServiceClient.getSignatureUser());
        config.setPwCbClass(KSBClientCallbackHandler.class.getName());
    }

    protected CryptoConfig buildSignatureCryptoConfig(Properties properties) {
        CryptoConfig cryptoConfig = new CryptoConfig();
        cryptoConfig.setProvider(properties.getProperty(KSBClientProperties.CRYPTO_PROVIDER));
        cryptoConfig.setProp(properties);
        return cryptoConfig;
    }

}
