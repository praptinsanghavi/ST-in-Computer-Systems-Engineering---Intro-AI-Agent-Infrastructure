---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html
title: CodingDirectives
---

# CodingDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface CodingDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[CodingDirectives$](CodingDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface CodingDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[decodeRequest](#decodeRequest())()` | Decompresses the incoming request if it is `gzip` or `deflate` compressed. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[decodeRequestWith](#decodeRequestWith(akka.http.scaladsl.coding.Decoder))​([Decoder](../../coding/Decoder.html "interface in akka.http.scaladsl.coding") decoder)` | Decodes the incoming request using the given Decoder. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[decodeRequestWith](#decodeRequestWith(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Decoder](../../coding/Decoder.html "interface in akka.http.scaladsl.coding")> decoders)` | Decodes the incoming request if it is encoded with one of the given  encoders. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[encodeResponse](#encodeResponse())()` | Encodes the response with the encoding that is requested by the client via the `Accept-  Encoding` header. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[encodeResponseWith](#encodeResponseWith(akka.http.scaladsl.coding.Encoder,scala.collection.immutable.Seq))​([Encoder](../../coding/Encoder.html "interface in akka.http.scaladsl.coding") first,  scala.collection.immutable.Seq<[Encoder](../../coding/Encoder.html "interface in akka.http.scaladsl.coding")> more)` | Encodes the response with the encoding that is requested by the client via the `Accept-  Encoding` header. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[requestEncodedWith](#requestEncodedWith(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)` | Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[responseEncodingAccepted](#responseEncodingAccepted(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)` | Rejects the request with an UnacceptedResponseEncodingRejection  if the given response encoding is not accepted by the client. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withPrecompressedMediaTypeSupport](#withPrecompressedMediaTypeSupport())()` | Inspects the response entity and adds a `Content-Encoding: gzip` response header if  the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet. |

- - ### Method Detail
	
	
	
		- #### responseEncodingAccepted
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> responseEncodingAccepted​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)
		```
		
		Rejects the request with an UnacceptedResponseEncodingRejection
		 if the given response encoding is not accepted by the client.
		 
		
		Parameters:
		`encoding` \- (undocumented)
		Returns:
		(undocumented)
		- #### encodeResponse
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> encodeResponse()
		```
		
		Encodes the response with the encoding that is requested by the client via the `Accept-
		 Encoding` header. The response encoding is determined by the rules specified in
		 http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.
		 
		 If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
		 identity, gzip or deflate then no encoding is used.
		 
		
		
		
		Returns:
		(undocumented)
		- #### encodeResponseWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> encodeResponseWith​([Encoder](../../coding/Encoder.html "interface in akka.http.scaladsl.coding") first,
		                                                      scala.collection.immutable.Seq<[Encoder](../../coding/Encoder.html "interface in akka.http.scaladsl.coding")> more)
		```
		
		Encodes the response with the encoding that is requested by the client via the `Accept-
		 Encoding` header. The response encoding is determined by the rules specified in
		 http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.
		 
		 If the `Accept-Encoding` header is missing then the response is encoded using the `first`
		 encoder.
		 
		
		
		 If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
		 response encoding is used. Otherwise the request is rejected.
		 
		
		
		
		Parameters:
		`first` \- (undocumented)
		`more` \- (undocumented)
		Returns:
		(undocumented)
		- #### decodeRequestWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> decodeRequestWith​([Decoder](../../coding/Decoder.html "interface in akka.http.scaladsl.coding") decoder)
		```
		
		Decodes the incoming request using the given Decoder.
		 If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.
		 
		
		Parameters:
		`decoder` \- (undocumented)
		Returns:
		(undocumented)
		- #### requestEncodedWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> requestEncodedWith​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)
		```
		
		Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.
		 
		
		Parameters:
		`encoding` \- (undocumented)
		Returns:
		(undocumented)
		- #### decodeRequestWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> decodeRequestWith​(scala.collection.immutable.Seq<[Decoder](../../coding/Decoder.html "interface in akka.http.scaladsl.coding")> decoders)
		```
		
		Decodes the incoming request if it is encoded with one of the given
		 encoders. If the request encoding doesn't match one of the given encoders
		 the request is rejected with an `UnsupportedRequestEncodingRejection`.
		 If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.
		 
		
		Parameters:
		`decoders` \- (undocumented)
		Returns:
		(undocumented)
		- #### decodeRequest
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> decodeRequest()
		```
		
		Decompresses the incoming request if it is `gzip` or `deflate` compressed.
		 Uncompressed requests are passed through untouched.
		 If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.
		 
		
		Returns:
		(undocumented)
		- #### withPrecompressedMediaTypeSupport
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withPrecompressedMediaTypeSupport()
		```
		
		Inspects the response entity and adds a `Content-Encoding: gzip` response header if
		 the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.
		 
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html)*