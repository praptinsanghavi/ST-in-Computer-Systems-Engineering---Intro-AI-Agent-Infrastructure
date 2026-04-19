---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
title: ToResponseMarshallable
---

# ToResponseMarshallable

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface ToResponseMarshallable

- ---

```
public interface ToResponseMarshallable
```

Something that can later be marshalled into a response

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[apply](#apply(akka.http.scaladsl.model.HttpRequest,scala.concurrent.ExecutionContext))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,  scala.concurrent.ExecutionContext ec)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Object,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[marshaller](#marshaller())()` |  |
	| `[ToResponseMarshallable](ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling")` | `[value](#value())()` |  |

- - ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		[ToResponseMarshallable](ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") value()
		```
		- #### marshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Object,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> marshaller()
		```
		- #### apply
		
		
		
		```
		scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> apply​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                                            scala.concurrent.ExecutionContext ec)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html)*