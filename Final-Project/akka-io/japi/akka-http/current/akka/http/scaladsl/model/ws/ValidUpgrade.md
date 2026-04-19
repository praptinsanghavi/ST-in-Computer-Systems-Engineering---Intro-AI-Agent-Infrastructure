---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html
title: ValidUpgrade
---

# ValidUpgrade

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Class ValidUpgrade

- java.lang.Object
- - akka.http.scaladsl.model.ws.ValidUpgrade

- All Implemented Interfaces:
`[WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ValidUpgrade
extends java.lang.Object
implements [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.ws.ValidUpgrade)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ValidUpgrade](#%3Cinit%3E(akka.http.scaladsl.model.HttpResponse,scala.Option))​([HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") response,  scala.Option<java.lang.String> chosenSubprotocol)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `scala.Option<java.lang.String>` | `[chosenSubprotocol](#chosenSubprotocol())()` |  |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[response](#response())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ValidUpgrade
		
		
		
		```
		public ValidUpgrade​([HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") response,
		                    scala.Option<java.lang.String> chosenSubprotocol)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### response
		
		
		
		```
		public [HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") response()
		```
		
		
		Specified by:
		`[response](WebSocketUpgradeResponse.html#response())` in interface `[WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")`
		- #### chosenSubprotocol
		
		
		
		```
		public scala.Option<java.lang.String> chosenSubprotocol()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html)*