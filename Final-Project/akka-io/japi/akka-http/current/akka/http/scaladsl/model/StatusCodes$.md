---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html
title: StatusCodes$
---

# StatusCodes$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class StatusCodes$

- java.lang.Object
- - akka.http.scaladsl.model.StatusCodes$

- All Implemented Interfaces:
`[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.Object,​[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")>`

---

```
public class StatusCodes$
extends java.lang.Object
implements [ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.Object,​[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StatusCodes$](StatusCodes$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StatusCodes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[Accepted](#Accepted())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[AlreadyReported](#AlreadyReported())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[BadGateway](#BadGateway())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[BadRequest](#BadRequest())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[BandwidthLimitExceeded](#BandwidthLimitExceeded())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[BlockedByParentalControls](#BlockedByParentalControls())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[Conflict](#Conflict())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[ContentTooLarge](#ContentTooLarge())()` |  |
	| `[StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model")` | `[Continue](#Continue())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[Created](#Created())()` |  |
	| `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")` | `[custom](#custom(int,java.lang.String,java.lang.String))​(int intValue,  java.lang.String reason,  java.lang.String defaultMessage)` | Create a custom status code with default behavior for its value region. |
	| `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")` | `[custom](#custom(int,java.lang.String,java.lang.String,boolean,boolean))​(int intValue,  java.lang.String reason,  java.lang.String defaultMessage,  boolean isSuccess,  boolean allowsEntity)` | Create a custom status code and allow full customization of behavior. |
	| `[StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model")` | `[EarlyHints](#EarlyHints())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[EnhanceYourCalm](#EnhanceYourCalm())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[ExpectationFailed](#ExpectationFailed())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[FailedDependency](#FailedDependency())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[Forbidden](#Forbidden())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[Found](#Found())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[GatewayTimeout](#GatewayTimeout())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[Gone](#Gone())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[HttpVersionNotSupported](#HttpVersionNotSupported())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[HTTPVersionNotSupported](#HTTPVersionNotSupported())()` | Deprecated. deprecated in favor of HttpVersionNotSupported. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[ImATeapot](#ImATeapot())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[IMUsed](#IMUsed())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[InsufficientStorage](#InsufficientStorage())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[InternalServerError](#InternalServerError())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[LengthRequired](#LengthRequired())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[Locked](#Locked())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[LoopDetected](#LoopDetected())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[MethodNotAllowed](#MethodNotAllowed())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[MisdirectedRequest](#MisdirectedRequest())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[MovedPermanently](#MovedPermanently())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[MultipleChoices](#MultipleChoices())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[MultiStatus](#MultiStatus())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[NetworkAuthenticationRequired](#NetworkAuthenticationRequired())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[NetworkConnectTimeout](#NetworkConnectTimeout())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[NetworkReadTimeout](#NetworkReadTimeout())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[NoContent](#NoContent())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[NonAuthoritativeInformation](#NonAuthoritativeInformation())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[NotAcceptable](#NotAcceptable())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[NotExtended](#NotExtended())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[NotFound](#NotFound())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[NotImplemented](#NotImplemented())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[NotModified](#NotModified())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[OK](#OK())()` |  |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[PartialContent](#PartialContent())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[PayloadTooLarge](#PayloadTooLarge())()` | Deprecated. deprecated in favor of ContentTooLarge. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[PaymentRequired](#PaymentRequired())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[PermanentRedirect](#PermanentRedirect())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[PreconditionFailed](#PreconditionFailed())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[PreconditionRequired](#PreconditionRequired())()` |  |
	| `[StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model")` | `[Processing](#Processing())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[ProxyAuthenticationRequired](#ProxyAuthenticationRequired())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RangeNotSatisfiable](#RangeNotSatisfiable())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RequestedRangeNotSatisfiable](#RequestedRangeNotSatisfiable())()` | Deprecated. deprecated in favor of RangeNotSatisfiable. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RequestEntityTooLarge](#RequestEntityTooLarge())()` | Deprecated. deprecated in favor of ContentTooLarge. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RequestHeaderFieldsTooLarge](#RequestHeaderFieldsTooLarge())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RequestTimeout](#RequestTimeout())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RequestUriTooLong](#RequestUriTooLong())()` | Deprecated. deprecated in favor of UriTooLong. |
	| `[StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model")` | `[ResetContent](#ResetContent())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[RetryWith](#RetryWith())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[SeeOther](#SeeOther())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[ServiceUnavailable](#ServiceUnavailable())()` |  |
	| `[StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model")` | `[SwitchingProtocols](#SwitchingProtocols())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[TemporaryRedirect](#TemporaryRedirect())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[TooEarly](#TooEarly())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[TooManyRequests](#TooManyRequests())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[Unauthorized](#Unauthorized())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UnavailableForLegalReasons](#UnavailableForLegalReasons())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UnorderedCollection](#UnorderedCollection())()` | Deprecated. Non\-standard Unordered Collection should not be used, deprecated in favor of TooEarly. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UnprocessableContent](#UnprocessableContent())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UnprocessableEntity](#UnprocessableEntity())()` | Deprecated. deprecated in favor of UnprocessableContent. |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UnsupportedMediaType](#UnsupportedMediaType())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UpgradeRequired](#UpgradeRequired())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[UriTooLong](#UriTooLong())()` |  |
	| `[StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model")` | `[UseProxy](#UseProxy())()` |  |
	| `[StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model")` | `[VariantAlsoNegotiates](#VariantAlsoNegotiates())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")
		
		
		`[getForKey](../../impl/util/ObjectRegistry.html#getForKey(K)), [getForKeyCaseInsensitive](../../impl/util/ObjectRegistry.html#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less)), [register](../../impl/util/ObjectRegistry.html#register(K,V))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StatusCodes$](StatusCodes$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StatusCodes$
		
		
		
		```
		public StatusCodes$()
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") custom​(int intValue,
		                         java.lang.String reason,
		                         java.lang.String defaultMessage,
		                         boolean isSuccess,
		                         boolean allowsEntity)
		```
		
		Create a custom status code and allow full customization of behavior. The value of `allowsEntity`
		 changes the parser behavior: If it is set to true, a response with this status code is required to include a
		 `Content-Length` header to be parsed correctly when keep\-alive is enabled (which is the default in HTTP/1\.1\).
		 If `allowsEntity` is false, an entity is never expected.
		
		Parameters:
		`intValue` \- (undocumented)
		`reason` \- (undocumented)
		`defaultMessage` \- (undocumented)
		`isSuccess` \- (undocumented)
		`allowsEntity` \- (undocumented)
		Returns:
		(undocumented)
		- #### custom
		
		
		
		```
		public [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") custom​(int intValue,
		                         java.lang.String reason,
		                         java.lang.String defaultMessage)
		```
		
		Create a custom status code with default behavior for its value region.
		- #### Continue
		
		
		
		```
		public [StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model") Continue()
		```
		- #### SwitchingProtocols
		
		
		
		```
		public [StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model") SwitchingProtocols()
		```
		- #### Processing
		
		
		
		```
		public [StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model") Processing()
		```
		- #### EarlyHints
		
		
		
		```
		public [StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model") EarlyHints()
		```
		- #### OK
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") OK()
		```
		- #### Created
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") Created()
		```
		- #### Accepted
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") Accepted()
		```
		- #### NonAuthoritativeInformation
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") NonAuthoritativeInformation()
		```
		- #### NoContent
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") NoContent()
		```
		- #### ResetContent
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") ResetContent()
		```
		- #### PartialContent
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") PartialContent()
		```
		- #### MultiStatus
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") MultiStatus()
		```
		- #### AlreadyReported
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") AlreadyReported()
		```
		- #### IMUsed
		
		
		
		```
		public [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") IMUsed()
		```
		- #### MultipleChoices
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") MultipleChoices()
		```
		- #### MovedPermanently
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") MovedPermanently()
		```
		- #### Found
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") Found()
		```
		- #### SeeOther
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") SeeOther()
		```
		- #### NotModified
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") NotModified()
		```
		- #### UseProxy
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") UseProxy()
		```
		- #### TemporaryRedirect
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") TemporaryRedirect()
		```
		- #### PermanentRedirect
		
		
		
		```
		public [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") PermanentRedirect()
		```
		- #### BadRequest
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") BadRequest()
		```
		- #### Unauthorized
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") Unauthorized()
		```
		- #### PaymentRequired
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") PaymentRequired()
		```
		- #### Forbidden
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") Forbidden()
		```
		- #### NotFound
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") NotFound()
		```
		- #### MethodNotAllowed
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") MethodNotAllowed()
		```
		- #### NotAcceptable
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") NotAcceptable()
		```
		- #### ProxyAuthenticationRequired
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") ProxyAuthenticationRequired()
		```
		- #### RequestTimeout
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RequestTimeout()
		```
		- #### Conflict
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") Conflict()
		```
		- #### Gone
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") Gone()
		```
		- #### LengthRequired
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") LengthRequired()
		```
		- #### PreconditionFailed
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") PreconditionFailed()
		```
		- #### ContentTooLarge
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") ContentTooLarge()
		```
		- #### PayloadTooLarge
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") PayloadTooLarge()
		```
		
		Deprecated.
		deprecated in favor of ContentTooLarge. Since 10\.4\.0\.
		- #### RequestEntityTooLarge
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RequestEntityTooLarge()
		```
		
		Deprecated.
		deprecated in favor of ContentTooLarge. Since 10\.4\.0\.
		- #### UriTooLong
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UriTooLong()
		```
		- #### RequestUriTooLong
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RequestUriTooLong()
		```
		
		Deprecated.
		deprecated in favor of UriTooLong. Since 10\.1\.11\.
		- #### UnsupportedMediaType
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UnsupportedMediaType()
		```
		- #### RangeNotSatisfiable
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RangeNotSatisfiable()
		```
		- #### RequestedRangeNotSatisfiable
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RequestedRangeNotSatisfiable()
		```
		
		Deprecated.
		deprecated in favor of RangeNotSatisfiable. Since 10\.1\.11\.
		- #### ExpectationFailed
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") ExpectationFailed()
		```
		- #### ImATeapot
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") ImATeapot()
		```
		- #### EnhanceYourCalm
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") EnhanceYourCalm()
		```
		- #### MisdirectedRequest
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") MisdirectedRequest()
		```
		- #### UnprocessableContent
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UnprocessableContent()
		```
		- #### UnprocessableEntity
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UnprocessableEntity()
		```
		
		Deprecated.
		deprecated in favor of UnprocessableContent. Since 10\.4\.0\.
		- #### Locked
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") Locked()
		```
		- #### FailedDependency
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") FailedDependency()
		```
		- #### TooEarly
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") TooEarly()
		```
		- #### UnorderedCollection
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UnorderedCollection()
		```
		
		Deprecated.
		Non\-standard Unordered Collection should not be used, deprecated in favor of TooEarly. Since 10\.1\.6\.
		- #### UpgradeRequired
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UpgradeRequired()
		```
		- #### PreconditionRequired
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") PreconditionRequired()
		```
		- #### TooManyRequests
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") TooManyRequests()
		```
		- #### RequestHeaderFieldsTooLarge
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RequestHeaderFieldsTooLarge()
		```
		- #### RetryWith
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") RetryWith()
		```
		- #### BlockedByParentalControls
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") BlockedByParentalControls()
		```
		- #### UnavailableForLegalReasons
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") UnavailableForLegalReasons()
		```
		- #### InternalServerError
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") InternalServerError()
		```
		- #### NotImplemented
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") NotImplemented()
		```
		- #### BadGateway
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") BadGateway()
		```
		- #### ServiceUnavailable
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") ServiceUnavailable()
		```
		- #### GatewayTimeout
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") GatewayTimeout()
		```
		- #### HttpVersionNotSupported
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") HttpVersionNotSupported()
		```
		- #### HTTPVersionNotSupported
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") HTTPVersionNotSupported()
		```
		
		Deprecated.
		deprecated in favor of HttpVersionNotSupported. Since 10\.1\.11\.
		- #### VariantAlsoNegotiates
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") VariantAlsoNegotiates()
		```
		- #### InsufficientStorage
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") InsufficientStorage()
		```
		- #### LoopDetected
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") LoopDetected()
		```
		- #### BandwidthLimitExceeded
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") BandwidthLimitExceeded()
		```
		- #### NotExtended
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") NotExtended()
		```
		- #### NetworkAuthenticationRequired
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") NetworkAuthenticationRequired()
		```
		- #### NetworkReadTimeout
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") NetworkReadTimeout()
		```
		- #### NetworkConnectTimeout
		
		
		
		```
		public [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") NetworkConnectTimeout()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.ClientError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Informational.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Redirection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.ServerError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Success.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html)*