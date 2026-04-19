---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
title: ContentTypeResolver
---

# ContentTypeResolver

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface ContentTypeResolver

- All Superinterfaces:
`[ContentTypeResolver](../../../javadsl/server/directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")`

---

```
public interface ContentTypeResolver
extends [ContentTypeResolver](../../../javadsl/server/directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String))​(java.lang.String fileName)` |  |
	| `[ContentType](../../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model")` | `[resolve](#resolve(java.lang.String))​(java.lang.String fileName)` |  |
	
	
		- ### Methods inherited from interface akka.http.javadsl.server.directives.[ContentTypeResolver](../../../javadsl/server/directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")
		
		
		`[asScala](../../../javadsl/server/directives/ContentTypeResolver.html#asScala())`

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") apply​(java.lang.String fileName)
		```
		- #### resolve
		
		
		
		```
		[ContentType](../../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") resolve​(java.lang.String fileName)
		```
		
		
		Specified by:
		`[resolve](../../../javadsl/server/directives/ContentTypeResolver.html#resolve(java.lang.String))` in interface `[ContentTypeResolver](../../../javadsl/server/directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html)*