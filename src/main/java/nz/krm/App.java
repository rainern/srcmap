package nz.krm;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;

/**
 * Hello world!
 *
 */
public class App implements BurpExtension
{
    @Override
    public void initialize(MontoyaApi api)
    {
        // set extension name
        api.extension().setName("srcmap");
    }
}
