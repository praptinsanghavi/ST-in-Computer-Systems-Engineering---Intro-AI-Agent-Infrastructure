---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaUri.html
title: JavaUri
---

# JavaUri

## Content

Package [akka.http.impl.model](package-summary.html)
## Class JavaUri

- java.lang.Object
- - [akka.http.javadsl.model.Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")
	- - akka.http.impl.model.JavaUri

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class JavaUri
extends [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.model.JavaUri)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.javadsl.model.[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")
		
		
		`[Uri.ParsingMode](../../javadsl/model/Uri.ParsingMode.html "interface in akka.http.javadsl.model")`

	- ### Field Summary
	
	
		- ### Fields inherited from class akka.http.javadsl.model.[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")
		
		
		`[EMPTY](../../javadsl/model/Uri.html#EMPTY), [RELAXED](../../javadsl/model/Uri.html#RELAXED), [STRICT](../../javadsl/model/Uri.html#STRICT)`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaUri](#%3Cinit%3E(akka.http.scaladsl.model.Uri))​([Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") uri)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[addPathSegment](#addPathSegment(java.lang.String))​(java.lang.String segment)` | Returns a copy of this instance with a path segment added at the end. |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[asScala](#asScala())()` | Returns the Scala DSL representation of this Uri. |
	| `java.util.Optional<java.lang.String>` | `[fragment](#fragment())()` | Returns the fragment part of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[fragment](#fragment(java.lang.String))​(java.lang.String fragment)` | Returns a copy of this instance with a new fragment. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[fragment](#fragment(java.util.Optional))​(java.util.Optional<java.lang.String> fragment)` | Returns a copy of this instance with a new optional fragment. |
	| `[Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model")` | `[getHost](#getHost())()` | Returns the host of this instance |
	| `java.lang.String` | `[getPathString](#getPathString())()` | Returns the path of this instance |
	| `int` | `[getPort](#getPort())()` | Returns the port of this instance |
	| `java.lang.String` | `[getScheme](#getScheme())()` | Returns the scheme of this instance |
	| `java.lang.String` | `[getUserInfo](#getUserInfo())()` | Returns the user info of this instance |
	| `[Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model")` | `[host](#host())()` | Returns the Host of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[host](#host(akka.http.javadsl.model.Host))​([Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model") host)` | Returns a copy of this instance with a new Host. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[host](#host(java.lang.String))​(java.lang.String host)` | Returns a copy of this instance with a new host. |
	| `boolean` | `[isAbsolute](#isAbsolute())()` | Returns if this is an absolute Uri. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Returns if this is an empty Uri. |
	| `boolean` | `[isRelative](#isRelative())()` | Returns if this is a relative Uri. |
	| `java.lang.String` | `[path](#path())()` | Returns a String representation of the path of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[path](#path(java.lang.String))​(java.lang.String path)` | Returns a copy of this instance with a new path. |
	| `java.lang.Iterable<java.lang.String>` | `[pathSegments](#pathSegments())()` | Returns the path segments of this Uri as an Iterable. |
	| `int` | `[port](#port())()` | Returns the port of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[port](#port(int))​(int port)` | Returns a copy of this instance with a new port. |
	| `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")` | `[query](#query())()` | Returns the parsed Query instance of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[query](#query(akka.http.javadsl.model.Query))​([Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model") query)` | Returns a copy of this instance with a new query. |
	| `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")` | `[query](#query(java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(java.nio.charset.Charset charset,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Returns the parsed Query instance of this Uri using the given charset and parsing mode. |
	| `java.util.Optional<java.lang.String>` | `[queryString](#queryString(java.nio.charset.Charset))​(java.nio.charset.Charset charset)` | Returns a decoded String representation of the query of this Uri. |
	| `java.util.Optional<java.lang.String>` | `[rawQueryString](#rawQueryString())()` | Returns an undecoded String representation of the query of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[rawQueryString](#rawQueryString(java.lang.String))​(java.lang.String rawQuery)` | Returns a copy of this instance with a new query. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[rawQueryString](#rawQueryString(java.lang.String,boolean))​(java.lang.String rawQuery,  boolean strict)` | Returns a copy of this instance with a new query. |
	| `java.lang.String` | `[scheme](#scheme())()` | Returns the scheme of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[scheme](#scheme(java.lang.String))​(java.lang.String scheme)` | Returns a copy of this instance with a new scheme. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[t](#t(scala.Function1))​(scala.Function1<[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")> f)` |  |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[toRelative](#toRelative())()` | Returns a copy of this instance that is relative. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[uri](#uri())()` |  |
	| `java.lang.String` | `[userInfo](#userInfo())()` | Returns the user\-info of this Uri. |
	| `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[userInfo](#userInfo(java.lang.String))​(java.lang.String userInfo)` | Returns a copy of this instance with new user\-info. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/Uri.html#create(akka.http.scaladsl.model.Uri)), [create](../../javadsl/model/Uri.html#create(java.lang.String)), [create](../../javadsl/model/Uri.html#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode)), [create](../../javadsl/model/Uri.html#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### JavaUri
		
		
		
		```
		public JavaUri​([Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") uri)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### uri
		
		
		
		```
		public [Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") uri()
		```
		- #### isRelative
		
		
		
		```
		public boolean isRelative()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#isRelative())`
		Returns if this is a relative Uri.
		
		Specified by:
		`[isRelative](../../javadsl/model/Uri.html#isRelative())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### isAbsolute
		
		
		
		```
		public boolean isAbsolute()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#isAbsolute())`
		Returns if this is an absolute Uri.
		
		Specified by:
		`[isAbsolute](../../javadsl/model/Uri.html#isAbsolute())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#isEmpty())`
		Returns if this is an empty Uri.
		
		Specified by:
		`[isEmpty](../../javadsl/model/Uri.html#isEmpty())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### scheme
		
		
		
		```
		public java.lang.String scheme()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#scheme())`
		Returns the scheme of this Uri.
		
		Specified by:
		`[scheme](../../javadsl/model/Uri.html#scheme())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### host
		
		
		
		```
		public [Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model") host()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#host())`
		Returns the Host of this Uri.
		
		Specified by:
		`[host](../../javadsl/model/Uri.html#host())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### port
		
		
		
		```
		public int port()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#port())`
		Returns the port of this Uri.
		
		Specified by:
		`[port](../../javadsl/model/Uri.html#port())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### userInfo
		
		
		
		```
		public java.lang.String userInfo()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#userInfo())`
		Returns the user\-info of this Uri.
		
		Specified by:
		`[userInfo](../../javadsl/model/Uri.html#userInfo())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### path
		
		
		
		```
		public java.lang.String path()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#path())`
		Returns a String representation of the path of this Uri.
		
		Specified by:
		`[path](../../javadsl/model/Uri.html#path())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### getScheme
		
		
		
		```
		public java.lang.String getScheme()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#getScheme())`
		Returns the scheme of this instance
		
		Specified by:
		`[getScheme](../../javadsl/model/Uri.html#getScheme())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### getHost
		
		
		
		```
		public [Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model") getHost()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#getHost())`
		Returns the host of this instance
		
		Specified by:
		`[getHost](../../javadsl/model/Uri.html#getHost())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#getPort())`
		Returns the port of this instance
		
		Specified by:
		`[getPort](../../javadsl/model/Uri.html#getPort())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### getUserInfo
		
		
		
		```
		public java.lang.String getUserInfo()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#getUserInfo())`
		Returns the user info of this instance
		
		Specified by:
		`[getUserInfo](../../javadsl/model/Uri.html#getUserInfo())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### getPathString
		
		
		
		```
		public java.lang.String getPathString()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#getPathString())`
		Returns the path of this instance
		
		Specified by:
		`[getPathString](../../javadsl/model/Uri.html#getPathString())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### asScala
		
		
		
		```
		public [Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") asScala()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#asScala())`
		Returns the Scala DSL representation of this Uri.
		
		Specified by:
		`[asScala](../../javadsl/model/Uri.html#asScala())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### pathSegments
		
		
		
		```
		public java.lang.Iterable<java.lang.String> pathSegments()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#pathSegments())`
		Returns the path segments of this Uri as an Iterable.
		
		Specified by:
		`[pathSegments](../../javadsl/model/Uri.html#pathSegments())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### rawQueryString
		
		
		
		```
		public java.util.Optional<java.lang.String> rawQueryString()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#rawQueryString())`
		Returns an undecoded String representation of the query of this Uri.
		
		Specified by:
		`[rawQueryString](../../javadsl/model/Uri.html#rawQueryString())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### queryString
		
		
		
		```
		public java.util.Optional<java.lang.String> queryString​(java.nio.charset.Charset charset)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#queryString(java.nio.charset.Charset))`
		Returns a decoded String representation of the query of this Uri.
		
		Specified by:
		`[queryString](../../javadsl/model/Uri.html#queryString(java.nio.charset.Charset))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### query
		
		
		
		```
		public [Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model") query()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#query())`
		Returns the parsed Query instance of this Uri.
		
		Specified by:
		`[query](../../javadsl/model/Uri.html#query())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### query
		
		
		
		```
		public [Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model") query​(java.nio.charset.Charset charset,
		                   [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#query(java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))`
		Returns the parsed Query instance of this Uri using the given charset and parsing mode.
		
		Specified by:
		`[query](../../javadsl/model/Uri.html#query(java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### fragment
		
		
		
		```
		public java.util.Optional<java.lang.String> fragment()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#fragment())`
		Returns the fragment part of this Uri.
		
		Specified by:
		`[fragment](../../javadsl/model/Uri.html#fragment())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### t
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") t​(scala.Function1<[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​[Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")> f)
		```
		- #### scheme
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") scheme​(java.lang.String scheme)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#scheme(java.lang.String))`
		Returns a copy of this instance with a new scheme.
		
		Specified by:
		`[scheme](../../javadsl/model/Uri.html#scheme(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### host
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") host​([Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model") host)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#host(akka.http.javadsl.model.Host))`
		Returns a copy of this instance with a new Host.
		
		Specified by:
		`[host](../../javadsl/model/Uri.html#host(akka.http.javadsl.model.Host))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### host
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") host​(java.lang.String host)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#host(java.lang.String))`
		Returns a copy of this instance with a new host.
		
		Specified by:
		`[host](../../javadsl/model/Uri.html#host(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### port
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") port​(int port)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#port(int))`
		Returns a copy of this instance with a new port.
		
		Specified by:
		`[port](../../javadsl/model/Uri.html#port(int))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### userInfo
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") userInfo​(java.lang.String userInfo)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#userInfo(java.lang.String))`
		Returns a copy of this instance with new user\-info.
		
		Specified by:
		`[userInfo](../../javadsl/model/Uri.html#userInfo(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### path
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") path​(java.lang.String path)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#path(java.lang.String))`
		Returns a copy of this instance with a new path.
		
		Specified by:
		`[path](../../javadsl/model/Uri.html#path(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### toRelative
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") toRelative()
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#toRelative())`
		Returns a copy of this instance that is relative.
		
		Specified by:
		`[toRelative](../../javadsl/model/Uri.html#toRelative())` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### rawQueryString
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") rawQueryString​(java.lang.String rawQuery)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#rawQueryString(java.lang.String))`
		Returns a copy of this instance with a new query.
		
		 Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
		 and depending on how the query string is parsed this might be relevant: for example, when interpreting
		 the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
		 key or value.
		
		 When characters are encountered that are outside of the RFC3986 range they are automatically
		 percent\-encoded, but be aware that relying on this is usually a programming error.
		
		Specified by:
		`[rawQueryString](../../javadsl/model/Uri.html#rawQueryString(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### rawQueryString
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") rawQueryString​(java.lang.String rawQuery,
		                          boolean strict)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#rawQueryString(java.lang.String,boolean))`
		Returns a copy of this instance with a new query.
		
		 Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
		 and depending on how the query string is parsed this might be relevant: for example, when interpreting
		 the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
		 key or value.
		
		Specified by:
		`[rawQueryString](../../javadsl/model/Uri.html#rawQueryString(java.lang.String,boolean))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		`strict` \- depending on the 'strict' flag, characters outside of the range allowed by RFC3986 will
		 either cause a \`IllegalUriException\` or be automatically percent\-encoded. Be aware that relying
		 on automatic percent\-encoding is usually a programming error.
		- #### query
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") query​([Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model") query)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#query(akka.http.javadsl.model.Query))`
		Returns a copy of this instance with a new query.
		
		Specified by:
		`[query](../../javadsl/model/Uri.html#query(akka.http.javadsl.model.Query))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### addPathSegment
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") addPathSegment​(java.lang.String segment)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#addPathSegment(java.lang.String))`
		Returns a copy of this instance with a path segment added at the end.
		
		Specified by:
		`[addPathSegment](../../javadsl/model/Uri.html#addPathSegment(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### fragment
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") fragment​(java.util.Optional<java.lang.String> fragment)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#fragment(java.util.Optional))`
		Returns a copy of this instance with a new optional fragment.
		
		Specified by:
		`[fragment](../../javadsl/model/Uri.html#fragment(java.util.Optional))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### fragment
		
		
		
		```
		public [Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model") fragment​(java.lang.String fragment)
		```
		
		Description copied from class: `[Uri](../../javadsl/model/Uri.html#fragment(java.lang.String))`
		Returns a copy of this instance with a new fragment.
		
		Specified by:
		`[fragment](../../javadsl/model/Uri.html#fragment(java.lang.String))` in class `[Uri](../../javadsl/model/Uri.html "class in akka.http.javadsl.model")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaUri.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaUri.html)*