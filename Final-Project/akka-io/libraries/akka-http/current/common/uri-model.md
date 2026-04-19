---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/uri-model.html
title: The URI model • Akka HTTP
---

# The URI model • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## The URI model

Akka HTTP offers its own specialised [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") model class which is tuned for both performance and idiomatic usage within other types of the HTTP model. For example, an [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest")’s target URI is parsed into this type, where all character escaping and other URI specific semantics are applied.

### Parsing a URI string

We follow [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986#section-1.1.2) to implement the URI parsing rules. When you try to parse a URI string, Akka HTTP internally creates an instance of the [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") class, which holds the modeled URI components inside.

For example, the following creates an instance of a simple valid URI:

Scala

```
Uri("http://localhost")

```

Java

```
Uri.create("http://localhost");

```

Below are some more examples of valid URI strings, and how you can construct a [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") model class instances ,using `Uri.from()` method by passing `scheme`, `host`, `path` and `query` parameters.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L481-L506 "Go to snippet source")Uri("ftp://ftp.is.co.za/rfc/rfc1808.txt") shouldEqual
  Uri.from(scheme = "ftp", host = "ftp.is.co.za", path = "/rfc/rfc1808.txt")

Uri("http://www.ietf.org/rfc/rfc2396.txt") shouldEqual
  Uri.from(scheme = "http", host = "www.ietf.org", path = "/rfc/rfc2396.txt")

Uri("ldap://[2001:db8::7]/c=GB?objectClass?one") shouldEqual
  Uri.from(scheme = "ldap", host = "[2001:db8::7]", path = "/c=GB", queryString = Some("objectClass?one"))

Uri("mailto:[[email protected]](/cdn-cgi/l/email-protection)") shouldEqual
  Uri.from(scheme = "mailto", path = "[[email protected]](/cdn-cgi/l/email-protection)")

Uri("news:comp.infosystems.www.servers.unix") shouldEqual
  Uri.from(scheme = "news", path = "comp.infosystems.www.servers.unix")

Uri("tel:+1-816-555-1212") shouldEqual
  Uri.from(scheme = "tel", path = "+1-816-555-1212")

Uri("s3:image.png") shouldEqual
  Uri.from(scheme = "s3", path = "image.png")

Uri("telnet://192.0.2.16:80/") shouldEqual
  Uri.from(scheme = "telnet", host = "192.0.2.16", port = 80, path = "/")

Uri("urn:oasis:names:specification:docbook:dtd:xml:4.1.2") shouldEqual
  Uri.from(scheme = "urn", path = "oasis:names:specification:docbook:dtd:xml:4.1.2")
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L20-L54 "Go to snippet source")Uri uri1 = Uri.create("ftp://ftp.is.co.za/rfc/rfc1808.txt");
assertEquals("ftp", uri1.getScheme());
assertEquals(Host.create("ftp.is.co.za"), uri1.getHost());
assertEquals("/rfc/rfc1808.txt", uri1.getPathString());

Uri uri2 = Uri.create("http://www.ietf.org/rfc/rfc2396.txt");
assertEquals("http", uri2.getScheme());
assertEquals(Host.create("www.ietf.org"), uri2.getHost());
assertEquals("/rfc/rfc2396.txt", uri2.getPathString());

Uri uri3 = Uri.create("ldap://[2001:db8::7]/c=GB?objectClass?one");
assertEquals("ldap", uri3.getScheme());
assertEquals(Host.create("[2001:db8::7]"), uri3.getHost());
assertEquals("objectClass?one", uri3.query().toString());

Uri uri4 = Uri.create("mailto:[[email protected]](/cdn-cgi/l/email-protection)");
assertEquals("mailto", uri4.getScheme());
assertEquals("[[email protected]](/cdn-cgi/l/email-protection)", uri4.getPathString());

Uri uri5 = Uri.create("news:comp.infosystems.www.servers.unix");
assertEquals("news", uri5.getScheme());
assertEquals("comp.infosystems.www.servers.unix", uri5.getPathString());

Uri uri6 = Uri.create("tel:+1-816-555-1212");
assertEquals("tel", uri6.getScheme());
assertEquals("+1-816-555-1212", uri6.getPathString());

Uri uri7 = Uri.create("telnet://192.0.2.16:80/");
assertEquals("telnet", uri7.getScheme());
assertEquals(Host.create("192.0.2.16"), uri7.getHost());
assertEquals("/", uri7.getPathString());

Uri uri8 = Uri.create("urn:oasis:names:specification:docbook:dtd:xml:4.1.2");
assertEquals("urn", uri8.getScheme());
assertEquals("oasis:names:specification:docbook:dtd:xml:4.1.2", uri8.getPathString());
```

For exact definitions of the parts of a URI, like `scheme`, `path` and `query` refer to [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986#section-1.1.2). Here’s a little overview:

```
  foo://example.com:8042/over/there?name=ferret#nose
  \_/   \______________/\_________/ \_________/ \__/
   |           |            |            |        |
scheme     authority       path        query   fragment
   |   _____________________|__
  / \ /                        \
  urn:example:animal:ferret:nose

```

For “special” characters in URI, you typically use percent encoding like below. Percent encoding is discussed in more detail in the [Query String in URI](uri-model.html#query-string-in-uri) section.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L523-L525 "Go to snippet source")// don't double decode
Uri("%2520").path.head shouldEqual "%20"
Uri("/%2F%5C").path shouldEqual Path / """/\"""
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L61-L64 "Go to snippet source")Uri uri1 = Uri.create("http://foo.com?foo=%2520");
assertEquals(Optional.of("%20"), uri1.query().get("foo"));
Uri uri2 = Uri.create("http://foo.com?foo=%2F%5C");
assertEquals(Optional.of("/\\"), uri2.query().get("foo"));
```

#### Invalid URI strings and IllegalUriException

When an invalid URI string is passed to `Uri()` as below, an `IllegalUriException` is thrown.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L628-L689 "Go to snippet source")//illegal scheme
the[IllegalUriException] thrownBy Uri("foö:/a") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'ö', expected scheme-char, ':', pchar, slashSegments, '?', '#' or 'EOI' (line 1, column 3)",
    "foö:/a\n" +
      "  ^")
}

// illegal userinfo
the[IllegalUriException] thrownBy Uri("http://user:ö@host") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'ö', expected userinfo-char, pct-encoded, '@' or port (line 1, column 13)",
    "http://user:ö@host\n" +
      "            ^")
}

// illegal percent-encoding
the[IllegalUriException] thrownBy Uri("http://use%2G@host") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 13)",
    "http://use%2G@host\n" +
      "            ^")
}

// illegal percent-encoding ends with %
the[IllegalUriException] thrownBy Uri("http://www.example.com/%CE%B8%") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Unexpected end of input, expected HEXDIG (line 1, column 31)",
    "http://www.example.com/%CE%B8%\n" +
      "                              ^")
}

// illegal percent-encoding in a query string
the[IllegalUriException] thrownBy Uri("http://host?use%2G") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 18)",
    "http://host?use%2G\n" +
      "                 ^")
}
// illegal percent-encoding in a fragment
the[IllegalUriException] thrownBy Uri("http://host#use%2G") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 18)",
    "http://host#use%2G\n" +
      "                 ^")
}

// illegal path
the[IllegalUriException] thrownBy Uri("http://www.example.com/name with spaces/") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input ' ', expected pchar, '/', '?', '#' or 'EOI' (line 1, column 28)",
    "http://www.example.com/name with spaces/\n" +
      "                           ^")
}

// illegal path with control character
the[IllegalUriException] thrownBy Uri("http:///with\newline") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input '\\n', expected pchar, '/', '?', '#' or 'EOI' (line 1, column 13)",
    "http:///with\n" +
      "            ^")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L77-L85 "Go to snippet source")@Test(expected = IllegalUriException.class)
public void testIllegalScheme() {
  Uri.create("foö:/a");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'ö', expected scheme-char, 'EOI', '#', ':', '?', slashSegments or pchar (line 1, column 3)",
  //  "http://user:ö@host\n" +
  //  "            ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalUserInfo() {
  Uri.create("http://user:ö@host");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'ö', expected userinfo-char, pct-encoded, '@' or port (line 1, column 13)",
  //  "http://use%2G@host\n" +
  //  "            ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPercentEncoding() {
  Uri.create("http://use%2G@host");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 13)",
  //  "http://www.example.com/name with spaces/\n" +
  //  "                           ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPath() {
  Uri.create("http://www.example.com/name with spaces/");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input ' ', expected '/', 'EOI', '#', '?' or pchar (line 1, column 28)",
  //  "http://www.example.com/name with spaces/\n" +
  //  "                           ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPathWithControlCharacter() {
  Uri.create("http:///with\newline");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input '\\n', expected '/', 'EOI', '#', '?' or pchar (line 1, column 13)",
  //  "http:///with\n" +
  //  "            ^"
  //)
}
```

#### Directives to extract URI components

To extract URI components with directives, see following references:

- [extractUri](../routing-dsl/directives/basic-directives/extractUri.html)
- [extractScheme](../routing-dsl/directives/scheme-directives/extractScheme.html)
- [scheme](../routing-dsl/directives/scheme-directives/scheme.html)
- [PathDirectives](../routing-dsl/directives/path-directives/index.html)
- [ParameterDirectives](../routing-dsl/directives/parameter-directives/index.html)

### Obtaining the raw request URI

Sometimes it may be needed to obtain the “raw” value of an incoming URI, without applying any escaping or parsing to it. While this use case is rare, it comes up every once in a while. It is possible to obtain the “raw” request URI in Akka HTTP Server side by turning on the `akka.http.server.raw-request-uri-header` flag. When enabled, a `Raw-Request-URI` header will be added to each request. This header will hold the original raw request’s URI that was used. For an example check the reference configuration.

### Query string in URI

Although any part of URI can have special characters, it is more common for the query string in URI to have special characters, which are typically [percent encoded](https://en.wikipedia.org/wiki/Percent-encoding).

[`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") class’s `query()` methodThe method `Uri::query()` returns the query string of the URI, which is modeled in an instance of the `Query` class. When you instantiate a [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") class by passing a URI string, the query string is stored in its raw string form. Then, when you call the `query()` method, the query string is parsed from the raw string.

You can add query parameters with [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") class’s `withQuery()` method`Uri::query()` method

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L783 "Go to snippet source")val uriWithQuery = uri.withQuery(Query("param1" -> "value1"))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L71 "Go to snippet source")Uri uri = Uri.create("http://foo.com").query(Query.create(Pair.create("foo","bar")));
```

The below code illustrates how valid query strings are parsed. Especially, you can check how percent encoding is used and how special characters like `+` and `;` are parsed.

Note
The `mode` parameter to `Query()` and `Uri.query()` is discussed in [Strict and Relaxed Mode](uri-model.html#strict-and-relaxed-mode).

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L313 "Go to snippet source")def strict(queryString: String): Query = Query(queryString, mode = Uri.ParsingMode.Strict)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L149-L151 "Go to snippet source")public Query strict(String query){
  return Query.create(query, akka.http.javadsl.model.Uri.STRICT);
}
```

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L317-L340 "Go to snippet source")//query component "a=b" is parsed into parameter name: "a", and value: "b"
strict("a=b") shouldEqual ("a", "b") +: Query.Empty

strict("") shouldEqual Query.Empty
strict("a") shouldEqual ("a", "") +: Query.Empty
strict("a=") shouldEqual ("a", "") +: Query.Empty
strict("a=+") shouldEqual ("a", " ") +: Query.Empty //'+' is parsed to ' '
strict("a=%2B") shouldEqual ("a", "+") +: Query.Empty
strict("=a") shouldEqual ("", "a") +: Query.Empty
strict("a&") shouldEqual ("a", "") +: ("", "") +: Query.Empty
strict("a=%62") shouldEqual ("a", "b") +: Query.Empty

strict("a%3Db=c") shouldEqual ("a=b", "c") +: Query.Empty
strict("a%26b=c") shouldEqual ("a&b", "c") +: Query.Empty
strict("a%2Bb=c") shouldEqual ("a+b", "c") +: Query.Empty
strict("a%3Bb=c") shouldEqual ("a;b", "c") +: Query.Empty

strict("a=b%3Dc") shouldEqual ("a", "b=c") +: Query.Empty
strict("a=b%26c") shouldEqual ("a", "b&c") +: Query.Empty
strict("a=b%2Bc") shouldEqual ("a", "b+c") +: Query.Empty
strict("a=b%3Bc") shouldEqual ("a", "b;c") +: Query.Empty

strict("a+b=c") shouldEqual ("a b", "c") +: Query.Empty //'+' is parsed to ' '
strict("a=b+c") shouldEqual ("a", "b c") +: Query.Empty //'+' is parsed to ' '
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L158-L181 "Go to snippet source")//query component (name: "a", and value: "b") is equal to parsed query string "a=b"
assertEquals(Query.create(Pair.create("a", "b")), strict("a=b"));

assertEquals(Query.EMPTY, strict(""));
assertEquals(Query.create(Pair.create("a", "")), strict("a"));
assertEquals(Query.create(Pair.create("a", "")), strict("a="));
assertEquals(Query.create(Pair.create("a", " ")), strict("a=+"));
assertEquals(Query.create(Pair.create("a", "+")), strict("a=%2B"));
assertEquals(Query.create(Pair.create("", "a")), strict("=a"));
assertEquals(Query.create(Pair.create("a", "")).withParam("", ""), strict("a&"));
assertEquals(Query.create(Pair.create("a", "b")), strict("a=%62"));

assertEquals(Query.create(Pair.create("a=b", "c")), strict("a%3Db=c"));
assertEquals(Query.create(Pair.create("a&b", "c")), strict("a%26b=c"));
assertEquals(Query.create(Pair.create("a+b", "c")), strict("a%2Bb=c"));
assertEquals(Query.create(Pair.create("a;b", "c")), strict("a%3Bb=c"));

assertEquals(Query.create(Pair.create("a", "b=c")), strict("a=b%3Dc"));
assertEquals(Query.create(Pair.create("a", "b&c")), strict("a=b%26c"));
assertEquals(Query.create(Pair.create("a", "b+c")), strict("a=b%2Bc"));
assertEquals(Query.create(Pair.create("a", "b;c")), strict("a=b%3Bc"));

assertEquals(Query.create(Pair.create("a b", "c")), strict("a+b=c")); //'+' is parsed to ' '
assertEquals(Query.create(Pair.create("a", "b c")), strict("a=b+c")); //'+' is parsed to ' '
```

Note that:

```
  Uri("http://localhost?a=b").query()

```

is equivalent to:

```
  Query("a=b")

```

As in the [section 3\.4 of RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986#section-3.4), some special characters like “/” and “?” are allowed inside a query string, without escaping them using (“%”) signs.

> The characters slash (“/”) and question mark (“?”) may represent data within the query component.

“/” and “?” are commonly used when you have a URI whose query parameter has another URI.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L344-L348 "Go to snippet source")strict("a?b=c") shouldEqual ("a?b", "c") +: Query.Empty
strict("a/b=c") shouldEqual ("a/b", "c") +: Query.Empty

strict("a=b?c") shouldEqual ("a", "b?c") +: Query.Empty
strict("a=b/c") shouldEqual ("a", "b/c") +: Query.Empty
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L185-L189 "Go to snippet source")assertEquals(Query.create(Pair.create("a?b", "c")), strict("a?b=c"));
assertEquals(Query.create(Pair.create("a/b", "c")), strict("a/b=c"));

assertEquals(Query.create(Pair.create("a", "b?c")), strict("a=b?c"));
assertEquals(Query.create(Pair.create("a", "b/c")), strict("a=b/c"));
```

However, some other special characters can cause `IllegalUriException` without percent encoding as follows.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L352-L363 "Go to snippet source")the[IllegalUriException] thrownBy strict("a^=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '^', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a^=b\n" +
      " ^")
}
the[IllegalUriException] thrownBy strict("a;=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input ';', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a;=b\n" +
      " ^")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L194-L201 "Go to snippet source")@Test(expected = IllegalUriException.class)
public void testStrictModeException1() {
  strict("a^=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input '^', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a^=b\n" +
  //  " ^")
}
```

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L367-L380 "Go to snippet source")//double '=' in query string is invalid
the[IllegalUriException] thrownBy strict("a=b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected '+', query-char, pct-encoded, '&' or 'EOI' (line 1, column 4)",
    "a=b=c\n" +
      "   ^")
}
//following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
the[IllegalUriException] thrownBy strict("a%b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected HEXDIG (line 1, column 4)",
    "a%b=c\n" +
      "   ^")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L205-L212 "Go to snippet source")@Test(expected = IllegalUriException.class)
public void testStrictModeException2() {
  strict("a;=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input ';', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a;=b\n" +
  //  " ^")
}
```

#### Strict and Relaxed Mode

The `Uri.query()` method and `Query()` take a parameter `mode`, which is either `Uri.ParsingMode.Strict` or `Uri.ParsingMode.Relaxed`. Switching the mode gives different behavior on parsing some special characters in URI.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L385 "Go to snippet source")def relaxed(queryString: String): Query = Query(queryString, mode = Uri.ParsingMode.Relaxed)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L240-L242 "Go to snippet source")public Query relaxed(String query){
  return Query.create(query,  akka.http.javadsl.model.Uri.RELAXED);
}
```

The below two cases threw `IllegalUriException` when you specified the `Strict` mode,

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L352-L363 "Go to snippet source")the[IllegalUriException] thrownBy strict("a^=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '^', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a^=b\n" +
      " ^")
}
the[IllegalUriException] thrownBy strict("a;=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input ';', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a;=b\n" +
      " ^")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L194-L201 "Go to snippet source")@Test(expected = IllegalUriException.class)
public void testStrictModeException1() {
  strict("a^=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input '^', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a^=b\n" +
  //  " ^")
}
@Test(expected = IllegalUriException.class)
public void testStrictModeException2() {
  strict("a;=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input ';', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a;=b\n" +
  //  " ^")
}
```

but the `Relaxed` mode parses them as they are.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L419-L421 "Go to snippet source")relaxed("a^=b") shouldEqual ("a^", "b") +: Query.Empty
relaxed("a;=b") shouldEqual ("a;", "b") +: Query.Empty
relaxed("a=b=c") shouldEqual ("a", "b=c") +: Query.Empty
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L280-L282 "Go to snippet source")assertEquals(Query.create(Pair.create("a^", "b")), relaxed("a^=b"));
assertEquals(Query.create(Pair.create("a;", "b")), relaxed("a;=b"));
assertEquals(Query.create(Pair.create("a", "b=c")), relaxed("a=b=c"));
```

However, even with the `Relaxed` mode, there are still invalid special characters which require percent encoding.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/scaladsl/model/UriSpec.scala#L425-L432 "Go to snippet source")//following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
//still invalid even in relaxed mode
the[IllegalUriException] thrownBy relaxed("a%b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected HEXDIG (line 1, column 4)",
    "a%b=c\n" +
      "   ^")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/java/akka/http/javadsl/model/UriTest.java#L287-L296 "Go to snippet source")@Test(expected = IllegalUriException.class)
public void testRelaxedModeException1() {
  //following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
  //still invalid even in relaxed mode
  relaxed("a%b=c");
  //IllegalUriException(
  //  "Illegal query: Invalid input '=', expected '+', query-char, 'EOI', '&' or pct-encoded (line 1, column 4)",
  //  "a%b=c\n" +
  //  "   ^")
}
```

Other than specifying the `mode` in the parameters, like when using directives, you can specify the `mode` in your configuration as follows.

```
    # Sets the strictness mode for parsing request target URIs.
    # The following values are defined:
    #
    # `strict`: RFC3986-compliant URIs are required,
    #     a 400 response is triggered on violations
    #
    # `relaxed`: all visible 7-Bit ASCII chars are allowed
    #
    uri-parsing-mode = strict

```

To access the raw, unparsed representation of the query part of a URI use the `rawQueryString` member of the [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") class.

#### Directives to extract query parameters

If you want to use directives to extract query parameters, see below pages.

- [parameters](../routing-dsl/directives/parameter-directives/parameters.html)
- [parameter](../routing-dsl/directives/parameter-directives/parameter.html)

## Code Examples

### Example 1: Parsing a URI string

```text
Uri("http://localhost")
```

### Example 2: Parsing a URI string

```text
Uri.create("http://localhost");
```

### Example 3: Parsing a URI string

```scala
Uri("ftp://ftp.is.co.za/rfc/rfc1808.txt") shouldEqual
  Uri.from(scheme = "ftp", host = "ftp.is.co.za", path = "/rfc/rfc1808.txt")

Uri("http://www.ietf.org/rfc/rfc2396.txt") shouldEqual
  Uri.from(scheme = "http", host = "www.ietf.org", path = "/rfc/rfc2396.txt")

Uri("ldap://[2001:db8::7]/c=GB?objectClass?one") shouldEqual
  Uri.from(scheme = "ldap", host = "[2001:db8::7]", path = "/c=GB", queryString = Some("objectClass?one"))

Uri("mailto:[email protected]") shouldEqual
  Uri.from(scheme = "mailto", path = "[email protected]")

Uri("news:comp.infosystems.www.servers.unix") shouldEqual
  Uri.from(scheme = "news", path = "comp.infosystems.www.servers.unix")

Uri("tel:+1-816-555-1212") shouldEqual
  Uri.from(scheme = "tel", path = "+1-816-555-1212")

Uri("s3:image.png") shouldEqual
  Uri.from(scheme = "s3", path = "image.png")

Uri("telnet://192.0.2.16:80/") shouldEqual
  Uri.from(scheme = "telnet", host = "192.0.2.16", port = 80, path = "/")

Uri("urn:oasis:names:specification:docbook:dtd:xml:4.1.2") shouldEqual
  Uri.from(scheme = "urn", path = "oasis:names:specification:docbook:dtd:xml:4.1.2")
```

### Example 4: Parsing a URI string

```java
Uri uri1 = Uri.create("ftp://ftp.is.co.za/rfc/rfc1808.txt");
assertEquals("ftp", uri1.getScheme());
assertEquals(Host.create("ftp.is.co.za"), uri1.getHost());
assertEquals("/rfc/rfc1808.txt", uri1.getPathString());

Uri uri2 = Uri.create("http://www.ietf.org/rfc/rfc2396.txt");
assertEquals("http", uri2.getScheme());
assertEquals(Host.create("www.ietf.org"), uri2.getHost());
assertEquals("/rfc/rfc2396.txt", uri2.getPathString());

Uri uri3 = Uri.create("ldap://[2001:db8::7]/c=GB?objectClass?one");
assertEquals("ldap", uri3.getScheme());
assertEquals(Host.create("[2001:db8::7]"), uri3.getHost());
assertEquals("objectClass?one", uri3.query().toString());

Uri uri4 = Uri.create("mailto:[email protected]");
assertEquals("mailto", uri4.getScheme());
assertEquals("[email protected]", uri4.getPathString());

Uri uri5 = Uri.create("news:comp.infosystems.www.servers.unix");
assertEquals("news", uri5.getScheme());
assertEquals("comp.infosystems.www.servers.unix", uri5.getPathString());

Uri uri6 = Uri.create("tel:+1-816-555-1212");
assertEquals("tel", uri6.getScheme());
assertEquals("+1-816-555-1212", uri6.getPathString());

Uri uri7 = Uri.create("telnet://192.0.2.16:80/");
assertEquals("telnet", uri7.getScheme());
assertEquals(Host.create("192.0.2.16"), uri7.getHost());
assertEquals("/", uri7.getPathString());

Uri uri8 = Uri.create("urn:oasis:names:specification:docbook:dtd:xml:4.1.2");
assertEquals("urn", uri8.getScheme());
assertEquals("oasis:names:specification:docbook:dtd:xml:4.1.2", uri8.getPathString());
```

### Example 5: Parsing a URI string

```text
foo://example.com:8042/over/there?name=ferret#nose
  \_/   \______________/\_________/ \_________/ \__/
   |           |            |            |        |
scheme     authority       path        query   fragment
   |   _____________________|__
  / \ /                        \
  urn:example:animal:ferret:nose
```

### Example 6: Parsing a URI string

```scala
// don't double decode
Uri("%2520").path.head shouldEqual "%20"
Uri("/%2F%5C").path shouldEqual Path / """/\"""
```

### Example 7: Parsing a URI string

```java
Uri uri1 = Uri.create("http://foo.com?foo=%2520");
assertEquals(Optional.of("%20"), uri1.query().get("foo"));
Uri uri2 = Uri.create("http://foo.com?foo=%2F%5C");
assertEquals(Optional.of("/\\"), uri2.query().get("foo"));
```

### Example 8: Invalid URI strings and IllegalUriException

```scala
//illegal scheme
the[IllegalUriException] thrownBy Uri("foö:/a") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'ö', expected scheme-char, ':', pchar, slashSegments, '?', '#' or 'EOI' (line 1, column 3)",
    "foö:/a\n" +
      "  ^")
}

// illegal userinfo
the[IllegalUriException] thrownBy Uri("http://user:ö@host") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'ö', expected userinfo-char, pct-encoded, '@' or port (line 1, column 13)",
    "http://user:ö@host\n" +
      "            ^")
}

// illegal percent-encoding
the[IllegalUriException] thrownBy Uri("http://use%2G@host") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 13)",
    "http://use%2G@host\n" +
      "            ^")
}

// illegal percent-encoding ends with %
the[IllegalUriException] thrownBy Uri("http://www.example.com/%CE%B8%") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Unexpected end of input, expected HEXDIG (line 1, column 31)",
    "http://www.example.com/%CE%B8%\n" +
      "                              ^")
}

// illegal percent-encoding in a query string
the[IllegalUriException] thrownBy Uri("http://host?use%2G") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 18)",
    "http://host?use%2G\n" +
      "                 ^")
}
// illegal percent-encoding in a fragment
the[IllegalUriException] thrownBy Uri("http://host#use%2G") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 18)",
    "http://host#use%2G\n" +
      "                 ^")
}

// illegal path
the[IllegalUriException] thrownBy Uri("http://www.example.com/name with spaces/") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input ' ', expected pchar, '/', '?', '#' or 'EOI' (line 1, column 28)",
    "http://www.example.com/name with spaces/\n" +
      "                           ^")
}

// illegal path with control character
the[IllegalUriException] thrownBy Uri("http:///with\newline") shouldBe {
  IllegalUriException(
    "Illegal URI reference: Invalid input '\\n', expected pchar, '/', '?', '#' or 'EOI' (line 1, column 13)",
    "http:///with\n" +
      "            ^")
}
```

### Example 9: Invalid URI strings and IllegalUriException

```java
@Test(expected = IllegalUriException.class)
public void testIllegalScheme() {
  Uri.create("foö:/a");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'ö', expected scheme-char, 'EOI', '#', ':', '?', slashSegments or pchar (line 1, column 3)",
  //  "http://user:ö@host\n" +
  //  "            ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalUserInfo() {
  Uri.create("http://user:ö@host");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'ö', expected userinfo-char, pct-encoded, '@' or port (line 1, column 13)",
  //  "http://use%2G@host\n" +
  //  "            ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPercentEncoding() {
  Uri.create("http://use%2G@host");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input 'G', expected HEXDIG (line 1, column 13)",
  //  "http://www.example.com/name with spaces/\n" +
  //  "                           ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPath() {
  Uri.create("http://www.example.com/name with spaces/");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input ' ', expected '/', 'EOI', '#', '?' or pchar (line 1, column 28)",
  //  "http://www.example.com/name with spaces/\n" +
  //  "                           ^"
  //)
}
@Test(expected = IllegalUriException.class)
public void testIllegalPathWithControlCharacter() {
  Uri.create("http:///with\newline");
  //IllegalUriException(
  //  "Illegal URI reference: Invalid input '\\n', expected '/', 'EOI', '#', '?' or pchar (line 1, column 13)",
  //  "http:///with\n" +
  //  "            ^"
  //)
}
```

### Example 10: Query string in URI

```scala
val uriWithQuery = uri.withQuery(Query("param1" -> "value1"))
```

### Example 11: Query string in URI

```java
Uri uri = Uri.create("http://foo.com").query(Query.create(Pair.create("foo","bar")));
```

### Example 12: Query string in URI

```scala
def strict(queryString: String): Query = Query(queryString, mode = Uri.ParsingMode.Strict)
```

### Example 13: Query string in URI

```java
public Query strict(String query){
  return Query.create(query, akka.http.javadsl.model.Uri.STRICT);
}
```

### Example 14: Query string in URI

```scala
//query component "a=b" is parsed into parameter name: "a", and value: "b"
strict("a=b") shouldEqual ("a", "b") +: Query.Empty

strict("") shouldEqual Query.Empty
strict("a") shouldEqual ("a", "") +: Query.Empty
strict("a=") shouldEqual ("a", "") +: Query.Empty
strict("a=+") shouldEqual ("a", " ") +: Query.Empty //'+' is parsed to ' '
strict("a=%2B") shouldEqual ("a", "+") +: Query.Empty
strict("=a") shouldEqual ("", "a") +: Query.Empty
strict("a&") shouldEqual ("a", "") +: ("", "") +: Query.Empty
strict("a=%62") shouldEqual ("a", "b") +: Query.Empty

strict("a%3Db=c") shouldEqual ("a=b", "c") +: Query.Empty
strict("a%26b=c") shouldEqual ("a&b", "c") +: Query.Empty
strict("a%2Bb=c") shouldEqual ("a+b", "c") +: Query.Empty
strict("a%3Bb=c") shouldEqual ("a;b", "c") +: Query.Empty

strict("a=b%3Dc") shouldEqual ("a", "b=c") +: Query.Empty
strict("a=b%26c") shouldEqual ("a", "b&c") +: Query.Empty
strict("a=b%2Bc") shouldEqual ("a", "b+c") +: Query.Empty
strict("a=b%3Bc") shouldEqual ("a", "b;c") +: Query.Empty

strict("a+b=c") shouldEqual ("a b", "c") +: Query.Empty //'+' is parsed to ' '
strict("a=b+c") shouldEqual ("a", "b c") +: Query.Empty //'+' is parsed to ' '
```

### Example 15: Query string in URI

```java
//query component (name: "a", and value: "b") is equal to parsed query string "a=b"
assertEquals(Query.create(Pair.create("a", "b")), strict("a=b"));

assertEquals(Query.EMPTY, strict(""));
assertEquals(Query.create(Pair.create("a", "")), strict("a"));
assertEquals(Query.create(Pair.create("a", "")), strict("a="));
assertEquals(Query.create(Pair.create("a", " ")), strict("a=+"));
assertEquals(Query.create(Pair.create("a", "+")), strict("a=%2B"));
assertEquals(Query.create(Pair.create("", "a")), strict("=a"));
assertEquals(Query.create(Pair.create("a", "")).withParam("", ""), strict("a&"));
assertEquals(Query.create(Pair.create("a", "b")), strict("a=%62"));

assertEquals(Query.create(Pair.create("a=b", "c")), strict("a%3Db=c"));
assertEquals(Query.create(Pair.create("a&b", "c")), strict("a%26b=c"));
assertEquals(Query.create(Pair.create("a+b", "c")), strict("a%2Bb=c"));
assertEquals(Query.create(Pair.create("a;b", "c")), strict("a%3Bb=c"));

assertEquals(Query.create(Pair.create("a", "b=c")), strict("a=b%3Dc"));
assertEquals(Query.create(Pair.create("a", "b&c")), strict("a=b%26c"));
assertEquals(Query.create(Pair.create("a", "b+c")), strict("a=b%2Bc"));
assertEquals(Query.create(Pair.create("a", "b;c")), strict("a=b%3Bc"));

assertEquals(Query.create(Pair.create("a b", "c")), strict("a+b=c")); //'+' is parsed to ' '
assertEquals(Query.create(Pair.create("a", "b c")), strict("a=b+c")); //'+' is parsed to ' '
```

### Example 16: Query string in URI

```text
Uri("http://localhost?a=b").query()
```

### Example 17: Query string in URI

```text
Query("a=b")
```

### Example 18: Query string in URI

```scala
strict("a?b=c") shouldEqual ("a?b", "c") +: Query.Empty
strict("a/b=c") shouldEqual ("a/b", "c") +: Query.Empty

strict("a=b?c") shouldEqual ("a", "b?c") +: Query.Empty
strict("a=b/c") shouldEqual ("a", "b/c") +: Query.Empty
```

### Example 19: Query string in URI

```java
assertEquals(Query.create(Pair.create("a?b", "c")), strict("a?b=c"));
assertEquals(Query.create(Pair.create("a/b", "c")), strict("a/b=c"));

assertEquals(Query.create(Pair.create("a", "b?c")), strict("a=b?c"));
assertEquals(Query.create(Pair.create("a", "b/c")), strict("a=b/c"));
```

### Example 20: Query string in URI

```scala
the[IllegalUriException] thrownBy strict("a^=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '^', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a^=b\n" +
      " ^")
}
the[IllegalUriException] thrownBy strict("a;=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input ';', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a;=b\n" +
      " ^")
}
```

### Example 21: Query string in URI

```java
@Test(expected = IllegalUriException.class)
public void testStrictModeException1() {
  strict("a^=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input '^', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a^=b\n" +
  //  " ^")
}
```

### Example 22: Query string in URI

```scala
//double '=' in query string is invalid
the[IllegalUriException] thrownBy strict("a=b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected '+', query-char, pct-encoded, '&' or 'EOI' (line 1, column 4)",
    "a=b=c\n" +
      "   ^")
}
//following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
the[IllegalUriException] thrownBy strict("a%b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected HEXDIG (line 1, column 4)",
    "a%b=c\n" +
      "   ^")
}
```

### Example 23: Query string in URI

```java
@Test(expected = IllegalUriException.class)
public void testStrictModeException2() {
  strict("a;=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input ';', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a;=b\n" +
  //  " ^")
}
```

### Example 24: Strict and Relaxed Mode

```scala
def relaxed(queryString: String): Query = Query(queryString, mode = Uri.ParsingMode.Relaxed)
```

### Example 25: Strict and Relaxed Mode

```java
public Query relaxed(String query){
  return Query.create(query,  akka.http.javadsl.model.Uri.RELAXED);
}
```

### Example 26: Strict and Relaxed Mode

```scala
the[IllegalUriException] thrownBy strict("a^=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '^', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a^=b\n" +
      " ^")
}
the[IllegalUriException] thrownBy strict("a;=b") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input ';', expected '+', query-char, pct-encoded, '=', '&' or 'EOI' (line 1, column 2)",
    "a;=b\n" +
      " ^")
}
```

### Example 27: Strict and Relaxed Mode

```java
@Test(expected = IllegalUriException.class)
public void testStrictModeException1() {
  strict("a^=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input '^', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a^=b\n" +
  //  " ^")
}
@Test(expected = IllegalUriException.class)
public void testStrictModeException2() {
  strict("a;=b");
  //IllegalUriException(
  //  "Illegal query: Invalid input ';', expected '+', '=', query-char, 'EOI', '&' or pct-encoded (line 1, column 2)",
  //  "a;=b\n" +
  //  " ^")
}
```

### Example 28: Strict and Relaxed Mode

```scala
relaxed("a^=b") shouldEqual ("a^", "b") +: Query.Empty
relaxed("a;=b") shouldEqual ("a;", "b") +: Query.Empty
relaxed("a=b=c") shouldEqual ("a", "b=c") +: Query.Empty
```

### Example 29: Strict and Relaxed Mode

```java
assertEquals(Query.create(Pair.create("a^", "b")), relaxed("a^=b"));
assertEquals(Query.create(Pair.create("a;", "b")), relaxed("a;=b"));
assertEquals(Query.create(Pair.create("a", "b=c")), relaxed("a=b=c"));
```

### Example 30: Strict and Relaxed Mode

```scala
//following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
//still invalid even in relaxed mode
the[IllegalUriException] thrownBy relaxed("a%b=c") shouldBe {
  IllegalUriException(
    "Illegal query: Invalid input '=', expected HEXDIG (line 1, column 4)",
    "a%b=c\n" +
      "   ^")
}
```

### Example 31: Strict and Relaxed Mode

```java
@Test(expected = IllegalUriException.class)
public void testRelaxedModeException1() {
  //following '%', it should be percent encoding (HEXDIG), but "%b=" is not a valid percent encoding
  //still invalid even in relaxed mode
  relaxed("a%b=c");
  //IllegalUriException(
  //  "Illegal query: Invalid input '=', expected '+', query-char, 'EOI', '&' or pct-encoded (line 1, column 4)",
  //  "a%b=c\n" +
  //  "   ^")
}
```

### Example 32: Strict and Relaxed Mode

```text
# Sets the strictness mode for parsing request target URIs.
    # The following values are defined:
    #
    # `strict`: RFC3986-compliant URIs are required,
    #     a 400 response is triggered on violations
    #
    # `relaxed`: all visible 7-Bit ASCII chars are allowed
    #
    uri-parsing-mode = strict
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/uri-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/extractScheme.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/uri-model.html](https://doc.akka.io/libraries/akka-http/current/common/uri-model.html)*