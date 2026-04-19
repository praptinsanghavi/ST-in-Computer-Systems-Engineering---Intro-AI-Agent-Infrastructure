---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering$.html
title: UriRendering$
---

# UriRendering$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class UriRendering$

- java.lang.Object
- - akka.http.scaladsl.model.UriRendering$

- ---

```
public class UriRendering$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UriRendering$](UriRendering$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UriRendering$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[encode](#encode(akka.http.impl.util.Rendering,java.lang.String,java.nio.charset.Charset,akka.parboiled2.CharPredicate,boolean))​([Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") r,  java.lang.String string,  java.nio.charset.Charset charset,  akka.parboiled2.CharPredicate keep,  boolean replaceSpaces)` |  |
	| `boolean` | `[isAsciiCompatible](#isAsciiCompatible(java.nio.charset.Charset))​(java.nio.charset.Charset cs)` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderAuthority](#renderAuthority(R,akka.http.scaladsl.model.Uri.Authority,akka.http.scaladsl.model.Uri.Path,java.lang.String,java.nio.charset.Charset))​(R r,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  java.lang.String scheme,  java.nio.charset.Charset charset)` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderAuthority](#renderAuthority(R,akka.http.scaladsl.model.Uri.Authority,java.lang.String,java.nio.charset.Charset))​(R r,  [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,  java.lang.String scheme,  java.nio.charset.Charset charset)` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderPath](#renderPath(R,akka.http.scaladsl.model.Uri.Path,java.nio.charset.Charset,boolean))​(R r,  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,  java.nio.charset.Charset charset,  boolean encodeFirstSegmentColons)` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderQuery](#renderQuery(R,akka.http.scaladsl.model.Uri.Query,java.nio.charset.Charset,akka.parboiled2.CharPredicate))​(R r,  [Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") query,  java.nio.charset.Charset charset,  akka.parboiled2.CharPredicate keep)` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderUri](#renderUri(R,akka.http.scaladsl.model.Uri,java.nio.charset.Charset))​(R r,  [Uri](Uri.html "class in akka.http.scaladsl.model") value,  java.nio.charset.Charset charset)` | Renders this Uri into the given Renderer as defined by http://tools.ietf.org/html/rfc3986\. |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderUriWithoutFragment](#renderUriWithoutFragment(R,akka.http.scaladsl.model.Uri,java.nio.charset.Charset))​(R r,  [Uri](Uri.html "class in akka.http.scaladsl.model") value,  java.nio.charset.Charset charset)` | Renders this Uri (without the fragment component) into the given Renderer as defined by  http://tools.ietf.org/html/rfc3986\. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UriRendering$](UriRendering$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UriRendering$
		
		
		
		```
		public UriRendering$()
		```

	- ### Method Detail
	
	
	
		- #### renderUri
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderUri​(R r,
		                                                 [Uri](Uri.html "class in akka.http.scaladsl.model") value,
		                                                 java.nio.charset.Charset charset)
		```
		
		Renders this Uri into the given Renderer as defined by http://tools.ietf.org/html/rfc3986\.
		 All Uri components are encoded and joined as required by the spec. The given charset is used to
		 produce percent\-encoded representations of potentially existing non\-ASCII characters in the
		 different components.
		
		Parameters:
		`r` \- (undocumented)
		`value` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### renderUriWithoutFragment
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderUriWithoutFragment​(R r,
		                                                                [Uri](Uri.html "class in akka.http.scaladsl.model") value,
		                                                                java.nio.charset.Charset charset)
		```
		
		Renders this Uri (without the fragment component) into the given Renderer as defined by
		 http://tools.ietf.org/html/rfc3986\.
		 All Uri components are encoded and joined as required by the spec. The given charset is used to
		 produce percent\-encoded representations of potentially existing non\-ASCII characters in the
		 different components.
		
		Parameters:
		`r` \- (undocumented)
		`value` \- (undocumented)
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### renderAuthority
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderAuthority​(R r,
		                                                       [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,
		                                                       java.lang.String scheme,
		                                                       java.nio.charset.Charset charset)
		```
		- #### renderAuthority
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderAuthority​(R r,
		                                                       [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") authority,
		                                                       [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                                                       java.lang.String scheme,
		                                                       java.nio.charset.Charset charset)
		```
		- #### renderPath
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderPath​(R r,
		                                                  [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") path,
		                                                  java.nio.charset.Charset charset,
		                                                  boolean encodeFirstSegmentColons)
		```
		- #### renderQuery
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderQuery​(R r,
		                                                   [Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") query,
		                                                   java.nio.charset.Charset charset,
		                                                   akka.parboiled2.CharPredicate keep)
		```
		- #### encode
		
		
		
		```
		public [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") encode​([Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") r,
		                        java.lang.String string,
		                        java.nio.charset.Charset charset,
		                        akka.parboiled2.CharPredicate keep,
		                        boolean replaceSpaces)
		```
		- #### isAsciiCompatible
		
		
		
		```
		public boolean isAsciiCompatible​(java.nio.charset.Charset cs)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering$.html)*