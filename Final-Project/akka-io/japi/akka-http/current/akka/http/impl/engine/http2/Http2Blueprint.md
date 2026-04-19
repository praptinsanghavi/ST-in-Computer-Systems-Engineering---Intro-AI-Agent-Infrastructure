---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint.BidiFlowExt.html
title: Http2Blueprint.BidiFlowExt
---

# Http2Blueprint.BidiFlowExt

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Blueprint.BidiFlowExt\<I1,​O1,​I2,​O2,​Mat\>

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Blueprint.BidiFlowExt\<I1,​O1,​I2,​O2,​Mat\>

- Enclosing class:
[Http2Blueprint](Http2Blueprint.html "class in akka.http.impl.engine.http2")

---

```
public static class Http2Blueprint.BidiFlowExt<I1,​O1,​I2,​O2,​Mat>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BidiFlowExt](#%3Cinit%3E(akka.stream.scaladsl.BidiFlow))​(akka.stream.scaladsl.BidiFlow<[I1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[O1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[I2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[O2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[Mat](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt")> bidi)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<OO1,​II2,​Mat2>akka.stream.scaladsl.BidiFlow<[I1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​OO1,​II2,​[O2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​Mat2>` | `[atopKeepRight](#atopKeepRight(akka.stream.Graph))​(akka.stream.Graph<akka.stream.BidiShape<[O1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​OO1,​II2,​[I2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt")>,​Mat2> other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BidiFlowExt
		
		
		
		```
		public BidiFlowExt​(akka.stream.scaladsl.BidiFlow<[I1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[O1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[I2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[O2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​[Mat](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt")> bidi)
		```

	- ### Method Detail
	
	
	
		- #### atopKeepRight
		
		
		
		```
		public <OO1,​II2,​Mat2> akka.stream.scaladsl.BidiFlow<[I1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​OO1,​II2,​[O2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​Mat2> atopKeepRight​(akka.stream.Graph<akka.stream.BidiShape<[O1](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt"),​OO1,​II2,​[I2](Http2Blueprint.BidiFlowExt.html "type parameter in Http2Blueprint.BidiFlowExt")>,​Mat2> other)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint.BidiFlowExt.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint.BidiFlowExt.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint.BidiFlowExt.html)*