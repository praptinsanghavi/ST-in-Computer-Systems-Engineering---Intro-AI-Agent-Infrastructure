---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/UriParser.html
title: UriParser
---

# UriParser

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class UriParser

- java.lang.Object
- - akka.parboiled2\.RuleDSL
	- - akka.parboiled2\.Parser
		- - akka.http.impl.model.parser.UriParser

- All Implemented Interfaces:
`[IpAddressParsing](IpAddressParsing.html "interface in akka.http.impl.model.parser")`, `[StringBuilding](StringBuilding.html "interface in akka.http.impl.model.parser")`, `akka.parboiled2.ParserMacroMethods`, `akka.parboiled2.RuleDSLActions`, `akka.parboiled2.RuleDSLBasics`, `akka.parboiled2.RuleDSLCombinators`

---

```
public final class UriParser
extends akka.parboiled2.Parser
implements [IpAddressParsing](IpAddressParsing.html "interface in akka.http.impl.model.parser"), [StringBuilding](StringBuilding.html "interface in akka.http.impl.model.parser")
```

INTERNAL API
 
 http://tools.ietf.org/html/rfc3986

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.parboiled2\.Parser
		
		
		`akka.parboiled2.Parser.__SubParserInput, akka.parboiled2.Parser.AlternativeDeliverySchemes, akka.parboiled2.Parser.CutError$, akka.parboiled2.Parser.DeliveryScheme<L extends akka.parboiled2.support.hlist.HList>, akka.parboiled2.Parser.DeliveryScheme$, akka.parboiled2.Parser.Fail, akka.parboiled2.Parser.Mark, akka.parboiled2.Parser.Mark$, akka.parboiled2.Parser.StartTracingException$, akka.parboiled2.Parser.TracingBubbleException, akka.parboiled2.Parser.UnquietMismatch$`
		- ### Nested classes/interfaces inherited from interface akka.parboiled2\.RuleDSLActions
		
		
		`akka.parboiled2.RuleDSLActions.ActionOperator<I extends akka.parboiled2.support.hlist.HList,​O extends akka.parboiled2.support.hlist.HList,​Ops extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface akka.parboiled2\.RuleDSLBasics
		
		
		`akka.parboiled2.RuleDSLBasics.CharRangeSupport`
		- ### Nested classes/interfaces inherited from interface akka.parboiled2\.RuleDSLCombinators
		
		
		`akka.parboiled2.RuleDSLCombinators.NTimes, akka.parboiled2.RuleDSLCombinators.WithSeparatedBy<I extends akka.parboiled2.support.hlist.HList,​O extends akka.parboiled2.support.hlist.HList>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UriParser](#%3Cinit%3E(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(akka.parboiled2.ParserInput input,  java.nio.charset.Charset uriParsingCharset,  [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode)` |  |
	| `[UriParser](#%3Cinit%3E(akka.parboiled2.ParserInput,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode,int))​(akka.parboiled2.ParserInput _input,  java.nio.charset.Charset uriParsingCharset,  [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,  int maxValueStackSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[authority](#authority())()` |  |
	| `scala.runtime.Nothing$` | `[fail](#fail(akka.parboiled2.ParseError,java.lang.String))​(akka.parboiled2.ParseError error,  java.lang.String target)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[fragment](#fragment())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[host](#host())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[hostAndPort](#hostAndPort())()` |  |
	| `akka.parboiled2.ParserInput` | `[input](#input())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[ipv4Host](#ipv4Host())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[ipv6Host](#ipv6Host())()` |  |
	| `int` | `[maxValueStackSize](#maxValueStackSize())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[origin](#origin())()` |  |
	| `[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[parseAbsoluteUri](#parseAbsoluteUri())()` |  |
	| `[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[parseAndResolveUriReference](#parseAndResolveUriReference(akka.http.scaladsl.model.Uri))​([Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") base)` |  |
	| `[Uri.Authority](../../../scaladsl/model/Uri.Authority.html "class in akka.http.scaladsl.model")` | `[parseAuthority](#parseAuthority())()` |  |
	| `[Uri.Host](../../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[parseHost](#parseHost())()` |  |
	| `[Uri.Authority](../../../scaladsl/model/Uri.Authority.html "class in akka.http.scaladsl.model")` | `[parseHttp2AuthorityPseudoHeader](#parseHttp2AuthorityPseudoHeader())()` |  |
	| `scala.Tuple2<[Uri.Path](../../../scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>>` | `[parseHttp2PathPseudoHeader](#parseHttp2PathPseudoHeader())()` |  |
	| `[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[parseHttpRequestTarget](#parseHttpRequestTarget())()` |  |
	| `[HttpOrigin](../../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")` | `[parseOrigin](#parseOrigin())()` |  |
	| `[Uri.Query](../../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[parseQuery](#parseQuery())()` |  |
	| `java.lang.String` | `[parseRawQueryString](#parseRawQueryString())()` |  |
	| `java.lang.String` | `[parseSafeRawQueryString](#parseSafeRawQueryString(java.lang.String))​(java.lang.String rawQueryString)` |  |
	| `[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model")` | `[parseUriReference](#parseUriReference())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[pchar](#pchar())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[port](#port())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri.Query](../../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>>` | `[query](#query())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[rawQueryString](#rawQueryString())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[relaxedHost](#relaxedHost())()` | A relaxed host rule to use in \`parseHost\` that also recognizes IPv6 address without the brackets. |
	| `void` | `[reset](#reset(akka.parboiled2.ParserInput))​(akka.parboiled2.ParserInput newInput)` | Allows to reuse this parser. |
	| `protected java.lang.StringBuilder` | `[sb](#sb())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[scheme](#scheme())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[segment](#segment())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[slashSegments](#slashSegments())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[URI](#URI())()` |  |
	| `java.nio.charset.Charset` | `[uriParsingCharset](#uriParsingCharset())()` |  |
	| `[Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[uriParsingMode](#uriParsingMode())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[userinfo](#userinfo())()` |  |
	
	
		- ### Methods inherited from class akka.parboiled2\.Parser
		
		
		`__advance, __bubbleUp, __bubbleUp, __enterAtomic, __enterNotPredicate, __enterQuiet, __exitAtomic, __exitNotPredicate, __exitQuiet, __hardFail, __inErrorAnalysis, __matchAnyOf, __matchAnyOf$default$2, __matchIgnoreCaseString, __matchIgnoreCaseString$default$2, __matchIgnoreCaseStringWrapped, __matchIgnoreCaseStringWrapped$default$2, __matchMap, __matchMapWrapped, __matchNoneOf, __matchNoneOf$default$2, __matchString, __matchString$default$2, __matchStringWrapped, __matchStringWrapped$default$2, __push, __registerMismatch, __restoreState, __run, __saveState, __subParserInput, __updateMaxCursor, $lessinit$greater$default$1, $lessinit$greater$default$2, akka$parboiled2$Parser$$_cursor, akka$parboiled2$Parser$$phase, charAt, charAtRC, copyStateFrom, cursor, cursorChar, errorTraceCollectionLimit, formatError, formatError$default$2, lastChar, valueStack`
		- ### Methods inherited from class akka.parboiled2\.RuleDSL
		
		
		`$amp, ANY, anyOf, atomic, capture, ch, drop, EOI, fail, failX, ignoreCase, ignoreCase, int2NTimes, MATCH, MISMATCH, MISMATCH0, noneOf, oneOrMore, optional, predicate, push, quiet, range2NTimes, rule2ActionOperator, rule2WithSeparatedBy, run, runSubParser, str, str2CharRangeSupport, test, valueMap, valueMap, valueMap$default$2, zeroOrMore`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.model.parser.[StringBuilding](StringBuilding.html "interface in akka.http.impl.model.parser")
		
		
		`[appendSB](StringBuilding.html#appendSB()), [appendSB](StringBuilding.html#appendSB(char)), [appendSB](StringBuilding.html#appendSB(int)), [appendSB](StringBuilding.html#appendSB(java.lang.String)), [clearSB](StringBuilding.html#clearSB()), [doPrepend](StringBuilding.html#doPrepend(char)), [doPrepend](StringBuilding.html#doPrepend(java.lang.String)), [doSet](StringBuilding.html#doSet(java.lang.String)), [prependSB](StringBuilding.html#prependSB()), [prependSB](StringBuilding.html#prependSB(char)), [prependSB](StringBuilding.html#prependSB(int)), [prependSB](StringBuilding.html#prependSB(java.lang.String)), [setSB](StringBuilding.html#setSB(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### UriParser
		
		
		
		```
		public UriParser​(akka.parboiled2.ParserInput _input,
		                 java.nio.charset.Charset uriParsingCharset,
		                 [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,
		                 int maxValueStackSize)
		```
		- #### UriParser
		
		
		
		```
		public UriParser​(akka.parboiled2.ParserInput input,
		                 java.nio.charset.Charset uriParsingCharset,
		                 [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode)
		```

	- ### Method Detail
	
	
	
		- #### sb
		
		
		
		```
		protected java.lang.StringBuilder sb()
		```
		
		
		Specified by:
		`[sb](StringBuilding.html#sb())` in interface `[StringBuilding](StringBuilding.html "interface in akka.http.impl.model.parser")`
		- #### uriParsingCharset
		
		
		
		```
		public java.nio.charset.Charset uriParsingCharset()
		```
		- #### uriParsingMode
		
		
		
		```
		public [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode()
		```
		- #### maxValueStackSize
		
		
		
		```
		public int maxValueStackSize()
		```
		- #### input
		
		
		
		```
		public akka.parboiled2.ParserInput input()
		```
		
		
		Specified by:
		`input` in class `akka.parboiled2.Parser`
		- #### parseAbsoluteUri
		
		
		
		```
		public [Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") parseAbsoluteUri()
		```
		- #### parseUriReference
		
		
		
		```
		public [Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") parseUriReference()
		```
		- #### parseAndResolveUriReference
		
		
		
		```
		public [Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") parseAndResolveUriReference​([Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") base)
		```
		- #### parseOrigin
		
		
		
		```
		public [HttpOrigin](../../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers") parseOrigin()
		```
		- #### parseHost
		
		
		
		```
		public [Uri.Host](../../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") parseHost()
		```
		- #### parseRawQueryString
		
		
		
		```
		public java.lang.String parseRawQueryString()
		```
		
		
		Returns:
		a 'raw' (percent\-encoded) query string that does not contain invalid characters.
		- #### parseSafeRawQueryString
		
		
		
		```
		public java.lang.String parseSafeRawQueryString​(java.lang.String rawQueryString)
		```
		
		
		Parameters:
		`rawQueryString` \- 'raw' (percent\-encoded) query string that in Relaxed mode may contain characters not allowed
		 by https://tools.ietf.org/html/rfc3986\#section\-3\.4 but is guaranteed not to have invalid percent\-encoded characters
		Returns:
		a 'raw' (percent\-encoded) query string that does not contain invalid characters.
		- #### parseQuery
		
		
		
		```
		public [Uri.Query](../../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") parseQuery()
		```
		- #### parseAuthority
		
		
		
		```
		public [Uri.Authority](../../../scaladsl/model/Uri.Authority.html "class in akka.http.scaladsl.model") parseAuthority()
		```
		- #### fail
		
		
		
		```
		public scala.runtime.Nothing$ fail​(akka.parboiled2.ParseError error,
		                                   java.lang.String target)
		```
		- #### reset
		
		
		
		```
		public void reset​(akka.parboiled2.ParserInput newInput)
		```
		
		Allows to reuse this parser.
		- #### URI
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> URI()
		```
		- #### origin
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> origin()
		```
		- #### scheme
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> scheme()
		```
		- #### authority
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> authority()
		```
		- #### userinfo
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> userinfo()
		```
		- #### hostAndPort
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> hostAndPort()
		```
		- #### host
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> host()
		```
		- #### relaxedHost
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> relaxedHost()
		```
		
		A relaxed host rule to use in \`parseHost\` that also recognizes IPv6 address without the brackets.
		- #### port
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> port()
		```
		- #### ipv4Host
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> ipv4Host()
		```
		- #### ipv6Host
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> ipv6Host()
		```
		- #### slashSegments
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> slashSegments()
		```
		- #### segment
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> segment()
		```
		- #### pchar
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> pchar()
		```
		- #### rawQueryString
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> rawQueryString()
		```
		- #### query
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri.Query](../../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>> query()
		```
		- #### fragment
		
		
		
		```
		public akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> fragment()
		```
		- #### parseHttpRequestTarget
		
		
		
		```
		public [Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model") parseHttpRequestTarget()
		```
		- #### parseHttp2AuthorityPseudoHeader
		
		
		
		```
		public [Uri.Authority](../../../scaladsl/model/Uri.Authority.html "class in akka.http.scaladsl.model") parseHttp2AuthorityPseudoHeader()
		```
		- #### parseHttp2PathPseudoHeader
		
		
		
		```
		public scala.Tuple2<[Uri.Path](../../../scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>> parseHttp2PathPseudoHeader()
		```
		
		
		Returns:
		path and percent\-encoded query string. When in in 'relaxed' mode, characters not permitted by https://tools.ietf.org/html/rfc3986\#section\-3\.4
		 are already automatically percent\-encoded here

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/IpAddressParsing.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/StringBuilding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/UriParser.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/UriParser.html)*