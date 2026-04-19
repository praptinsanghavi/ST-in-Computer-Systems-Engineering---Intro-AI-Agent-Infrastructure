---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
title: ContentTypeResolver
---

# ContentTypeResolver

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Interface ContentTypeResolver

- All Known Subinterfaces:
`[ContentTypeResolver](../../../scaladsl/server/directives/ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives")`

Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

---

```
@FunctionalInterface
public interface ContentTypeResolver
```

Implement this interface to provide a custom mapping from a file name to a \[\[akka.http.javadsl.model.ContentType]].

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Default Methods](javascript:show(16);) 
	| Modifier and Type | Method | Description |
	| `default [ContentTypeResolver](../../../scaladsl/server/directives/ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives")` | `[asScala](#asScala())()` | Returns a Scala DSL representation of this content type resolver |
	| `[ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model")` | `[resolve](#resolve(java.lang.String))​(java.lang.String fileName)` |  |

- - ### Method Detail
	
	
	
		- #### resolve
		
		
		
		```
		[ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") resolve​(java.lang.String fileName)
		```
		- #### asScala
		
		
		
		```
		default [ContentTypeResolver](../../../scaladsl/server/directives/ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives") asScala()
		```
		
		Returns a Scala DSL representation of this content type resolver

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html)*