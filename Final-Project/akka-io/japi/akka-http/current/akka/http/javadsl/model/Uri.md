---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
title: Uri
---

# Uri

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class Uri

- java.lang.Object
- - akka.http.javadsl.model.Uri

- Direct Known Subclasses:
`[JavaUri](../../impl/model/JavaUri.html "class in akka.http.impl.model")`

---

```
public abstract class Uri
extends java.lang.Object
```

Represents an Uri. Use methods on the class to create modified copies of a given instance.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.javadsl.model")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Uri](Uri.html "class in akka.http.javadsl.model")` | `[EMPTY](#EMPTY)` | Creates a default Uri to be modified using the modification methods. |
	| `static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[RELAXED](#RELAXED)` |  |
	| `static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[STRICT](#STRICT)` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Uri](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[addPathSegment](#addPathSegment(java.lang.String))​(java.lang.String segment)` | Returns a copy of this instance with a path segment added at the end. |
	| `abstract [Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[asScala](#asScala())()` | Returns the Scala DSL representation of this Uri. |
	| `static [Uri](Uri.html "class in akka.http.javadsl.model")` | `[create](#create(akka.http.scaladsl.model.Uri))​([Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") uri)` | Returns the Java DSL representation of a Scala DSL Uri. |
	| `static [Uri](Uri.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String))​(java.lang.String uri)` | Returns a Uri created by parsing the given string representation. |
	| `static [Uri](Uri.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String uri,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Returns a Uri created by parsing the given string representation with the provided parsing mode. |
	| `static [Uri](Uri.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String uri,  java.nio.charset.Charset charset,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Returns a Uri created by parsing the given string representation with the provided charset and parsing mode. |
	| `abstract java.util.Optional<java.lang.String>` | `[fragment](#fragment())()` | Returns the fragment part of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[fragment](#fragment(java.lang.String))​(java.lang.String fragment)` | Returns a copy of this instance with a new fragment. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[fragment](#fragment(java.util.Optional))​(java.util.Optional<java.lang.String> fragment)` | Returns a copy of this instance with a new optional fragment. |
	| `abstract [Host](Host.html "class in akka.http.javadsl.model")` | `[getHost](#getHost())()` | Returns the host of this instance |
	| `abstract java.lang.String` | `[getPathString](#getPathString())()` | Returns the path of this instance |
	| `abstract int` | `[getPort](#getPort())()` | Returns the port of this instance |
	| `abstract java.lang.String` | `[getScheme](#getScheme())()` | Returns the scheme of this instance |
	| `abstract java.lang.String` | `[getUserInfo](#getUserInfo())()` | Returns the user info of this instance |
	| `abstract [Host](Host.html "class in akka.http.javadsl.model")` | `[host](#host())()` | Returns the Host of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[host](#host(akka.http.javadsl.model.Host))​([Host](Host.html "class in akka.http.javadsl.model") host)` | Returns a copy of this instance with a new Host. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[host](#host(java.lang.String))​(java.lang.String host)` | Returns a copy of this instance with a new host. |
	| `abstract boolean` | `[isAbsolute](#isAbsolute())()` | Returns if this is an absolute Uri. |
	| `abstract boolean` | `[isEmpty](#isEmpty())()` | Returns if this is an empty Uri. |
	| `abstract boolean` | `[isRelative](#isRelative())()` | Returns if this is a relative Uri. |
	| `abstract java.lang.String` | `[path](#path())()` | Returns a String representation of the path of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[path](#path(java.lang.String))​(java.lang.String path)` | Returns a copy of this instance with a new path. |
	| `abstract java.lang.Iterable<java.lang.String>` | `[pathSegments](#pathSegments())()` | Returns the path segments of this Uri as an Iterable. |
	| `abstract int` | `[port](#port())()` | Returns the port of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[port](#port(int))​(int port)` | Returns a copy of this instance with a new port. |
	| `abstract [Query](Query.html "class in akka.http.javadsl.model")` | `[query](#query())()` | Returns the parsed Query instance of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[query](#query(akka.http.javadsl.model.Query))​([Query](Query.html "class in akka.http.javadsl.model") query)` | Returns a copy of this instance with a new query. |
	| `abstract [Query](Query.html "class in akka.http.javadsl.model")` | `[query](#query(java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(java.nio.charset.Charset charset,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` | Returns the parsed Query instance of this Uri using the given charset and parsing mode. |
	| `abstract java.util.Optional<java.lang.String>` | `[queryString](#queryString(java.nio.charset.Charset))​(java.nio.charset.Charset charset)` | Returns a decoded String representation of the query of this Uri. |
	| `abstract java.util.Optional<java.lang.String>` | `[rawQueryString](#rawQueryString())()` | Returns an undecoded String representation of the query of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[rawQueryString](#rawQueryString(java.lang.String))​(java.lang.String rawQuery)` | Returns a copy of this instance with a new query. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[rawQueryString](#rawQueryString(java.lang.String,boolean))​(java.lang.String rawQuery,  boolean strict)` | Returns a copy of this instance with a new query. |
	| `abstract java.lang.String` | `[scheme](#scheme())()` | Returns the scheme of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[scheme](#scheme(java.lang.String))​(java.lang.String scheme)` | Returns a copy of this instance with a new scheme. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[toRelative](#toRelative())()` | Returns a copy of this instance that is relative. |
	| `abstract java.lang.String` | `[userInfo](#userInfo())()` | Returns the user\-info of this Uri. |
	| `abstract [Uri](Uri.html "class in akka.http.javadsl.model")` | `[userInfo](#userInfo(java.lang.String))​(java.lang.String userInfo)` | Returns a copy of this instance with new user\-info. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### STRICT
		
		
		
		```
		public static final [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") STRICT
		```
		- #### RELAXED
		
		
		
		```
		public static final [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") RELAXED
		```
		- #### EMPTY
		
		
		
		```
		public static final [Uri](Uri.html "class in akka.http.javadsl.model") EMPTY
		```
		
		Creates a default Uri to be modified using the modification methods.

	- ### Constructor Detail
	
	
	
		- #### Uri
		
		
		
		```
		public Uri()
		```

	- ### Method Detail
	
	
	
		- #### isAbsolute
		
		
		
		```
		public abstract boolean isAbsolute()
		```
		
		Returns if this is an absolute Uri.
		- #### isRelative
		
		
		
		```
		public abstract boolean isRelative()
		```
		
		Returns if this is a relative Uri.
		- #### isEmpty
		
		
		
		```
		public abstract boolean isEmpty()
		```
		
		Returns if this is an empty Uri.
		- #### scheme
		
		
		
		```
		public abstract java.lang.String scheme()
		```
		
		Returns the scheme of this Uri.
		- #### host
		
		
		
		```
		public abstract [Host](Host.html "class in akka.http.javadsl.model") host()
		```
		
		Returns the Host of this Uri.
		- #### port
		
		
		
		```
		public abstract int port()
		```
		
		Returns the port of this Uri.
		- #### userInfo
		
		
		
		```
		public abstract java.lang.String userInfo()
		```
		
		Returns the user\-info of this Uri.
		- #### path
		
		
		
		```
		public abstract java.lang.String path()
		```
		
		Returns a String representation of the path of this Uri.
		- #### pathSegments
		
		
		
		```
		public abstract java.lang.Iterable<java.lang.String> pathSegments()
		```
		
		Returns the path segments of this Uri as an Iterable.
		- #### queryString
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> queryString​(java.nio.charset.Charset charset)
		```
		
		Returns a decoded String representation of the query of this Uri.
		- #### rawQueryString
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> rawQueryString()
		```
		
		Returns an undecoded String representation of the query of this Uri.
		- #### query
		
		
		
		```
		public abstract [Query](Query.html "class in akka.http.javadsl.model") query()
		```
		
		Returns the parsed Query instance of this Uri.
		- #### query
		
		
		
		```
		public abstract [Query](Query.html "class in akka.http.javadsl.model") query​(java.nio.charset.Charset charset,
		                            [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		
		Returns the parsed Query instance of this Uri using the given charset and parsing mode.
		- #### fragment
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> fragment()
		```
		
		Returns the fragment part of this Uri.
		- #### scheme
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") scheme​(java.lang.String scheme)
		```
		
		Returns a copy of this instance with a new scheme.
		- #### host
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") host​([Host](Host.html "class in akka.http.javadsl.model") host)
		```
		
		Returns a copy of this instance with a new Host.
		- #### host
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") host​(java.lang.String host)
		```
		
		Returns a copy of this instance with a new host.
		- #### port
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") port​(int port)
		```
		
		Returns a copy of this instance with a new port.
		- #### userInfo
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") userInfo​(java.lang.String userInfo)
		```
		
		Returns a copy of this instance with new user\-info.
		- #### path
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") path​(java.lang.String path)
		```
		
		Returns a copy of this instance with a new path.
		- #### addPathSegment
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") addPathSegment​(java.lang.String segment)
		```
		
		Returns a copy of this instance with a path segment added at the end.
		- #### rawQueryString
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") rawQueryString​(java.lang.String rawQuery)
		```
		
		Returns a copy of this instance with a new query.
		
		 Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
		 and depending on how the query string is parsed this might be relevant: for example, when interpreting
		 the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
		 key or value.
		
		 When characters are encountered that are outside of the RFC3986 range they are automatically
		 percent\-encoded, but be aware that relying on this is usually a programming error.
		- #### rawQueryString
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") rawQueryString​(java.lang.String rawQuery,
		                                   boolean strict)
		```
		
		Returns a copy of this instance with a new query.
		
		 Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
		 and depending on how the query string is parsed this might be relevant: for example, when interpreting
		 the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
		 key or value.
		
		Parameters:
		`strict` \- depending on the 'strict' flag, characters outside of the range allowed by RFC3986 will
		 either cause a \`IllegalUriException\` or be automatically percent\-encoded. Be aware that relying
		 on automatic percent\-encoding is usually a programming error.
		- #### query
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") query​([Query](Query.html "class in akka.http.javadsl.model") query)
		```
		
		Returns a copy of this instance with a new query.
		- #### toRelative
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") toRelative()
		```
		
		Returns a copy of this instance that is relative.
		- #### fragment
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") fragment​(java.lang.String fragment)
		```
		
		Returns a copy of this instance with a new fragment.
		- #### fragment
		
		
		
		```
		public abstract [Uri](Uri.html "class in akka.http.javadsl.model") fragment​(java.util.Optional<java.lang.String> fragment)
		```
		
		Returns a copy of this instance with a new optional fragment.
		- #### getScheme
		
		
		
		```
		public abstract java.lang.String getScheme()
		```
		
		Returns the scheme of this instance
		- #### getHost
		
		
		
		```
		public abstract [Host](Host.html "class in akka.http.javadsl.model") getHost()
		```
		
		Returns the host of this instance
		- #### getPort
		
		
		
		```
		public abstract int getPort()
		```
		
		Returns the port of this instance
		- #### getUserInfo
		
		
		
		```
		public abstract java.lang.String getUserInfo()
		```
		
		Returns the user info of this instance
		- #### getPathString
		
		
		
		```
		public abstract java.lang.String getPathString()
		```
		
		Returns the path of this instance
		- #### asScala
		
		
		
		```
		public abstract [Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") asScala()
		```
		
		Returns the Scala DSL representation of this Uri.
		- #### create
		
		
		
		```
		public static [Uri](Uri.html "class in akka.http.javadsl.model") create​(java.lang.String uri)
		```
		
		Returns a Uri created by parsing the given string representation.
		- #### create
		
		
		
		```
		public static [Uri](Uri.html "class in akka.http.javadsl.model") create​([Uri](../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") uri)
		```
		
		Returns the Java DSL representation of a Scala DSL Uri.
		- #### create
		
		
		
		```
		public static [Uri](Uri.html "class in akka.http.javadsl.model") create​(java.lang.String uri,
		                         [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Returns a Uri created by parsing the given string representation with the provided parsing mode.
		- #### create
		
		
		
		```
		public static [Uri](Uri.html "class in akka.http.javadsl.model") create​(java.lang.String uri,
		                         java.nio.charset.Charset charset,
		                         [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Returns a Uri created by parsing the given string representation with the provided charset and parsing mode.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaUri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html)*