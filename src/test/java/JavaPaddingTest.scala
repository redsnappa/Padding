/**
 * Created by dan on 15/08/2015.
 */

import org.scalatest.FlatSpec

class JavaPaddingTest extends FlatSpec {

  "Given an empty string to pad" should "return \"000000000000\"" in {
    assert(JPadding.pad("") === "000000000000")
  }

  "Given an null to pad" should "return \"000000000000\"" in {
    assert(JPadding.pad(null) === "000000000000")
  }

  "Given letters only \"abc\" to pad" should "return \"abc000000000000\"" in {
    assert(JPadding.pad("abc") === "abc000000000000")
  }

  "Given numbers only string under 12 in length \"123\" to pad" should "return \"000000000123\"" in {
    assert(JPadding.pad("123") === "000000000123")
  }

  "Given mixes ending in letters \"123abc\" to pad" should "return \"123abc000000000000\"" in {
    assert(JPadding.pad("123abc") === "123abc000000000000")
  }

  "Given a full digit string with length over 12 \"0123456789102\" to pad" should "return \"0123456789102\"" in {
    assert(JPadding.pad("0123456789102") === "0123456789102")
  }

  "Given a full digit string with length of 12 \"012345678912\" to pad" should "return \"012345678912\"" in {
    assert(JPadding.pad("012345678912") === "012345678912")
  }

  "Given a full digit string with length of under 12 \"01234567891\" to pad" should "return \"001234567891\"" in {
    assert(JPadding.pad("01234567891") === "001234567891")
  }

  "Given a string with letters and a digit tail of length of  12 \"abc123456789101\" to pad" should "return \"abc123456789101\"" in {
    assert(JPadding.pad("abc123456789101") === "abc123456789101")
  }

  "Given a string with letters and a digit tail of length of over 12 \"abc1234567891011\" to pad" should "return \"abc1234567891011\"" in {
    assert(JPadding.pad("abc1234567891011") === "abc1234567891011")
  }

  "Given a string with letters and a digit tail of length of under 12 \"abc123\" to pad" should "return \"abc000000000123\"" in {
    assert(JPadding.pad("abc123") === "abc000000000123")
  }

  "Given mixed ending in digits and string in digits [under 12 in length] \"123abc123\" to pad" should "return \"123abc000000000123\"" in {
    assert(JPadding.pad("123abc123") === "123abc000000000123")
  }

  "Given \"000000000000\" to pad" should "return \"000000000000\"" in {
    assert(JPadding.pad("000000000000") === "000000000000")
  }

}


