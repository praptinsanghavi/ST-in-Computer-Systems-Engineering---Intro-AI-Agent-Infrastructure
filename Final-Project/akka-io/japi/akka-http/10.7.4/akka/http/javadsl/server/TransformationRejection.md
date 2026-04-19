---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
title: TransformationRejection
---

# TransformationRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface TransformationRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[TransformationRejection](../../scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface TransformationRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

A special Rejection that serves as a container for a transformation function on rejections.
 It is used by some directives to "cancel" rejections that are added by later directives of a similar type.
 
 Consider this route structure for example:
 

 put { reject(ValidationRejection("no") } \~ get { ... }
 

 If this structure is applied to a PUT request the list of rejections coming back contains three elements:
 

 1\. A ValidationRejection
 2\. A MethodRejection
 3\. A TransformationRejection holding a function filtering out the MethodRejection
 

 so that in the end the RejectionHandler will only see one rejection (the ValidationRejection), because the
 MethodRejection added by the `get` directive is canceled by the `put` directive (since the HTTP method
 did indeed match eventually).

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>>` | `[getTransform](#getTransform())()` |  |

- - ### Method Detail
	
	
	
		- #### getTransform
		
		
		
		```
		java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>> getTransform()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html)*