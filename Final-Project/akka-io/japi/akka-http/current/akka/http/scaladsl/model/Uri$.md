---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri$.html
title: Uri$
---

# Uri$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Uri$

- java.lang.Object
- - akka.http.scaladsl.model.Uri$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Uri$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.Uri$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Uri$](Uri$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Uri$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.parboiled2.ParserInput))​(akka.parboiled2.ParserInput input)` | Parses a valid URI string into a normalized URI reference as defined  by http://tools.ietf.org/html/rfc3986\#section\-4\.1\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.parboiled2.ParserInput,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput input,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses a valid URI string into a normalized URI reference as defined  by http://tools.ietf.org/html/rfc3986\#section\-4\.1\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput input,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses a valid URI string into a normalized URI reference as defined  by http://tools.ietf.org/html/rfc3986\#section\-4\.1\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String))​(java.lang.String input)` | Parses a valid URI string into a normalized URI reference as defined  by http://tools.ietf.org/html/rfc3986\#section\-4\.1\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,akka.http.scaladsl.model.Uri.Authority,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option))​(java.lang.String scheme,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> queryString,  scala.Option<java.lang.String> fragment)` | Creates a new Uri instance from the given components. |
	| `[Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[collapseDotSegments](#collapseDotSegments(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[create](#create(java.lang.String,akka.http.scaladsl.model.Uri.Authority,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option))​(java.lang.String scheme,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> queryString,  scala.Option<java.lang.String> fragment)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[create](#create(java.lang.String,java.lang.String,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option))​(java.lang.String scheme,  java.lang.String userinfo,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,  int port,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> queryString,  scala.Option<java.lang.String> fragment)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[createUnsafe](#createUnsafe(java.lang.String,akka.http.scaladsl.model.Uri.Authority,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option))​(java.lang.String scheme,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> queryString,  scala.Option<java.lang.String> fragment)` | 'Unsafe' in the sense that queryString validation must already have been done. |
	| `java.lang.String` | `[decode](#decode(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` |  |
	| `java.lang.String` | `[decode](#decode(java.lang.String,java.nio.charset.Charset,int,java.lang.StringBuilder))​(java.lang.String string,  java.nio.charset.Charset charset,  int ix,  java.lang.StringBuilder sb)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[effectiveHttpRequestUri](#effectiveHttpRequestUri(java.lang.String,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option,boolean,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Authority))​(java.lang.String scheme,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,  int port,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> query,  scala.Option<java.lang.String> fragment,  boolean securedConnection,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") hostHeaderHost,  int hostHeaderPort,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") defaultAuthority)` | Converts a set of URI components to an "effective HTTP request URI" as defined by  http://tools.ietf.org/html/rfc7230\#section\-5\.5\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[effectiveRequestUri](#effectiveRequestUri(java.lang.String,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option,java.lang.String,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Authority))​(java.lang.String scheme,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,  int port,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> query,  scala.Option<java.lang.String> fragment,  java.lang.String defaultScheme,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") hostHeaderHost,  int hostHeaderPort,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") defaultAuthority)` | Converts a set of URI components to an "effective request URI" as defined by  http://tools.ietf.org/html/rfc7230\#section\-5\.5\. |
	| `scala.runtime.Nothing$` | `[fail](#fail(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[from](#from(java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,scala.Option,scala.Option,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String scheme,  java.lang.String userinfo,  java.lang.String host,  int port,  java.lang.String path,  scala.Option<java.lang.String> queryString,  scala.Option<java.lang.String> fragment,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Creates a new Uri instance from the given components. |
	| `java.lang.String` | `[httpScheme](#httpScheme(boolean))​(boolean securedConnection)` |  |
	| `java.lang.String` | `[normalize](#normalize(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput uri,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Normalizes the given URI string by performing the following normalizations:  \- the `scheme` and `host` components are converted to lowercase  \- a potentially existing `port` component is removed if it matches one of the defined default ports for the scheme  \- percent\-encoded octets are decoded if allowed, otherwise they are converted to uppercase hex notation  \- `.` and `..` path segments are resolved as far as possible |
	| `int` | `[normalizePort](#normalizePort(int,java.lang.String))​(int port,  java.lang.String scheme)` |  |
	| `java.lang.String` | `[normalizeScheme](#normalizeScheme(java.lang.String))​(java.lang.String scheme)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[parseAbsolute](#parseAbsolute(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput input,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses a string into a normalized absolute URI as defined by http://tools.ietf.org/html/rfc3986\#section\-4\.3\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[parseAndResolve](#parseAndResolve(akka.parboiled2.ParserInput,akka.http.scaladsl.model.Uri,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput string,  [Uri](Uri.html "class in akka.http.scaladsl.model") base,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses a string into a normalized URI reference that is immediately resolved against the given base URI as  defined by http://tools.ietf.org/html/rfc3986\#section\-5\.2\. |
	| `[Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model")` | `[parseHttp2AuthorityPseudoHeader](#parseHttp2AuthorityPseudoHeader(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput headerValue,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses the given string as if it were the value of an HTTP/2 ":authority" pseudo\-header. |
	| `scala.Tuple2<[Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>>` | `[parseHttp2PathPseudoHeader](#parseHttp2PathPseudoHeader(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput headerValue,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses the given string as if it were the value of an HTTP/2 ":path" pseudo\-header. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[parseHttpRequestTarget](#parseHttpRequestTarget(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput requestTarget,  java.nio.charset.Charset charset,  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Parses the given string into an HTTP request target URI as defined by  http://tools.ietf.org/html/rfc7230\#section\-5\.3\. |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[resolveUnsafe](#resolveUnsafe(java.lang.String,java.lang.String,akka.http.scaladsl.model.Uri.Host,int,akka.http.scaladsl.model.Uri.Path,scala.Option,scala.Option,akka.http.scaladsl.model.Uri))​(java.lang.String scheme,  java.lang.String userinfo,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,  int port,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  scala.Option<java.lang.String> query,  scala.Option<java.lang.String> fragment,  [Uri](Uri.html "class in akka.http.scaladsl.model") base)` | https://tools.ietf.org/html/rfc3986\#section\-5\.2\.2 |
	| `[Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[verifyPath](#verifyPath(akka.http.scaladsl.model.Uri.Path,java.lang.String,akka.http.scaladsl.model.Uri.Host))​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  java.lang.String scheme,  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host)` |  |
	| `java.lang.String` | `[websocketScheme](#websocketScheme(boolean))​(boolean securedConnection)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Uri$](Uri$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Uri$
		
		
		
		```
		public Uri$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") apply​(java.lang.String input)
		```
		
		Parses a valid URI string into a normalized URI reference as defined
		 by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
		 Percent\-encoded octets are UTF\-8 decoded.
		 Accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		
		Parameters:
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") apply​(akka.parboiled2.ParserInput input)
		```
		
		Parses a valid URI string into a normalized URI reference as defined
		 by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
		 Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
		 Accepts unencoded visible 7\-bit ASCII characters in addition to the rfc.
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		
		Parameters:
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") apply​(akka.parboiled2.ParserInput input,
		                 [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses a valid URI string into a normalized URI reference as defined
		 by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
		 Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") apply​(akka.parboiled2.ParserInput input,
		                 java.nio.charset.Charset charset,
		                 [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses a valid URI string into a normalized URI reference as defined
		 by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
		 Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`input` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") apply​(java.lang.String scheme,
		                 [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,
		                 [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                 scala.Option<java.lang.String> queryString,
		                 scala.Option<java.lang.String> fragment)
		```
		
		Creates a new Uri instance from the given components.
		 All components are verified and normalized except the authority which is kept as provided.
		 If the given combination of components does not constitute a valid URI as defined by
		 http://tools.ietf.org/html/rfc3986 the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`queryString` \- percent\-encoded query string. When characters are
		 encountered that are outside of the RFC3986 range they
		 are automatically percent\-encoded
		`scheme` \- (undocumented)
		`authority` \- (undocumented)
		`path` \- (undocumented)
		`fragment` \- (undocumented)
		Returns:
		(undocumented)
		- #### from
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") from​(java.lang.String scheme,
		                java.lang.String userinfo,
		                java.lang.String host,
		                int port,
		                java.lang.String path,
		                scala.Option<java.lang.String> queryString,
		                scala.Option<java.lang.String> fragment,
		                [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Creates a new Uri instance from the given components.
		 All components are verified and normalized.
		 If the given combination of components does not constitute a valid URI as defined by
		 http://tools.ietf.org/html/rfc3986 the method throws an `IllegalUriException`.
		
		Parameters:
		`scheme` \- (undocumented)
		`userinfo` \- (undocumented)
		`host` \- (undocumented)
		`port` \- (undocumented)
		`path` \- (undocumented)
		`queryString` \- (undocumented)
		`fragment` \- (undocumented)
		`mode` \- (undocumented)
		Returns:
		(undocumented)
		- #### parseAbsolute
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") parseAbsolute​(akka.parboiled2.ParserInput input,
		                         java.nio.charset.Charset charset,
		                         [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses a string into a normalized absolute URI as defined by http://tools.ietf.org/html/rfc3986\#section\-4\.3\.
		 Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`input` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### parseAndResolve
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") parseAndResolve​(akka.parboiled2.ParserInput string,
		                           [Uri](Uri.html "class in akka.http.scaladsl.model") base,
		                           java.nio.charset.Charset charset,
		                           [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses a string into a normalized URI reference that is immediately resolved against the given base URI as
		 defined by http://tools.ietf.org/html/rfc3986\#section\-5\.2\.
		 Note that the given base Uri must be absolute (i.e. define a scheme).
		 Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`string` \- (undocumented)
		`base` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### parseHttpRequestTarget
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") parseHttpRequestTarget​(akka.parboiled2.ParserInput requestTarget,
		                                  java.nio.charset.Charset charset,
		                                  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses the given string into an HTTP request target URI as defined by
		 http://tools.ietf.org/html/rfc7230\#section\-5\.3\.
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`requestTarget` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### parseHttp2PathPseudoHeader
		
		
		
		```
		public scala.Tuple2<[Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>> parseHttp2PathPseudoHeader​(akka.parboiled2.ParserInput headerValue,
		                                                                                              java.nio.charset.Charset charset,
		                                                                                              [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses the given string as if it were the value of an HTTP/2 ":path" pseudo\-header.
		 The result is a path and a query string as defined in
		 https://tools.ietf.org/html/rfc7540\#section\-8\.1\.2\.3
		 If the given string is not a valid path or query string the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`headerValue` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		path and percent\-encoded query string. When in in 'relaxed' mode, characters not permitted by https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 are already automatically percent\-encoded here
		- #### parseHttp2AuthorityPseudoHeader
		
		
		
		```
		public [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") parseHttp2AuthorityPseudoHeader​(akka.parboiled2.ParserInput headerValue,
		                                                     java.nio.charset.Charset charset,
		                                                     [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Parses the given string as if it were the value of an HTTP/2 ":authority" pseudo\-header.
		 The result is an authority object.
		 https://tools.ietf.org/html/rfc7540\#section\-8\.1\.2\.3
		 If the given string is not a valid path or query string the method throws an `IllegalUriException`.
		 
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`headerValue` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### normalize
		
		
		
		```
		public java.lang.String normalize​(akka.parboiled2.ParserInput uri,
		                                  java.nio.charset.Charset charset,
		                                  [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Normalizes the given URI string by performing the following normalizations:
		 \- the `scheme` and `host` components are converted to lowercase
		 \- a potentially existing `port` component is removed if it matches one of the defined default ports for the scheme
		 \- percent\-encoded octets are decoded if allowed, otherwise they are converted to uppercase hex notation
		 \- `.` and `..` path segments are resolved as far as possible
		 
		 If the given string is not a valid URI the method throws an `IllegalUriException`.
		 
		
		
		
		Parameters:
		`mode` \- if `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
		`uri` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### effectiveHttpRequestUri
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") effectiveHttpRequestUri​(java.lang.String scheme,
		                                   [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,
		                                   int port,
		                                   [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                                   scala.Option<java.lang.String> query,
		                                   scala.Option<java.lang.String> fragment,
		                                   boolean securedConnection,
		                                   [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") hostHeaderHost,
		                                   int hostHeaderPort,
		                                   [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") defaultAuthority)
		```
		
		Converts a set of URI components to an "effective HTTP request URI" as defined by
		 http://tools.ietf.org/html/rfc7230\#section\-5\.5\.
		
		Parameters:
		`scheme` \- (undocumented)
		`host` \- (undocumented)
		`port` \- (undocumented)
		`path` \- (undocumented)
		`query` \- (undocumented)
		`fragment` \- (undocumented)
		`securedConnection` \- (undocumented)
		`hostHeaderHost` \- (undocumented)
		`hostHeaderPort` \- (undocumented)
		`defaultAuthority` \- (undocumented)
		Returns:
		(undocumented)
		- #### effectiveRequestUri
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") effectiveRequestUri​(java.lang.String scheme,
		                               [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,
		                               int port,
		                               [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                               scala.Option<java.lang.String> query,
		                               scala.Option<java.lang.String> fragment,
		                               java.lang.String defaultScheme,
		                               [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") hostHeaderHost,
		                               int hostHeaderPort,
		                               [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") defaultAuthority)
		```
		
		Converts a set of URI components to an "effective request URI" as defined by
		 http://tools.ietf.org/html/rfc7230\#section\-5\.5\.
		
		Parameters:
		`scheme` \- (undocumented)
		`host` \- (undocumented)
		`port` \- (undocumented)
		`path` \- (undocumented)
		`query` \- (undocumented)
		`fragment` \- (undocumented)
		`defaultScheme` \- (undocumented)
		`hostHeaderHost` \- (undocumented)
		`hostHeaderPort` \- (undocumented)
		`defaultAuthority` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpScheme
		
		
		
		```
		public java.lang.String httpScheme​(boolean securedConnection)
		```
		- #### websocketScheme
		
		
		
		```
		public java.lang.String websocketScheme​(boolean securedConnection)
		```
		- #### resolveUnsafe
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") resolveUnsafe​(java.lang.String scheme,
		                         java.lang.String userinfo,
		                         [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,
		                         int port,
		                         [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                         scala.Option<java.lang.String> query,
		                         scala.Option<java.lang.String> fragment,
		                         [Uri](Uri.html "class in akka.http.scaladsl.model") base)
		```
		
		https://tools.ietf.org/html/rfc3986\#section\-5\.2\.2
		 
		 'Unsafe' in the sense that queryString validation must already have been done.
		 
		
		
		
		Parameters:
		`query` \- percent\-encoded query string that must be guaranteed
		 not to contain invalid percent\-encodings or characters not allowed by
		 the RFC.
		`scheme` \- (undocumented)
		`userinfo` \- (undocumented)
		`host` \- (undocumented)
		`port` \- (undocumented)
		`path` \- (undocumented)
		`fragment` \- (undocumented)
		`base` \- (undocumented)
		Returns:
		(undocumented)
		- #### decode
		
		
		
		```
		public java.lang.String decode​(java.lang.String string,
		                               java.nio.charset.Charset charset)
		```
		- #### decode
		
		
		
		```
		public java.lang.String decode​(java.lang.String string,
		                               java.nio.charset.Charset charset,
		                               int ix,
		                               java.lang.StringBuilder sb)
		```
		- #### normalizeScheme
		
		
		
		```
		public java.lang.String normalizeScheme​(java.lang.String scheme)
		```
		- #### normalizePort
		
		
		
		```
		public int normalizePort​(int port,
		                         java.lang.String scheme)
		```
		- #### verifyPath
		
		
		
		```
		public [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") verifyPath​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                           java.lang.String scheme,
		                           [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host)
		```
		- #### collapseDotSegments
		
		
		
		```
		public [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") collapseDotSegments​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path)
		```
		- #### fail
		
		
		
		```
		public scala.runtime.Nothing$ fail​(java.lang.String summary,
		                                   java.lang.String detail)
		```
		- #### create
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") create​(java.lang.String scheme,
		                  java.lang.String userinfo,
		                  [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") host,
		                  int port,
		                  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                  scala.Option<java.lang.String> queryString,
		                  scala.Option<java.lang.String> fragment)
		```
		
		
		Parameters:
		`queryString` \- percent\-encoded query string. When characters are
		 encountered that are outside of the RFC3986 range they
		 are automatically percent\-encoded
		`scheme` \- (undocumented)
		`userinfo` \- (undocumented)
		`host` \- (undocumented)
		`port` \- (undocumented)
		`path` \- (undocumented)
		`fragment` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") create​(java.lang.String scheme,
		                  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,
		                  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                  scala.Option<java.lang.String> queryString,
		                  scala.Option<java.lang.String> fragment)
		```
		
		
		Parameters:
		`queryString` \- percent\-encoded query string. When characters are
		 encountered that are outside of the RFC3986 range they
		 are automatically percent\-encoded
		`scheme` \- (undocumented)
		`authority` \- (undocumented)
		`path` \- (undocumented)
		`fragment` \- (undocumented)
		Returns:
		(undocumented)
		- #### createUnsafe
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") createUnsafe​(java.lang.String scheme,
		                        [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,
		                        [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                        scala.Option<java.lang.String> queryString,
		                        scala.Option<java.lang.String> fragment)
		```
		
		'Unsafe' in the sense that queryString validation must already have been done.
		 
		
		Parameters:
		`queryString` \- percent\-encoded query string that must be guaranteed
		 not to contain invalid percent\-encodings or characters not allowed by
		 the RFC.
		`scheme` \- (undocumented)
		`authority` \- (undocumented)
		`path` \- (undocumented)
		`fragment` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri$.html)*