package test.com.azaptree.security

import org.scalatest.FunSuite
import com.azaptree.logging.Slf4jLogger
import com.azaptree.security._
import javax.crypto.spec.SecretKeySpec
import javax.crypto.Cipher

class UnlimitedPolicyJCEVerification extends FunSuite with Slf4jLogger {

  test("Verify that the Unrestricted Policy files are installed") {
    val data = nextRandomBytes(8)

    val key64 = new SecretKeySpec(nextRandomBytes(8), "Blowfish")

    val c = Cipher.getInstance("Blowfish/ECB/NoPadding")
    c.init(Cipher.ENCRYPT_MODE, key64)
    c.doFinal(data)

    info("64 bit test passed")

    val key192 = new SecretKeySpec(nextRandomBytes(24), "Blowfish")

    c.init(Cipher.ENCRYPT_MODE, key192)
    c.doFinal(data)

    info("192 bit test passed")
  }

}