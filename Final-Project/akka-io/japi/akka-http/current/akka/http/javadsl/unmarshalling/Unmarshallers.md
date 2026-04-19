---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshallers.html
title: Unmarshallers
---

# Unmarshallers

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Interface Unmarshallers

- All Known Implementing Classes:
`[Unmarshaller$](Unmarshaller$.html "class in akka.http.javadsl.unmarshalling")`

---

```
public interface Unmarshallers
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[async](#async(java.util.function.Function))​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)` | Creates an unmarshaller from an asynchronous Java function. |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[sync](#sync(java.util.function.Function))​(java.util.function.Function<A,​B> f)` | Creates an unmarshaller from a Java function. |

- - ### Method Detail
	
	
	
		- #### async
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> async​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)
		```
		
		Creates an unmarshaller from an asynchronous Java function.
		- #### sync
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> sync​(java.util.function.Function<A,​B> f)
		```
		
		Creates an unmarshaller from a Java function.
		- #### firstOf
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)
		```
		- #### firstOf
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)
		```
		- #### firstOf
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)
		```
		- #### firstOf
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,
		                                            [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshallers.html)*