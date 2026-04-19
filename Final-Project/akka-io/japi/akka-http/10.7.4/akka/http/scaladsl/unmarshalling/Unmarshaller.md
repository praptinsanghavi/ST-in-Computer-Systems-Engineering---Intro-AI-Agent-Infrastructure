---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
title: Unmarshaller
---

# Unmarshaller

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface Unmarshaller\<A,​B\>

- ---

```
public interface Unmarshaller<A,​B>
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[Unmarshaller.EitherUnmarshallingException](Unmarshaller.EitherUnmarshallingException.html "class in akka.http.scaladsl.unmarshalling")` | Order of parameters (\`right\` first, \`left\` second) is intentional, since that's the order we evaluate them in. |
	| `static class` | `[Unmarshaller.EitherUnmarshallingException$](Unmarshaller.EitherUnmarshallingException$.html "class in akka.http.scaladsl.unmarshalling")` |  |
	| `static class` | `[Unmarshaller.EnhancedFromEntityUnmarshaller](Unmarshaller.EnhancedFromEntityUnmarshaller.html "class in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.EnhancedFromEntityUnmarshaller.html "type parameter in Unmarshaller.EnhancedFromEntityUnmarshaller")>` |  |
	| `static class` | `[Unmarshaller.EnhancedFromEntityUnmarshaller$](Unmarshaller.EnhancedFromEntityUnmarshaller$.html "class in akka.http.scaladsl.unmarshalling")` |  |
	| `static class` | `[Unmarshaller.EnhancedUnmarshaller](Unmarshaller.EnhancedUnmarshaller.html "class in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.EnhancedUnmarshaller.html "type parameter in Unmarshaller.EnhancedUnmarshaller"),​[B](Unmarshaller.EnhancedUnmarshaller.html "type parameter in Unmarshaller.EnhancedUnmarshaller")>` |  |
	| `static class` | `[Unmarshaller.EnhancedUnmarshaller$](Unmarshaller.EnhancedUnmarshaller$.html "class in akka.http.scaladsl.unmarshalling")` |  |
	| `static class` | `[Unmarshaller.NoContentException$](Unmarshaller.NoContentException$.html "class in akka.http.scaladsl.unmarshalling")` | Signals that unmarshalling failed because the entity was unexpectedly empty. |
	| `static class` | `[Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling")` | Signals that unmarshalling failed because the entity content\-type did not match one of the supported ranges. |
	| `static class` | `[Unmarshaller.UnsupportedContentTypeException$](Unmarshaller.UnsupportedContentTypeException$.html "class in akka.http.scaladsl.unmarshalling")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[andThen](#andThen(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> other)` |  |
	| `scala.concurrent.Future<[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[apply](#apply(A,scala.concurrent.ExecutionContext,akka.stream.Materializer))​([A](Unmarshaller.html "type parameter in Unmarshaller") value,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer materializer)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[asScala](#asScala())()` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[flatMap](#flatMap(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<[B](Unmarshaller.html "type parameter in Unmarshaller"),​scala.concurrent.Future<C>>>> f)` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[map](#map(scala.Function1))​(scala.Function1<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> f)` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[recover](#recover(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.PartialFunction<java.lang.Throwable,​C>>> pf)` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[transform](#transform(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<scala.concurrent.Future<[B](Unmarshaller.html "type parameter in Unmarshaller")>,​scala.concurrent.Future<C>>>> f)` |  |
	| `<BB> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​BB>` | `[withDefaultValue](#withDefaultValue(BB))​(BB defaultValue)` |  |

- - ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​[B](Unmarshaller.html "type parameter in Unmarshaller")> asScala()
		```
		- #### apply
		
		
		
		```
		scala.concurrent.Future<[B](Unmarshaller.html "type parameter in Unmarshaller")> apply​([A](Unmarshaller.html "type parameter in Unmarshaller") value,
		                                 scala.concurrent.ExecutionContext ec,
		                                 akka.stream.Materializer materializer)
		```
		- #### transform
		
		
		
		```
		<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> transform​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<scala.concurrent.Future<[B](Unmarshaller.html "type parameter in Unmarshaller")>,​scala.concurrent.Future<C>>>> f)
		```
		- #### map
		
		
		
		```
		<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> map​(scala.Function1<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> f)
		```
		- #### flatMap
		
		
		
		```
		<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> flatMap​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<[B](Unmarshaller.html "type parameter in Unmarshaller"),​scala.concurrent.Future<C>>>> f)
		```
		- #### andThen
		
		
		
		```
		<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> andThen​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> other)
		```
		- #### recover
		
		
		
		```
		<C> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> recover​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.PartialFunction<java.lang.Throwable,​C>>> pf)
		```
		- #### withDefaultValue
		
		
		
		```
		<BB> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​BB> withDefaultValue​(BB defaultValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedFromEntityUnmarshaller$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedFromEntityUnmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedUnmarshaller$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedUnmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.NoContentException$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html)*