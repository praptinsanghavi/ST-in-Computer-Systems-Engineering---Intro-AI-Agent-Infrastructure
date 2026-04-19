---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html
title: HttpCookie
---

# HttpCookie

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpCookie

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpCookie

- Direct Known Subclasses:
`[HttpCookie](../../../scaladsl/model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers")`

---

```
@DoNotInherit
public abstract class HttpCookie
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookie](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.util.Optional,java.util.OptionalLong,java.util.Optional,java.util.Optional,boolean,boolean,java.util.Optional))​(java.lang.String name,  java.lang.String value,  java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> expires,  java.util.OptionalLong maxAge,  java.util.Optional<java.lang.String> domain,  java.util.Optional<java.lang.String> path,  boolean secure,  boolean httpOnly,  java.util.Optional<java.lang.String> extension)` | Deprecated. Since 10\.2\.0\. |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.util.Optional,java.util.OptionalLong,java.util.Optional,java.util.Optional,boolean,boolean,java.util.Optional,java.util.Optional))​(java.lang.String name,  java.lang.String value,  java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> expires,  java.util.OptionalLong maxAge,  java.util.Optional<java.lang.String> domain,  java.util.Optional<java.lang.String> path,  boolean secure,  boolean httpOnly,  java.util.Optional<java.lang.String> extension,  java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)` |  |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.util.Optional,java.util.Optional))​(java.lang.String name,  java.lang.String value,  java.util.Optional<java.lang.String> domain,  java.util.Optional<java.lang.String> path)` |  |
	| `abstract java.util.Optional<java.lang.String>` | `[getDomain](#getDomain())()` |  |
	| `abstract java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")>` | `[getExpires](#getExpires())()` |  |
	| `abstract java.util.Optional<java.lang.String>` | `[getExtension](#getExtension())()` |  |
	| `abstract java.util.OptionalLong` | `[getMaxAge](#getMaxAge())()` |  |
	| `abstract java.util.Optional<java.lang.String>` | `[getPath](#getPath())()` |  |
	| `abstract java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")>` | `[getSameSite](#getSameSite())()` |  |
	| `abstract boolean` | `[httpOnly](#httpOnly())()` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	| `abstract [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")` | `[pair](#pair())()` |  |
	| `abstract boolean` | `[secure](#secure())()` |  |
	| `abstract java.lang.String` | `[value](#value())()` |  |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withDomain](#withDomain(java.lang.String))​(java.lang.String domain)` | Returns a copy of this HttpCookie instance with the given domain set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withExpires](#withExpires(akka.http.javadsl.model.DateTime))​([DateTime](../DateTime.html "class in akka.http.javadsl.model") dateTime)` | Returns a copy of this HttpCookie instance with the given expiration set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withExtension](#withExtension(java.lang.String))​(java.lang.String extension)` | Returns a copy of this HttpCookie instance with the given extension set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withHttpOnly](#withHttpOnly(boolean))​(boolean httpOnly)` | Returns a copy of this HttpCookie instance with the given http\-only flag set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withMaxAge](#withMaxAge(long))​(long maxAge)` | Returns a copy of this HttpCookie instance with the given max age set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withPath](#withPath(java.lang.String))​(java.lang.String path)` | Returns a copy of this HttpCookie instance with the given path set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withSameSite](#withSameSite(akka.http.javadsl.model.headers.SameSite))​([SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") sameSite)` | Returns a copy of this HttpCookie instance with the given [`SameSite`](SameSite.html "enum in akka.http.javadsl.model.headers") set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withSameSite](#withSameSite(java.util.Optional))​(java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)` | Returns a copy of this HttpCookie instance with the given Optional [`SameSite`](SameSite.html "enum in akka.http.javadsl.model.headers") set. |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[withSecure](#withSecure(boolean))​(boolean secure)` | Returns a copy of this HttpCookie instance with the given secure flag set. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCookie
		
		
		
		```
		public HttpCookie()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		- #### pair
		
		
		
		```
		public abstract [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers") pair()
		```
		- #### getExpires
		
		
		
		```
		public abstract java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> getExpires()
		```
		- #### getMaxAge
		
		
		
		```
		public abstract java.util.OptionalLong getMaxAge()
		```
		- #### getDomain
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getDomain()
		```
		- #### getPath
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getPath()
		```
		- #### secure
		
		
		
		```
		public abstract boolean secure()
		```
		- #### httpOnly
		
		
		
		```
		public abstract boolean httpOnly()
		```
		- #### getExtension
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getExtension()
		```
		- #### getSameSite
		
		
		
		```
		public abstract java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")> getSameSite()
		```
		- #### create
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                                java.lang.String value)
		```
		- #### create
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                                java.lang.String value,
		                                java.util.Optional<java.lang.String> domain,
		                                java.util.Optional<java.lang.String> path)
		```
		- #### create
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                                java.lang.String value,
		                                java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> expires,
		                                java.util.OptionalLong maxAge,
		                                java.util.Optional<java.lang.String> domain,
		                                java.util.Optional<java.lang.String> path,
		                                boolean secure,
		                                boolean httpOnly,
		                                java.util.Optional<java.lang.String> extension)
		```
		
		Deprecated.
		Since 10\.2\.0\. Use [`create(String, String, Optional, OptionalLong, Optional, Optional, boolean, boolean, Optional, Optional)`](#create(java.lang.String,java.lang.String,java.util.Optional,java.util.OptionalLong,java.util.Optional,java.util.Optional,boolean,boolean,java.util.Optional,java.util.Optional)) instead.
		- #### create
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                                java.lang.String value,
		                                java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> expires,
		                                java.util.OptionalLong maxAge,
		                                java.util.Optional<java.lang.String> domain,
		                                java.util.Optional<java.lang.String> path,
		                                boolean secure,
		                                boolean httpOnly,
		                                java.util.Optional<java.lang.String> extension,
		                                java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)
		```
		- #### withExpires
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withExpires​([DateTime](../DateTime.html "class in akka.http.javadsl.model") dateTime)
		```
		
		Returns a copy of this HttpCookie instance with the given expiration set.
		- #### withMaxAge
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withMaxAge​(long maxAge)
		```
		
		Returns a copy of this HttpCookie instance with the given max age set.
		- #### withDomain
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withDomain​(java.lang.String domain)
		```
		
		Returns a copy of this HttpCookie instance with the given domain set.
		- #### withPath
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withPath​(java.lang.String path)
		```
		
		Returns a copy of this HttpCookie instance with the given path set.
		- #### withSecure
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withSecure​(boolean secure)
		```
		
		Returns a copy of this HttpCookie instance with the given secure flag set.
		- #### withHttpOnly
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withHttpOnly​(boolean httpOnly)
		```
		
		Returns a copy of this HttpCookie instance with the given http\-only flag set.
		- #### withSameSite
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withSameSite​([SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") sameSite)
		```
		
		Returns a copy of this HttpCookie instance with the given [`SameSite`](SameSite.html "enum in akka.http.javadsl.model.headers") set.
		- #### withSameSite
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withSameSite​(java.util.Optional<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)
		```
		
		Returns a copy of this HttpCookie instance with the given Optional [`SameSite`](SameSite.html "enum in akka.http.javadsl.model.headers") set.
		- #### withExtension
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") withExtension​(java.lang.String extension)
		```
		
		Returns a copy of this HttpCookie instance with the given extension set.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/SameSite.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html)*