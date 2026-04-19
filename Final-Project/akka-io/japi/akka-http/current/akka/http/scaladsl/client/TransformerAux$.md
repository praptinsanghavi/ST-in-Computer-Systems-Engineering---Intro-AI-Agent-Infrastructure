---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
title: TransformerAux$
---

# TransformerAux$

## Content

Package [akka.http.scaladsl.client](package-summary.html)
## Class TransformerAux$

- java.lang.Object
- - akka.http.scaladsl.client.TransformerAux$

- ---

```
public class TransformerAux$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TransformerAux$](TransformerAux$.html "class in akka.http.scaladsl.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransformerAux$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B,​C>[TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​B,​B,​C,​C>` | `[aux1](#aux1())()` |  |
	| `<A,​B,​C>[TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​scala.concurrent.Future<B>,​B,​C,​scala.concurrent.Future<C>>` | `[aux2](#aux2(scala.concurrent.ExecutionContext))​(scala.concurrent.ExecutionContext ec)` |  |
	| `<A,​B,​C>[TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​scala.concurrent.Future<B>,​B,​scala.concurrent.Future<C>,​scala.concurrent.Future<C>>` | `[aux3](#aux3(scala.concurrent.ExecutionContext))​(scala.concurrent.ExecutionContext ec)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TransformerAux$](TransformerAux$.html "class in akka.http.scaladsl.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TransformerAux$
		
		
		
		```
		public TransformerAux$()
		```

	- ### Method Detail
	
	
	
		- #### aux1
		
		
		
		```
		public <A,​B,​C> [TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​B,​B,​C,​C> aux1()
		```
		- #### aux2
		
		
		
		```
		public <A,​B,​C> [TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​scala.concurrent.Future<B>,​B,​C,​scala.concurrent.Future<C>> aux2​(scala.concurrent.ExecutionContext ec)
		```
		- #### aux3
		
		
		
		```
		public <A,​B,​C> [TransformerAux](TransformerAux.html "interface in akka.http.scaladsl.client")<A,​scala.concurrent.Future<B>,​B,​scala.concurrent.Future<C>,​scala.concurrent.Future<C>> aux3​(scala.concurrent.ExecutionContext ec)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html)*