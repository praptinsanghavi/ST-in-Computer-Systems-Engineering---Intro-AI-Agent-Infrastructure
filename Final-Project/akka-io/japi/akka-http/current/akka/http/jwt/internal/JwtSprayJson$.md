---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html
title: JwtSprayJson$
---

# JwtSprayJson$

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtSprayJson$

- java.lang.Object
- - [akka.http.jwt.internal.JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")
	- - akka.http.jwt.internal.JwtSprayJson$

- All Implemented Interfaces:
`[JwtSprayJsonParser](JwtSprayJsonParser.html "interface in akka.http.jwt.internal")<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`, `pdi.jwt.JwtCore<pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`, `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​pdi.jwt.JwtHeader,​pdi.jwt.JwtClaim>`

---

```
public class JwtSprayJson$
extends [JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JwtSprayJson$](JwtSprayJson$.html "class in akka.http.jwt.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtSprayJson$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")` | `[apply](#apply(java.time.Clock))​(java.time.Clock clock)` |  |
	
	
		- ### Methods inherited from class akka.http.jwt.internal.[JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")
		
		
		`[clock](JwtSprayJson.html#clock()), [decode](JwtSprayJson.html#decode(java.lang.String)), [decode](JwtSprayJson.html#decode(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decode](JwtSprayJson.html#decode(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,java.lang.String,scala.Function0)), [decode](JwtSprayJson.html#decode(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,java.security.PublicKey)), [decode](JwtSprayJson.html#decode(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decode](JwtSprayJson.html#decode(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,javax.crypto.SecretKey)), [decode](JwtSprayJson.html#decode(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decode](JwtSprayJson.html#decode(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decode](JwtSprayJson.html#decode(java.lang.String,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.lang.String,scala.Function0)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.security.PublicKey)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,javax.crypto.SecretKey)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeAll](JwtSprayJson.html#decodeAll(java.lang.String,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.lang.String,scala.Function0)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.security.PublicKey)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,javax.crypto.SecretKey)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJson](JwtSprayJson.html#decodeJson(java.lang.String,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.lang.String,scala.Function0)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.security.PublicKey)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,javax.crypto.SecretKey)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeJsonAll](JwtSprayJson.html#decodeJsonAll(java.lang.String,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.lang.String,scala.Function0)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.security.PublicKey)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,javax.crypto.SecretKey)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRaw](JwtSprayJson.html#decodeRaw(java.lang.String,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.lang.String,scala.Function0)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.security.PublicKey)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,javax.crypto.SecretKey)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [decodeRawAll](JwtSprayJson.html#decodeRawAll(java.lang.String,pdi.jwt.JwtOptions)), [encode](JwtSprayJson.html#encode(J)), [encode](JwtSprayJson.html#encode(java.lang.String)), [encode](JwtSprayJson.html#encode(java.lang.String,java.lang.String)), [encode](JwtSprayJson.html#encode(java.lang.String,java.lang.String,java.lang.String,pdi.jwt.JwtAlgorithm)), [encode](JwtSprayJson.html#encode(java.lang.String,java.lang.String,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm)), [encode](JwtSprayJson.html#encode(java.lang.String,java.lang.String,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm)), [encode](JwtSprayJson.html#encode(java.lang.String,java.lang.String,pdi.jwt.JwtAlgorithm)), [encode](JwtSprayJson.html#encode(java.lang.String,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm)), [encode](JwtSprayJson.html#encode(java.lang.String,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm)), [encode](JwtSprayJson.html#encode(J,J)), [encode](JwtSprayJson.html#encode(J,java.lang.String,pdi.jwt.JwtAlgorithm)), [encode](JwtSprayJson.html#encode(J,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm)), [encode](JwtSprayJson.html#encode(J,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm)), [encode](JwtSprayJson.html#encode(J,J,java.lang.String)), [encode](JwtSprayJson.html#encode(J,J,java.security.Key)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtClaim)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtClaim,java.lang.String,pdi.jwt.JwtAlgorithm)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtClaim,java.security.PrivateKey,pdi.jwt.algorithms.JwtAsymmetricAlgorithm)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtClaim,javax.crypto.SecretKey,pdi.jwt.algorithms.JwtHmacAlgorithm)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim,java.lang.String)), [encode](JwtSprayJson.html#encode(pdi.jwt.JwtHeader,pdi.jwt.JwtClaim,java.security.Key)), [extractAlgorithm](JwtSprayJson.html#extractAlgorithm(H)), [extractExpiration](JwtSprayJson.html#extractExpiration(C)), [extractNotBefore](JwtSprayJson.html#extractNotBefore(C)), [getAlgorithm](JwtSprayJson.html#getAlgorithm(spray.json.JsObject)), [isValid](JwtSprayJson.html#isValid(java.lang.String)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.lang.String,scala.Function0)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.security.PublicKey)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [isValid](JwtSprayJson.html#isValid(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,javax.crypto.SecretKey)), [isValid](JwtSprayJson.html#isValid(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [isValid](JwtSprayJson.html#isValid(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [isValid](JwtSprayJson.html#isValid(java.lang.String,pdi.jwt.JwtOptions)), [parse](JwtSprayJson.html#parse(java.lang.String)), [parseClaim](JwtSprayJson.html#parseClaim(java.lang.String)), [parseHeader](JwtSprayJson.html#parseHeader(java.lang.String)), [stringify](JwtSprayJson.html#stringify(spray.json.JsObject)), [validate](JwtSprayJson.html#validate(H,C,java.lang.String,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String)), [validate](JwtSprayJson.html#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,H,java.lang.String,C,java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,H,java.lang.String,C,java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,H,java.lang.String,C,java.lang.String,pdi.jwt.JwtOptions,scala.Function3)), [validate](JwtSprayJson.html#validate(java.lang.String,java.lang.String,scala.collection.immutable.Seq)), [validate](JwtSprayJson.html#validate(java.lang.String,java.lang.String,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,java.lang.String,scala.Function0)), [validate](JwtSprayJson.html#validate(java.lang.String,java.lang.String,scala.Function0,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,java.security.PublicKey)), [validate](JwtSprayJson.html#validate(java.lang.String,java.security.PublicKey,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq)), [validate](JwtSprayJson.html#validate(java.lang.String,java.security.PublicKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,javax.crypto.SecretKey)), [validate](JwtSprayJson.html#validate(java.lang.String,javax.crypto.SecretKey,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq)), [validate](JwtSprayJson.html#validate(java.lang.String,javax.crypto.SecretKey,scala.collection.immutable.Seq,pdi.jwt.JwtOptions)), [validate](JwtSprayJson.html#validate(java.lang.String,pdi.jwt.JwtOptions)), [validateAsymmetricAlgorithm](JwtSprayJson.html#validateAsymmetricAlgorithm(pdi.jwt.algorithms.JwtAsymmetricAlgorithm,scala.collection.immutable.Seq)), [validateHmacAlgorithm](JwtSprayJson.html#validateHmacAlgorithm(pdi.jwt.algorithms.JwtHmacAlgorithm,scala.collection.immutable.Seq)), [validateTiming](JwtSprayJson.html#validateTiming(C,pdi.jwt.JwtOptions))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface pdi.jwt.JwtCore
		
		
		`decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validateAsymmetricAlgorithm, validateHmacAlgorithm, validateTiming`
		- ### Methods inherited from interface pdi.jwt.JwtJsonCommon
		
		
		`decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore`
		- ### Methods inherited from interface akka.http.jwt.internal.[JwtSprayJsonParser](JwtSprayJsonParser.html "interface in akka.http.jwt.internal")
		
		
		`[getAlgorithm](JwtSprayJsonParser.html#getAlgorithm(spray.json.JsObject)), [parse](JwtSprayJsonParser.html#parse(java.lang.String)), [stringify](JwtSprayJsonParser.html#stringify(spray.json.JsObject))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JwtSprayJson$](JwtSprayJson$.html "class in akka.http.jwt.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JwtSprayJson$
		
		
		
		```
		public JwtSprayJson$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal") apply​(java.time.Clock clock)
		```
		
		
		Overrides:
		`[apply](JwtSprayJson.html#apply(java.time.Clock))` in class `[JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html)*