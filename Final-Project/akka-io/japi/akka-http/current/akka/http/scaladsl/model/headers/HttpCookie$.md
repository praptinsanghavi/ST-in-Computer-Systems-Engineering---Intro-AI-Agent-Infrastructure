---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie$.html
title: HttpCookie$
---

# HttpCookie$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpCookie$

- java.lang.Object
- - akka.http.scaladsl.model.headers.HttpCookie$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class HttpCookie$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpCookie$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpCookie$](HttpCookie$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookie$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​(java.lang.String name,  java.lang.String value,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | You are encouraged to provide only 'name' and 'value' here, and use  'withXxx' methods to populate other fields. |
	| `akka.parboiled2.CharPredicate` | `[domainChars](#domainChars())()` |  |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[fromPair](#fromPair(akka.http.scaladsl.model.headers.HttpCookiePair,scala.Option,scala.Option,scala.Option,scala.Option,boolean,boolean,scala.Option))​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") pair,  scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")> expires,  scala.Option<java.lang.Object> maxAge,  scala.Option<java.lang.String> domain,  scala.Option<java.lang.String> path,  boolean secure,  boolean httpOnly,  scala.Option<java.lang.String> extension)` | Deprecated. Use HttpCookiePair.toCookie and withXxx methods instead. |
	| `akka.parboiled2.CharPredicate` | `[nameChars](#nameChars())()` |  |
	| `akka.parboiled2.CharPredicate` | `[pathOrExtChars](#pathOrExtChars())()` |  |
	| `akka.parboiled2.CharPredicate` | `[rawValueChars](#rawValueChars())()` |  |
	| `scala.Option<scala.Tuple9<java.lang.String,​java.lang.String,​scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.String>>>` | `[unapply](#unapply(akka.http.scaladsl.model.headers.HttpCookie))​([HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") cookie)` | Deprecated. Pattern matching on HttpCookie is deprecated because of the big number of fields and potential future compatibility hazards. |
	| `akka.parboiled2.CharPredicate` | `[valueChars](#valueChars())()` | http://tools.ietf.org/html/rfc6265\#section\-4\.1\.1  US\-ASCII characters excluding CTLs, whitespace DQUOTE, comma, semicolon, and backslash |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpCookie$](HttpCookie$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpCookie$
		
		
		
		```
		public HttpCookie$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
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
		public scala.Option<scala.Tuple9<java.lang.String,​java.lang.String,​scala.Option<[DateTime](../DateTime.html "class in akka.http.scaladsl.model")>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.String>>> unapply​([HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") cookie)
		```
		
		Deprecated.
		Pattern matching on HttpCookie is deprecated because of the big number of fields and potential future compatibility hazards. Please use other means to check the fields. Since 10\.2\.0\.
		- #### fromPair
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") fromPair​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") pair,
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
		public akka.parboiled2.CharPredicate nameChars()
		```
		- #### valueChars
		
		
		
		```
		public akka.parboiled2.CharPredicate valueChars()
		```
		
		http://tools.ietf.org/html/rfc6265\#section\-4\.1\.1
		 US\-ASCII characters excluding CTLs, whitespace DQUOTE, comma, semicolon, and backslash
		
		Returns:
		(undocumented)
		- #### rawValueChars
		
		
		
		```
		public akka.parboiled2.CharPredicate rawValueChars()
		```
		- #### domainChars
		
		
		
		```
		public akka.parboiled2.CharPredicate domainChars()
		```
		- #### pathOrExtChars
		
		
		
		```
		public akka.parboiled2.CharPredicate pathOrExtChars()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie$.html)*