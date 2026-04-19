---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
title: ContentTypeResolver$
---

# ContentTypeResolver$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class ContentTypeResolver$

- java.lang.Object
- - akka.http.scaladsl.server.directives.ContentTypeResolver$

- ---

```
public class ContentTypeResolver$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ContentTypeResolver$](ContentTypeResolver$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentTypeResolver$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives")` | `[apply](#apply(scala.Function1))​(scala.Function1<java.lang.String,​[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")> f)` |  |
	| `[ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives")` | `[Default](#Default())()` | The default way of resolving a filename to a ContentType is by looking up the file extension in the  registry of all defined media\-types. |
	| `[ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives")` | `[withDefaultCharset](#withDefaultCharset(akka.http.scaladsl.model.HttpCharset))​([HttpCharset](../../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ContentTypeResolver$](ContentTypeResolver$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ContentTypeResolver$
		
		
		
		```
		public ContentTypeResolver$()
		```

	- ### Method Detail
	
	
	
		- #### Default
		
		
		
		```
		public [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives") Default()
		```
		
		The default way of resolving a filename to a ContentType is by looking up the file extension in the
		 registry of all defined media\-types. By default all non\-binary file content is assumed to be UTF\-8 encoded.
		
		Returns:
		(undocumented)
		- #### withDefaultCharset
		
		
		
		```
		public [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives") withDefaultCharset​([HttpCharset](../../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		- #### apply
		
		
		
		```
		public [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives") apply​(scala.Function1<java.lang.String,​[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html)*