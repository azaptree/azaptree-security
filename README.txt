Environment setup
1. Install the Java Cryptography Extension (JCE) Unlimited Strength
   - download zip and following install instructions contained with in the downloaded zip file  
2. Install the Bouncy Castle Security Provider
   - download the jar files from the Bouncy Castle site : http://www.bouncycastle.org/latest_releases.html
   - copy the jar files into the $JAVA_HOME/jre/lib/ext/ dir
   - add the following line to to the end of the list in $JAVA_HOME/lib/security/java.security :
   
   		security.provider.N=org.bouncycastle.jce.provider.BouncyCastleProvider 