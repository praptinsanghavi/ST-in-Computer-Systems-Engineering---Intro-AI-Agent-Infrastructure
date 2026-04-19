---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonRules.html
title: CommonRules
---

# CommonRules

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface CommonRules

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface CommonRules
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[attribute](#attribute())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpChallenge](../../../scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[challenge](#challenge())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[comment](#comment(int))​(int maxNesting)` |  |
	| `[HttpCookiePair](../../../scaladsl/model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[createCookiePair](#createCookiePair(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `[DateTime](../../../scaladsl/model/DateTime.html "class in akka.http.scaladsl.model")` | `[createDateTime](#createDateTime(int,int,int,int,int,int,int))​(int year,  int month,  int day,  int hour,  int min,  int sec,  int wkday)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[credentials](#credentials())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[CRLF](#CRLF())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[ctext](#ctext())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>>>` | `[date1](#date1())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>>>` | `[date2](#date2())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>>` | `[date3](#date3())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[day](#day())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[digit](#digit())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[digit2](#digit2())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[digit4](#digit4())()` |  |
	| `int` | `[digitInt](#digitInt(char))​(char c)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[hour](#hour())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpMethod](../../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>>` | `[httpMethodDef](#httpMethodDef())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Language](../../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[language](#language())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[listSep](#listSep())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[longNumberCapped](#longNumberCapped())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[longNumberCappedAtIntMaxValue](#longNumberCappedAtIntMaxValue())()` |  |
	| `int` | `[maxCommentParsingDepth](#maxCommentParsingDepth())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[minute](#minute())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[month](#month())()` |  |
	| `[UriParser](UriParser.html "class in akka.http.impl.model.parser")` | `[newUriParser](#newUriParser(akka.parboiled2.ParserInput))​(akka.parboiled2.ParserInput input)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[OCTET](#OCTET())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[OWS](#OWS())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<scala.Tuple2<java.lang.String,​java.lang.String>,​akka.parboiled2.support.hlist.HNil>>` | `[parameter](#parameter())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>>` | `[product](#product())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<scala.collection.immutable.Seq<[ProductVersion](../../../scaladsl/model/headers/ProductVersion.html "class in akka.http.scaladsl.model.headers")>,​akka.parboiled2.support.hlist.HNil>>` | `[products](#products())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[qdtext](#qdtext())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[qvalue](#qvalue())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[RWS](#RWS())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[second](#second())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[subtype](#subtype())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[token](#token())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[token0](#token0())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[token68](#token68())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[type](#type())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>>` | `[uriReference](#uriReference())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[value](#value())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[weight](#weight())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[word](#word())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[ws](#ws(char))​(char c)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[ws](#ws(java.lang.String))​(java.lang.String s)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[year](#year())()` |  |

- - ### Method Detail
	
	
	
		- #### CRLF
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> CRLF()
		```
		- #### OCTET
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> OCTET()
		```
		- #### OWS
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> OWS()
		```
		- #### RWS
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> RWS()
		```
		- #### attribute
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> attribute()
		```
		- #### challenge
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpChallenge](../../../scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> challenge()
		```
		- #### comment
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> comment​(int maxNesting)
		```
		- #### createCookiePair
		
		
		
		```
		[HttpCookiePair](../../../scaladsl/model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers") createCookiePair​(java.lang.String name,
		                                java.lang.String value)
		```
		- #### createDateTime
		
		
		
		```
		[DateTime](../../../scaladsl/model/DateTime.html "class in akka.http.scaladsl.model") createDateTime​(int year,
		                        int month,
		                        int day,
		                        int hour,
		                        int min,
		                        int sec,
		                        int wkday)
		```
		- #### credentials
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> credentials()
		```
		- #### ctext
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> ctext()
		```
		- #### date1
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>>> date1()
		```
		- #### date2
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>>> date2()
		```
		- #### date3
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>> date3()
		```
		- #### day
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> day()
		```
		- #### digit
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> digit()
		```
		- #### digit2
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> digit2()
		```
		- #### digit4
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> digit4()
		```
		- #### digitInt
		
		
		
		```
		int digitInt​(char c)
		```
		- #### hour
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> hour()
		```
		- #### httpMethodDef
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpMethod](../../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>> httpMethodDef()
		```
		- #### language
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Language](../../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> language()
		```
		- #### listSep
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> listSep()
		```
		- #### longNumberCapped
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> longNumberCapped()
		```
		- #### longNumberCappedAtIntMaxValue
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> longNumberCappedAtIntMaxValue()
		```
		- #### maxCommentParsingDepth
		
		
		
		```
		int maxCommentParsingDepth()
		```
		- #### minute
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> minute()
		```
		- #### month
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> month()
		```
		- #### newUriParser
		
		
		
		```
		[UriParser](UriParser.html "class in akka.http.impl.model.parser") newUriParser​(akka.parboiled2.ParserInput input)
		```
		- #### parameter
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<scala.Tuple2<java.lang.String,​java.lang.String>,​akka.parboiled2.support.hlist.HNil>> parameter()
		```
		- #### product
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>> product()
		```
		- #### products
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<scala.collection.immutable.Seq<[ProductVersion](../../../scaladsl/model/headers/ProductVersion.html "class in akka.http.scaladsl.model.headers")>,​akka.parboiled2.support.hlist.HNil>> products()
		```
		- #### qdtext
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> qdtext()
		```
		- #### qvalue
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> qvalue()
		```
		- #### second
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> second()
		```
		- #### subtype
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> subtype()
		```
		- #### token
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> token()
		```
		- #### token0
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> token0()
		```
		- #### token68
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> token68()
		```
		- #### type
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> type()
		```
		- #### uriReference
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>> uriReference()
		```
		- #### value
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> value()
		```
		- #### weight
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> weight()
		```
		- #### word
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> word()
		```
		- #### ws
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> ws​(char c)
		```
		- #### ws
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> ws​(java.lang.String s)
		```
		- #### year
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> year()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/UriParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonRules.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonRules.html)*