---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
title: ObjectRegistry
---

# ObjectRegistry

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface ObjectRegistry\<K,​V\>

- All Known Implementing Classes:
`[HttpCharsets$](../../scaladsl/model/HttpCharsets$.html "class in akka.http.scaladsl.model")`, `[HttpEncodings$](../../scaladsl/model/headers/HttpEncodings$.html "class in akka.http.scaladsl.model.headers")`, `[HttpMethods$](../../scaladsl/model/HttpMethods$.html "class in akka.http.scaladsl.model")`, `[HttpProtocols$](../../scaladsl/model/HttpProtocols$.html "class in akka.http.scaladsl.model")`, `[MediaRanges$](../../scaladsl/model/MediaRanges$.html "class in akka.http.scaladsl.model")`, `[MediaTypes$](../../scaladsl/model/MediaTypes$.html "class in akka.http.scaladsl.model")`, `[StatusCodes$](../../scaladsl/model/StatusCodes$.html "class in akka.http.scaladsl.model")`

---

```
public interface ObjectRegistry<K,​V>
```

INTERNAL API
 
 A unsynchronized registry to keep track of singleton instances similar to what
 java.lang.Enum provides. `registry` should therefore only be used inside of singleton constructors.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[V](ObjectRegistry.html "type parameter in ObjectRegistry")>` | `[getForKey](#getForKey(K))​([K](ObjectRegistry.html "type parameter in ObjectRegistry") key)` |  |
	| `scala.Option<[V](ObjectRegistry.html "type parameter in ObjectRegistry")>` | `[getForKeyCaseInsensitive](#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))​(java.lang.String key,  scala.$less$colon$less<java.lang.String,​[K](ObjectRegistry.html "type parameter in ObjectRegistry")> conv)` |  |
	| `java.lang.Object` | `[register](#register(K,V))​([K](ObjectRegistry.html "type parameter in ObjectRegistry") key,  [V](ObjectRegistry.html "type parameter in ObjectRegistry") obj)` |  |

- - ### Method Detail
	
	
	
		- #### getForKey
		
		
		
		```
		scala.Option<[V](ObjectRegistry.html "type parameter in ObjectRegistry")> getForKey​([K](ObjectRegistry.html "type parameter in ObjectRegistry") key)
		```
		- #### getForKeyCaseInsensitive
		
		
		
		```
		scala.Option<[V](ObjectRegistry.html "type parameter in ObjectRegistry")> getForKeyCaseInsensitive​(java.lang.String key,
		                                         scala.$less$colon$less<java.lang.String,​[K](ObjectRegistry.html "type parameter in ObjectRegistry")> conv)
		```
		- #### register
		
		
		
		```
		java.lang.Object register​([K](ObjectRegistry.html "type parameter in ObjectRegistry") key,
		                          [V](ObjectRegistry.html "type parameter in ObjectRegistry") obj)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRanges$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html)*