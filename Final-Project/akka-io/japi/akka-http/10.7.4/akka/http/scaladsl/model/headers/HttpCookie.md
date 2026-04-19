---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html
title: HttpCookie
---

# HttpCookie

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpCookie

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpCookie

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpCookie
extends [HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")
implements [ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable, scala.Equals
```

for a full definition of the http cookie header fields, see
 http://tools.ietf.org/html/rfc6265

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpCookie)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookie](#%3Cinit%3E(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | Deprecated. Please use HttpCookie(name, value).withXxx(). |
	| `[HttpCookie](#%3Cinit%3E(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension,  scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | You are encouraged to provide only 'name' and 'value' here, and use  'withXxx' methods to populate other fields. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[copy](#copy(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | Deprecated. for binary compatibility. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[copy](#copy(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension,  scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)` |  |
	| `scala.Option<java.lang.String>` | `[domain](#domain())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[domainChars](#domainChars())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")>` | `[expires](#expires())()` |  |
	| `scala.Option<java.lang.String>` | `[extension](#extension())()` |  |
	| `static [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[fromPair](#fromPair(akka.http.scaladsl.model.headers.HttpCookiePair,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") pair,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | Deprecated. Use HttpCookiePair.toCookie and withXxx methods instead. |
	| `java.util.Optional<java.lang.String>` | `[getDomain](#getDomain())()` | Java API |
	| `java.util.Optional<[DateTime](../../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")>` | `[getExpires](#getExpires())()` | Java API |
	| `java.util.Optional<java.lang.String>` | `[getExtension](#getExtension())()` | Java API |
	| `java.util.OptionalLong` | `[getMaxAge](#getMaxAge())()` | Java API |
	| `java.util.Optional<java.lang.String>` | `[getPath](#getPath())()` | Java API |
	| `java.util.Optional<[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers")>` | `[getSameSite](#getSameSite())()` | Java API |
	| `boolean` | `[httpOnly](#httpOnly())()` |  |
	| `scala.Option<java.lang.Object>` | `[maxAge](#maxAge())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[nameChars](#nameChars())()` |  |
	| `[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[pair](#pair())()` | Returns the name/value pair for this cookie, to be used in [`Cookie`](Cookie.html "class in akka.http.scaladsl.model.headers") headers. |
	| `scala.Option<java.lang.String>` | `[path](#path())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[pathOrExtChars](#pathOrExtChars())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `static akka.parboiled2.CharPredicate` | `[rawValueChars](#rawValueChars())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")>` | `[sameSite](#sameSite())()` |  |
	| `boolean` | `[secure](#secure())()` |  |
	| `static scala.Option<scala.Tuple9<java.lang.String,​java.lang.String,​scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.String>>>` | `[unapply](#unapply(akka.http.scaladsl.model.headers.HttpCookie))​([HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") cookie)` | Deprecated. Pattern matching on HttpCookie is deprecated because of the big number of fields and potential future compatibility hazards. |
	| `java.lang.String` | `[value](#value())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[valueChars](#valueChars())()` | http://tools.ietf.org/html/rfc6265\#section\-4\.1\.1  US\-ASCII characters excluding CTLs, whitespace DQUOTE, comma, semicolon, and backslash |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withDomain](#withDomain(java.lang.String))​(java.lang.String domain)` | Returns a copy of this HttpCookie instance with the given domain set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withExpires](#withExpires(akka.http.javadsl.model.DateTime))​([DateTime](../../../javadsl/model/DateTime.html "class in akka.http.javadsl.model") dateTime)` | Java API |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withExpires](#withExpires(akka.http.scaladsl.model.DateTime))​([DateTime](../DateTime.html "class in akka.http.scaladsl.model") dateTime)` | Scala API |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withExtension](#withExtension(java.lang.String))​(java.lang.String extension)` | Returns a copy of this HttpCookie instance with the given extension set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withHttpOnly](#withHttpOnly(boolean))​(boolean httpOnly)` | Returns a copy of this HttpCookie instance with the given http\-only flag set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withMaxAge](#withMaxAge(long))​(long maxAge)` | Returns a copy of this HttpCookie instance with the given max age set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withName](#withName(java.lang.String))​(java.lang.String name)` |  |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withPath](#withPath(java.lang.String))​(java.lang.String path)` | Returns a copy of this HttpCookie instance with the given path set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withSameSite](#withSameSite(akka.http.javadsl.model.headers.SameSite))​([SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers") sameSite)` | Java API |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withSameSite](#withSameSite(akka.http.scaladsl.model.headers.SameSite))​([SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers") sameSite)` | Scala API |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withSameSite](#withSameSite(java.util.Optional))​(java.util.Optional<[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)` | Returns a copy of this HttpCookie instance with the given Optional [`SameSite`](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers") set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withSameSite](#withSameSite(scala.Option))​(scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)` |  |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withSecure](#withSecure(boolean))​(boolean secure)` | Returns a copy of this HttpCookie instance with the given secure flag set. |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[withValue](#withValue(java.lang.String))​(java.lang.String value)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpCookie.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/headers/HttpCookie.html#create(java.lang.String,java.lang.String,java.util.Optional,java.util.OptionalLong,java.util.Optional,java.util.Optional,boolean,boolean,java.util.Optional)), [create](../../../javadsl/model/headers/HttpCookie.html#create(java.lang.String,java.lang.String,java.util.Optional,java.util.OptionalLong,java.util.Optional,java.util.Optional,boolean,boolean,java.util.Optional,java.util.Optional)), [create](../../../javadsl/model/headers/HttpCookie.html#create(java.lang.String,java.lang.String,java.util.Optional,java.util.Optional))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### HttpCookie
		
		
		
		```
		public HttpCookie​(java.lang.String name,
		                  java.lang.String value,
		                  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                  scala.Option<java.lang.Object> maxAge,
		                  scala.Option<java.lang.String> domain,
		                  scala.Option<java.lang.String> path,
		                  boolean secure,
		                  boolean httpOnly,
		                  scala.Option<java.lang.String> extension,
		                  scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)
		```
		- #### HttpCookie
		
		
		
		```
		public HttpCookie​(java.lang.String name,
		                  java.lang.String value,
		                  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                  scala.Option<java.lang.Object> maxAge,
		                  scala.Option<java.lang.String> domain,
		                  scala.Option<java.lang.String> path,
		                  boolean secure,
		                  boolean httpOnly,
		                  scala.Option<java.lang.String> extension)
		```
		
		Deprecated.
		Please use HttpCookie(name, value).withXxx(). Since 10\.2\.0\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
		                               java.lang.String value,
		                               scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                               scala.Option<java.lang.Object> maxAge,
		                               scala.Option<java.lang.String> domain,
		                               scala.Option<java.lang.String> path,
		                               boolean secure,
		                               boolean httpOnly,
		                               scala.Option<java.lang.String> extension)
		```
		
		You are encouraged to provide only 'name' and 'value' here, and use
		 'withXxx' methods to populate other fields.
		
		Parameters:
		`name` \- (undocumented)
		`value` \- (undocumented)
		`expires` \- (undocumented)
		`maxAge` \- (undocumented)
		`domain` \- (undocumented)
		`path` \- (undocumented)
		`secure` \- (undocumented)
		`httpOnly` \- (undocumented)
		`extension` \- (undocumented)
		Returns:
		(undocumented)
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple9<java.lang.String,​java.lang.String,​scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.String>>> unapply​([HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") cookie)
		```
		
		Deprecated.
		Pattern matching on HttpCookie is deprecated because of the big number of fields and potential future compatibility hazards. Please use other means to check the fields. Since 10\.2\.0\.
		- #### fromPair
		
		
		
		```
		public static [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") fromPair​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") pair,
		                                  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                                  scala.Option<java.lang.Object> maxAge,
		                                  scala.Option<java.lang.String> domain,
		                                  scala.Option<java.lang.String> path,
		                                  boolean secure,
		                                  boolean httpOnly,
		                                  scala.Option<java.lang.String> extension)
		```
		
		Deprecated.
		Use HttpCookiePair.toCookie and withXxx methods instead. Since 10\.2\.0\.
		- #### nameChars
		
		
		
		```
		public static akka.parboiled2.CharPredicate nameChars()
		```
		- #### valueChars
		
		
		
		```
		public static akka.parboiled2.CharPredicate valueChars()
		```
		
		http://tools.ietf.org/html/rfc6265\#section\-4\.1\.1
		 US\-ASCII characters excluding CTLs, whitespace DQUOTE, comma, semicolon, and backslash
		
		Returns:
		(undocumented)
		- #### rawValueChars
		
		
		
		```
		public static akka.parboiled2.CharPredicate rawValueChars()
		```
		- #### domainChars
		
		
		
		```
		public static akka.parboiled2.CharPredicate domainChars()
		```
		- #### pathOrExtChars
		
		
		
		```
		public static akka.parboiled2.CharPredicate pathOrExtChars()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](../../../javadsl/model/headers/HttpCookie.html#name())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		
		Specified by:
		`[value](../../../javadsl/model/headers/HttpCookie.html#value())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### expires
		
		
		
		```
		public scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires()
		```
		- #### maxAge
		
		
		
		```
		public scala.Option<java.lang.Object> maxAge()
		```
		- #### domain
		
		
		
		```
		public scala.Option<java.lang.String> domain()
		```
		- #### path
		
		
		
		```
		public scala.Option<java.lang.String> path()
		```
		- #### secure
		
		
		
		```
		public boolean secure()
		```
		
		
		Specified by:
		`[secure](../../../javadsl/model/headers/HttpCookie.html#secure())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### httpOnly
		
		
		
		```
		public boolean httpOnly()
		```
		
		
		Specified by:
		`[httpOnly](../../../javadsl/model/headers/HttpCookie.html#httpOnly())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### extension
		
		
		
		```
		public scala.Option<java.lang.String> extension()
		```
		- #### sameSite
		
		
		
		```
		public scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite()
		```
		- #### copy
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") copy​(java.lang.String name,
		                       java.lang.String value,
		                       scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                       scala.Option<java.lang.Object> maxAge,
		                       scala.Option<java.lang.String> domain,
		                       scala.Option<java.lang.String> path,
		                       boolean secure,
		                       boolean httpOnly,
		                       scala.Option<java.lang.String> extension)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.2\.0\.
		- #### copy
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") copy​(java.lang.String name,
		                       java.lang.String value,
		                       scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,
		                       scala.Option<java.lang.Object> maxAge,
		                       scala.Option<java.lang.String> domain,
		                       scala.Option<java.lang.String> path,
		                       boolean secure,
		                       boolean httpOnly,
		                       scala.Option<java.lang.String> extension,
		                       scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)
		```
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### pair
		
		
		
		```
		public [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") pair()
		```
		
		Returns the name/value pair for this cookie, to be used in [`Cookie`](Cookie.html "class in akka.http.scaladsl.model.headers") headers.
		
		Specified by:
		`[pair](../../../javadsl/model/headers/HttpCookie.html#pair())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### getSameSite
		
		
		
		```
		public java.util.Optional<[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers")> getSameSite()
		```
		
		Java API
		
		Specified by:
		`[getSameSite](../../../javadsl/model/headers/HttpCookie.html#getSameSite())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### getExtension
		
		
		
		```
		public java.util.Optional<java.lang.String> getExtension()
		```
		
		Java API
		
		Specified by:
		`[getExtension](../../../javadsl/model/headers/HttpCookie.html#getExtension())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### getPath
		
		
		
		```
		public java.util.Optional<java.lang.String> getPath()
		```
		
		Java API
		
		Specified by:
		`[getPath](../../../javadsl/model/headers/HttpCookie.html#getPath())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### getDomain
		
		
		
		```
		public java.util.Optional<java.lang.String> getDomain()
		```
		
		Java API
		
		Specified by:
		`[getDomain](../../../javadsl/model/headers/HttpCookie.html#getDomain())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### getMaxAge
		
		
		
		```
		public java.util.OptionalLong getMaxAge()
		```
		
		Java API
		
		Specified by:
		`[getMaxAge](../../../javadsl/model/headers/HttpCookie.html#getMaxAge())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### getExpires
		
		
		
		```
		public java.util.Optional<[DateTime](../../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")> getExpires()
		```
		
		Java API
		
		Specified by:
		`[getExpires](../../../javadsl/model/headers/HttpCookie.html#getExpires())` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withName
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withName​(java.lang.String name)
		```
		- #### withValue
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withValue​(java.lang.String value)
		```
		- #### withExpires
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withExpires​([DateTime](../DateTime.html "class in akka.http.scaladsl.model") dateTime)
		```
		
		Scala API
		- #### withExpires
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withExpires​([DateTime](../../../javadsl/model/DateTime.html "class in akka.http.javadsl.model") dateTime)
		```
		
		Java API
		
		Specified by:
		`[withExpires](../../../javadsl/model/headers/HttpCookie.html#withExpires(akka.http.javadsl.model.DateTime))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withDomain
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withDomain​(java.lang.String domain)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withDomain(java.lang.String))`
		Returns a copy of this HttpCookie instance with the given domain set.
		
		Specified by:
		`[withDomain](../../../javadsl/model/headers/HttpCookie.html#withDomain(java.lang.String))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withPath
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withPath​(java.lang.String path)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withPath(java.lang.String))`
		Returns a copy of this HttpCookie instance with the given path set.
		
		Specified by:
		`[withPath](../../../javadsl/model/headers/HttpCookie.html#withPath(java.lang.String))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withMaxAge
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withMaxAge​(long maxAge)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withMaxAge(long))`
		Returns a copy of this HttpCookie instance with the given max age set.
		
		Specified by:
		`[withMaxAge](../../../javadsl/model/headers/HttpCookie.html#withMaxAge(long))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withSecure
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withSecure​(boolean secure)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withSecure(boolean))`
		Returns a copy of this HttpCookie instance with the given secure flag set.
		
		Specified by:
		`[withSecure](../../../javadsl/model/headers/HttpCookie.html#withSecure(boolean))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withHttpOnly
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withHttpOnly​(boolean httpOnly)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withHttpOnly(boolean))`
		Returns a copy of this HttpCookie instance with the given http\-only flag set.
		
		Specified by:
		`[withHttpOnly](../../../javadsl/model/headers/HttpCookie.html#withHttpOnly(boolean))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withSameSite
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withSameSite​([SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers") sameSite)
		```
		
		Scala API
		- #### withSameSite
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withSameSite​(scala.Option<[SameSite](SameSite.html "interface in akka.http.scaladsl.model.headers")> sameSite)
		```
		- #### withSameSite
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withSameSite​([SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers") sameSite)
		```
		
		Java API
		
		Specified by:
		`[withSameSite](../../../javadsl/model/headers/HttpCookie.html#withSameSite(akka.http.javadsl.model.headers.SameSite))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withSameSite
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withSameSite​(java.util.Optional<[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers")> sameSite)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withSameSite(java.util.Optional))`
		Returns a copy of this HttpCookie instance with the given Optional [`SameSite`](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers") set.
		
		Specified by:
		`[withSameSite](../../../javadsl/model/headers/HttpCookie.html#withSameSite(java.util.Optional))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`
		- #### withExtension
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") withExtension​(java.lang.String extension)
		```
		
		Description copied from class: `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html#withExtension(java.lang.String))`
		Returns a copy of this HttpCookie instance with the given extension set.
		
		Specified by:
		`[withExtension](../../../javadsl/model/headers/HttpCookie.html#withExtension(java.lang.String))` in class `[HttpCookie](../../../javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/SameSite.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html)*