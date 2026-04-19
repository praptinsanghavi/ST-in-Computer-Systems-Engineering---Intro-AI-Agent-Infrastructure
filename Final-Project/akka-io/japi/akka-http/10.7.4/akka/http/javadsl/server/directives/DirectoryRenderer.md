---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
title: DirectoryRenderer
---

# DirectoryRenderer

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Interface DirectoryRenderer

- All Known Subinterfaces:
`[FileAndResourceDirectives.DirectoryRenderer](../../../scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer.html "interface in akka.http.scaladsl.server.directives")`

---

```
public interface DirectoryRenderer
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<[DirectoryListing](DirectoryListing.html "class in akka.http.javadsl.server.directives"),​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[directoryMarshaller](#directoryMarshaller(boolean))​(boolean renderVanityFooter)` |  |

- - ### Method Detail
	
	
	
		- #### directoryMarshaller
		
		
		
		```
		[Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<[DirectoryListing](DirectoryListing.html "class in akka.http.javadsl.server.directives"),​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> directoryMarshaller​(boolean renderVanityFooter)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html)*