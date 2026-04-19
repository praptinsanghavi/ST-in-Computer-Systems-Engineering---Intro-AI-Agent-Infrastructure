---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html
title: JwtSprayJson
---

# JwtSprayJson

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtSprayJson

- java.lang.Object
- - akka.http.jwt.internal.JwtSprayJson

- All Implemented Interfaces:
`[JwtSprayJsonParser](JwtSprayJsonParser.html "interface in akka.http.jwt.internal")<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`, `pdi.jwt.JwtCore<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`, `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`

Direct Known Subclasses:
`[JwtSprayJson$](JwtSprayJson$.html "class in akka.http.jwt.internal")`

---

```
public class JwtSprayJson
extends java.lang.Object
implements [JwtSprayJsonParser](JwtSprayJsonParser.html "interface in akka.http.jwt.internal")<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtSprayJson](#%3Cinit%3E(java.time.Clock))​(java.time.Clock clock)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")` | `[apply](#apply(java.time.Clock))​(java.time.Clock clock)` |  |
	| `java.time.Clock` | `[clock](#clock())()` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<C>` | `[decode](#decode(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>>` | `[decodeAll](#decodeAll(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<J>` | `[decodeJson](#decodeJson(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>>` | `[decodeJsonAll](#decodeJsonAll(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<java.lang.String>` | `[decodeRaw](#decodeRaw(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String))​(java.lang.String token)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>>` | `[decodeRawAll](#decodeRawAll(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `static java.lang.String` | `[encode](#encode(J))​(J claim)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String))​(java.lang.String claim)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.lang.String))​(java.lang.String header,  java.lang.String claim)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.lang.String,java.lang.String,pdi.jwt.JwtAlgorithm))​(java.lang.String header,  java.lang.String claim,  java.lang.String key,  pdi.jwt.JwtAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.lang.String,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm))​(java.lang.String header,  java.lang.String claim,  java.security.PrivateKey key,  pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.lang.String,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm))​(java.lang.String header,  java.lang.String claim,  javax.crypto.SecretKey key,  pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.lang.String,pdi.jwt.JwtAlgorithm))​(java.lang.String claim,  java.lang.String key,  pdi.jwt.JwtAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm))​(java.lang.String claim,  java.security.PrivateKey key,  pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(java.lang.String,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm))​(java.lang.String claim,  javax.crypto.SecretKey key,  pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(J,J))​(J header,  J claim)` |  |
	| `static java.lang.String` | `[encode](#encode(J,java.lang.String,pdi.jwt.JwtAlgorithm))​(J claim,  java.lang.String key,  pdi.jwt.JwtAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(J,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm))​(J claim,  java.security.PrivateKey key,  pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(J,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm))​(J claim,  javax.crypto.SecretKey key,  pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(J,J,java.lang.String))​(J header,  J claim,  java.lang.String key)` |  |
	| `static java.lang.String` | `[encode](#encode(J,J,java.security.Key))​(J header,  J claim,  java.security.Key key)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtClaim))​(pdi.jwt.JwtClaim claim)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtClaim,java.lang.String,pdi.jwt.JwtAlgorithm))​(pdi.jwt.JwtClaim claim,  java.lang.String key,  pdi.jwt.JwtAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtClaim,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm))​(pdi.jwt.JwtClaim claim,  java.security.PrivateKey key,  pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtClaim,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm))​(pdi.jwt.JwtClaim claim,  javax.crypto.SecretKey key,  pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim))​(pdi.jwt.JwtHeader header,  pdi.jwt.JwtClaim claim)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim,java.lang.String))​(pdi.jwt.JwtHeader header,  pdi.jwt.JwtClaim claim,  java.lang.String key)` |  |
	| `static java.lang.String` | `[encode](#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim,java.security.Key))​(pdi.jwt.JwtHeader header,  pdi.jwt.JwtClaim claim,  java.security.Key key)` |  |
	| `protected abstract static scala.Option<pdi.jwt.JwtAlgorithm>` | `[extractAlgorithm](#extractAlgorithm(H))​(H header)` |  |
	| `protected abstract static scala.Option<java.lang.Object>` | `[extractExpiration](#extractExpiration(C))​(C claim)` |  |
	| `protected abstract static scala.Option<java.lang.Object>` | `[extractNotBefore](#extractNotBefore(C))​(C claim)` |  |
	| `protected static scala.Option<pdi.jwt.JwtAlgorithm>` | `[getAlgorithm](#getAlgorithm(spray.json.JsObject))​(spray.json.JsObject header)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String))​(java.lang.String token)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static boolean` | `[isValid](#isValid(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `protected static spray.json.JsObject` | `[parse](#parse(java.lang.String))​(java.lang.String value)` |  |
	| `pdi.jwt.JwtClaim` | `[parseClaim](#parseClaim(java.lang.String))​(java.lang.String claim)` |  |
	| `pdi.jwt.JwtHeader` | `[parseHeader](#parseHeader(java.lang.String))​(java.lang.String header)` |  |
	| `protected static java.lang.String` | `[stringify](#stringify(spray.json.JsObject))​(spray.json.JsObject value)` |  |
	| `protected static void` | `[validate](#validate(H,C,java.lang.String,pdi.jwt.JwtOptions))​(H header,  C claim,  java.lang.String signature,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String))​(java.lang.String token)` |  |
	| `protected static void` | `[validate](#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String header64,  H header,  java.lang.String claim64,  C claim,  java.lang.String signature,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `protected static void` | `[validate](#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String header64,  H header,  java.lang.String claim64,  C claim,  java.lang.String signature,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `protected static void` | `[validate](#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String header64,  H header,  java.lang.String claim64,  C claim,  java.lang.String signature,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `protected static void` | `[validate](#validate(java.lang.String,H,java.lang.String,C,java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String header64,  H header,  java.lang.String claim64,  C claim,  java.lang.String signature,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `protected static void` | `[validate](#validate(java.lang.String,H,java.lang.String,C,java.lang.String,pdi.jwt.JwtOptions,scala.Function3))​(java.lang.String header64,  H header,  java.lang.String claim64,  C claim,  java.lang.String signature,  pdi.jwt.JwtOptions options,  scala.Function3<byte[],​byte[],​pdi.jwt.JwtAlgorithm,​java.lang.Object> verify)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions))​(java.lang.String token,  java.lang.String key,  scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.security.PublicKey))​(java.lang.String token,  java.security.PublicKey key)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `static void` | `[validate](#validate(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  java.security.PublicKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,javax.crypto.SecretKey))​(java.lang.String token,  javax.crypto.SecretKey key)` |  |
	| `static void` | `[validate](#validate(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `static void` | `[validate](#validate(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions))​(java.lang.String token,  javax.crypto.SecretKey key,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,  pdi.jwt.JwtOptions options)` |  |
	| `static void` | `[validate](#validate(java.lang.String,pdi.jwt.JwtOptions))​(java.lang.String token,  pdi.jwt.JwtOptions options)` |  |
	| `protected static boolean` | `[validateAsymmetricAlgorithm](#validateAsymmetricAlgorithm(pdi.jwt.algorithms.JwtAsymmetricAlgorithm,scala.collection.immutable.Seq))​(pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)` |  |
	| `protected static boolean` | `[validateHmacAlgorithm](#validateHmacAlgorithm(pdi.jwt.algorithms.JwtHmacAlgorithm,scala.collection.immutable.Seq))​(pdi.jwt.algorithms.JwtHmacAlgorithm algorithm,  scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)` |  |
	| `protected static scala.util.Try<scala.runtime.BoxedUnit>` | `[validateTiming](#validateTiming(C,pdi.jwt.JwtOptions))​(C claim,  pdi.jwt.JwtOptions options)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface pdi.jwt.JwtCore
		
		
		`decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validateAsymmetricAlgorithm, validateHmacAlgorithm, validateTiming`
		- ### Methods inherited from interface pdi.jwt.JwtJsonCommon
		
		
		`decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore`
		- ### Methods inherited from interface akka.http.jwt.internal.[JwtSprayJsonParser](JwtSprayJsonParser.html "interface in akka.http.jwt.internal")
		
		
		`[getAlgorithm](JwtSprayJsonParser.html#getAlgorithm(spray.json.JsObject)), [parse](JwtSprayJsonParser.html#parse(java.lang.String)), [stringify](JwtSprayJsonParser.html#stringify(spray.json.JsObject))`

- - ### Constructor Detail
	
	
	
		- #### JwtSprayJson
		
		
		
		```
		public JwtSprayJson​(java.time.Clock clock)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal") apply​(java.time.Clock clock)
		```
		- #### extractAlgorithm
		
		
		
		```
		protected abstract static scala.Option<pdi.jwt.JwtAlgorithm> extractAlgorithm​(H header)
		```
		- #### extractExpiration
		
		
		
		```
		protected abstract static scala.Option<java.lang.Object> extractExpiration​(C claim)
		```
		- #### extractNotBefore
		
		
		
		```
		protected abstract static scala.Option<java.lang.Object> extractNotBefore​(C claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String header,
		                                      java.lang.String claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String header,
		                                      java.lang.String claim,
		                                      java.lang.String key,
		                                      pdi.jwt.JwtAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String header,
		                                      java.lang.String claim,
		                                      javax.crypto.SecretKey key,
		                                      pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String header,
		                                      java.lang.String claim,
		                                      java.security.PrivateKey key,
		                                      pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String claim,
		                                      java.lang.String key,
		                                      pdi.jwt.JwtAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String claim,
		                                      javax.crypto.SecretKey key,
		                                      pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(java.lang.String claim,
		                                      java.security.PrivateKey key,
		                                      pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtClaim claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtClaim claim,
		                                      java.lang.String key,
		                                      pdi.jwt.JwtAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtClaim claim,
		                                      javax.crypto.SecretKey key,
		                                      pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtClaim claim,
		                                      java.security.PrivateKey key,
		                                      pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtHeader header,
		                                      pdi.jwt.JwtClaim claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtHeader header,
		                                      pdi.jwt.JwtClaim claim,
		                                      java.lang.String key)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(pdi.jwt.JwtHeader header,
		                                      pdi.jwt.JwtClaim claim,
		                                      java.security.Key key)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.lang.String key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.lang.String key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.lang.String key,
		                                                                                                                        scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.lang.String key,
		                                                                                                                        scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        javax.crypto.SecretKey key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        javax.crypto.SecretKey key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        javax.crypto.SecretKey key,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        javax.crypto.SecretKey key)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.security.PublicKey key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.security.PublicKey key,
		                                                                                                                        scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.security.PublicKey key,
		                                                                                                                        pdi.jwt.JwtOptions options)
		```
		- #### decodeRawAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<java.lang.String,​java.lang.String,​java.lang.String>> decodeRawAll​(java.lang.String token,
		                                                                                                                        java.security.PublicKey key)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.lang.String key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.lang.String key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.lang.String key,
		                                                         scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.lang.String key,
		                                                         scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         javax.crypto.SecretKey key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         javax.crypto.SecretKey key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         javax.crypto.SecretKey key,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         javax.crypto.SecretKey key)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.security.PublicKey key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.security.PublicKey key,
		                                                         scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.security.PublicKey key,
		                                                         pdi.jwt.JwtOptions options)
		```
		- #### decodeRaw
		
		
		
		```
		public static scala.util.Try<java.lang.String> decodeRaw​(java.lang.String token,
		                                                         java.security.PublicKey key)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.lang.String key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.lang.String key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.lang.String key,
		                                                                                       scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.lang.String key,
		                                                                                       scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       javax.crypto.SecretKey key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       javax.crypto.SecretKey key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       javax.crypto.SecretKey key,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       javax.crypto.SecretKey key)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.security.PublicKey key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.security.PublicKey key,
		                                                                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.security.PublicKey key,
		                                                                                       pdi.jwt.JwtOptions options)
		```
		- #### decodeAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<H,​C,​java.lang.String>> decodeAll​(java.lang.String token,
		                                                                                       java.security.PublicKey key)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.lang.String key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.lang.String key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.lang.String key,
		                                       scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.lang.String key,
		                                       scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       javax.crypto.SecretKey key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       javax.crypto.SecretKey key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       javax.crypto.SecretKey key,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       javax.crypto.SecretKey key)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.security.PublicKey key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.security.PublicKey key,
		                                       scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.security.PublicKey key,
		                                       pdi.jwt.JwtOptions options)
		```
		- #### decode
		
		
		
		```
		public static scala.util.Try<C> decode​(java.lang.String token,
		                                       java.security.PublicKey key)
		```
		- #### validateTiming
		
		
		
		```
		protected static scala.util.Try<scala.runtime.BoxedUnit> validateTiming​(C claim,
		                                                                        pdi.jwt.JwtOptions options)
		```
		- #### validateHmacAlgorithm
		
		
		
		```
		protected static boolean validateHmacAlgorithm​(pdi.jwt.algorithms.JwtHmacAlgorithm algorithm,
		                                               scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### validateAsymmetricAlgorithm
		
		
		
		```
		protected static boolean validateAsymmetricAlgorithm​(pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm,
		                                                     scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(H header,
		                               C claim,
		                               java.lang.String signature,
		                               pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(java.lang.String header64,
		                               H header,
		                               java.lang.String claim64,
		                               C claim,
		                               java.lang.String signature,
		                               pdi.jwt.JwtOptions options,
		                               scala.Function3<byte[],​byte[],​pdi.jwt.JwtAlgorithm,​java.lang.Object> verify)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(java.lang.String header64,
		                               H header,
		                               java.lang.String claim64,
		                               C claim,
		                               java.lang.String signature,
		                               java.lang.String key,
		                               scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                               pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(java.lang.String header64,
		                               H header,
		                               java.lang.String claim64,
		                               C claim,
		                               java.lang.String signature,
		                               java.lang.String key,
		                               scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                               pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(java.lang.String header64,
		                               H header,
		                               java.lang.String claim64,
		                               C claim,
		                               java.lang.String signature,
		                               javax.crypto.SecretKey key,
		                               scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                               pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		protected static void validate​(java.lang.String header64,
		                               H header,
		                               java.lang.String claim64,
		                               C claim,
		                               java.lang.String signature,
		                               java.security.PublicKey key,
		                               scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                               pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.lang.String key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.lang.String key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.lang.String key,
		                            scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.lang.String key,
		                            scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            javax.crypto.SecretKey key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            javax.crypto.SecretKey key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            javax.crypto.SecretKey key,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            javax.crypto.SecretKey key)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.security.PublicKey key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.security.PublicKey key,
		                            scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.security.PublicKey key,
		                            pdi.jwt.JwtOptions options)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String token,
		                            java.security.PublicKey key)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.lang.String key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.lang.String key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.lang.String key,
		                              scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.lang.String key,
		                              scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              javax.crypto.SecretKey key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              javax.crypto.SecretKey key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              javax.crypto.SecretKey key,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              javax.crypto.SecretKey key)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.security.PublicKey key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.security.PublicKey key,
		                              scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.security.PublicKey key,
		                              pdi.jwt.JwtOptions options)
		```
		- #### isValid
		
		
		
		```
		public static boolean isValid​(java.lang.String token,
		                              java.security.PublicKey key)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J header,
		                                      J claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J header,
		                                      J claim,
		                                      java.lang.String key)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J header,
		                                      J claim,
		                                      java.security.Key key)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J claim)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J claim,
		                                      java.lang.String key,
		                                      pdi.jwt.JwtAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J claim,
		                                      javax.crypto.SecretKey key,
		                                      pdi.jwt.algorithms.JwtHmacAlgorithm algorithm)
		```
		- #### encode
		
		
		
		```
		public static java.lang.String encode​(J claim,
		                                      java.security.PrivateKey key,
		                                      pdi.jwt.algorithms.JwtAsymmetricAlgorithm algorithm)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.lang.String key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.lang.String key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.lang.String key,
		                                                                                           scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.lang.String key,
		                                                                                           scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           javax.crypto.SecretKey key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           javax.crypto.SecretKey key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           javax.crypto.SecretKey key,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           javax.crypto.SecretKey key)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.security.PublicKey key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.security.PublicKey key,
		                                                                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.security.PublicKey key,
		                                                                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJsonAll
		
		
		
		```
		public static scala.util.Try<scala.Tuple3<J,​J,​java.lang.String>> decodeJsonAll​(java.lang.String token,
		                                                                                           java.security.PublicKey key)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.lang.String key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.lang.String key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.lang.String key,
		                                           scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.lang.String key,
		                                           scala.Function0<scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm>> algorithms)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           javax.crypto.SecretKey key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           javax.crypto.SecretKey key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtHmacAlgorithm> algorithms)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           javax.crypto.SecretKey key,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           javax.crypto.SecretKey key)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.security.PublicKey key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.security.PublicKey key,
		                                           scala.collection.immutable.Seq<pdi.jwt.algorithms.JwtAsymmetricAlgorithm> algorithms)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.security.PublicKey key,
		                                           pdi.jwt.JwtOptions options)
		```
		- #### decodeJson
		
		
		
		```
		public static scala.util.Try<J> decodeJson​(java.lang.String token,
		                                           java.security.PublicKey key)
		```
		- #### parse
		
		
		
		```
		protected static spray.json.JsObject parse​(java.lang.String value)
		```
		- #### stringify
		
		
		
		```
		protected static java.lang.String stringify​(spray.json.JsObject value)
		```
		- #### getAlgorithm
		
		
		
		```
		protected static scala.Option<pdi.jwt.JwtAlgorithm> getAlgorithm​(spray.json.JsObject header)
		```
		- #### clock
		
		
		
		```
		public java.time.Clock clock()
		```
		
		
		Specified by:
		`clock` in interface `pdi.jwt.JwtCore<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`
		- #### parseHeader
		
		
		
		```
		public pdi.jwt.JwtHeader parseHeader​(java.lang.String header)
		```
		
		
		Specified by:
		`parseHeader` in interface `pdi.jwt.JwtCore<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`
		- #### parseClaim
		
		
		
		```
		public pdi.jwt.JwtClaim parseClaim​(java.lang.String claim)
		```
		
		
		Specified by:
		`parseClaim` in interface `pdi.jwt.JwtCore<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html)*