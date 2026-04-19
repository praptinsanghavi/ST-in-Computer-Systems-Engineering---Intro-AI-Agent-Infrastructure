---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
title: TransformerAux
---

# TransformerAux

## Content

Package [akka.http.scaladsl.client](package-summary.html)
## Interface TransformerAux\<A,​B,​AA,​BB,​R\>

- ---

```
public interface TransformerAux<A,​B,​AA,​BB,​R>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[A](TransformerAux.html "type parameter in TransformerAux"),​[R](TransformerAux.html "type parameter in TransformerAux")>` | `[apply](#apply(scala.Function1,scala.Function1))​(scala.Function1<[A](TransformerAux.html "type parameter in TransformerAux"),​[B](TransformerAux.html "type parameter in TransformerAux")> f,  scala.Function1<[AA](TransformerAux.html "type parameter in TransformerAux"),​[BB](TransformerAux.html "type parameter in TransformerAux")> g)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		scala.Function1<[A](TransformerAux.html "type parameter in TransformerAux"),​[R](TransformerAux.html "type parameter in TransformerAux")> apply​(scala.Function1<[A](TransformerAux.html "type parameter in TransformerAux"),​[B](TransformerAux.html "type parameter in TransformerAux")> f,
		                                 scala.Function1<[AA](TransformerAux.html "type parameter in TransformerAux"),​[BB](TransformerAux.html "type parameter in TransformerAux")> g)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux.html)*