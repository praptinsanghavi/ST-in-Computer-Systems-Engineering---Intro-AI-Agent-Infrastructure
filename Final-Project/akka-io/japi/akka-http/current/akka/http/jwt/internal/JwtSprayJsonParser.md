---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html
title: JwtSprayJsonParser
---

# JwtSprayJsonParser

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Interface JwtSprayJsonParser\<H,​C\>

- All Superinterfaces:
`pdi.jwt.JwtCore<H,​C>`, `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​H,​C>`

All Known Implementing Classes:
`[JwtSprayJson](JwtSprayJson.html "class in akka.http.jwt.internal")`, `[JwtSprayJson$](JwtSprayJson$.html "class in akka.http.jwt.internal")`

---

```
public interface JwtSprayJsonParser<H,​C>
extends pdi.jwt.JwtJsonCommon<spray.json.JsObject,​H,​C>
```

INTERNAL API
 
 Implementation of `JwtCore` using `JsObject` from spray\-json.
 

 This class originally came from jwt\-spray\-json,
 but was removed in https://github.com/jwt\-scala/jwt\-scala/commit/bf1131ce02480103c0b953b97da001105a3ee038

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<pdi.jwt.JwtAlgorithm>` | `[getAlgorithm](#getAlgorithm(spray.json.JsObject))​(spray.json.JsObject header)` |  |
	| `spray.json.JsObject` | `[parse](#parse(java.lang.String))​(java.lang.String value)` |  |
	| `java.lang.String` | `[stringify](#stringify(spray.json.JsObject))​(spray.json.JsObject value)` |  |
	
	
		- ### Methods inherited from interface pdi.jwt.JwtCore
		
		
		`clock, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decode, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeAll, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRaw, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, decodeRawAll, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, isValid, parseClaim, parseHeader, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validate, validateAsymmetricAlgorithm, validateHmacAlgorithm, validateTiming`
		- ### Methods inherited from interface pdi.jwt.JwtJsonCommon
		
		
		`decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJson, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, decodeJsonAll, encode, encode, encode, encode, encode, encode, encode, extractAlgorithm, extractExpiration, extractNotBefore`

- - ### Method Detail
	
	
	
		- #### getAlgorithm
		
		
		
		```
		scala.Option<pdi.jwt.JwtAlgorithm> getAlgorithm​(spray.json.JsObject header)
		```
		
		
		Specified by:
		`getAlgorithm` in interface `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​[H](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser"),​[C](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser")>`
		- #### parse
		
		
		
		```
		spray.json.JsObject parse​(java.lang.String value)
		```
		
		
		Specified by:
		`parse` in interface `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​[H](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser"),​[C](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser")>`
		- #### stringify
		
		
		
		```
		java.lang.String stringify​(spray.json.JsObject value)
		```
		
		
		Specified by:
		`stringify` in interface `pdi.jwt.JwtJsonCommon<spray.json.JsObject,​[H](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser"),​[C](JwtSprayJsonParser.html "type parameter in JwtSprayJsonParser")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJson.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSprayJsonParser.html)*