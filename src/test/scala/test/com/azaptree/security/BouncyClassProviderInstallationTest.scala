package test.com.azaptree.security

import org.scalatest.FunSuite
import java.security.Security
import org.scalatest.matchers.ShouldMatchers
import collection.JavaConversions._
import scala.collection.mutable.Set
import com.azaptree.logging.Slf4jLogger

class BouncyClassProviderInstallationTest extends FunSuite with ShouldMatchers with Slf4jLogger {

  val providerName = "BC"

  val bc = Security.getProvider(providerName)
  bc should not be null

  val keys: Set[AnyRef] = bc.keySet()
  keys.foreach { log.info("{}", _) }

}