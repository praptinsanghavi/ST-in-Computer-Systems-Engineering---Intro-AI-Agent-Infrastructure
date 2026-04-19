---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing.html
title: Base64Parsing
---

# Base64Parsing

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface Base64Parsing

- ---

```
public interface Base64Parsing
```

INTERNAL API
 
 Rules for parsing Base\-64 encoded strings.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>>` | `[base64CustomBlock](#base64CustomBlock())()` | Parses a akka.parboiled2\.util.Base64\.custom()\-encoded string potentially containing newlines  and decodes it onto the value stack. |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>>` | `[base64CustomString](#base64CustomString())()` | Parses a akka.parboiled2\.util.Base64\.custom()\-encoded string and decodes it onto the value stack. |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>>` | `[base64StringOrBlock](#base64StringOrBlock(akka.parboiled2.CharPredicate,scala.Function1))​(akka.parboiled2.CharPredicate alphabet,  scala.Function1<char[],​byte[]> decoder)` | Parses a BASE64\-encoded string with the given alphabet and decodes it onto the value  stack using the given codec. |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>>` | `[rfc2045Block](#rfc2045Block())()` | Parses an RFC4045\-encoded string potentially containing newlines and decodes it onto the value stack. |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>>` | `[rfc2045String](#rfc2045String())()` | Parses an RFC4045\-encoded string and decodes it onto the value stack. |

- - ### Method Detail
	
	
	
		- #### rfc2045String
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>> rfc2045String()
		```
		
		Parses an RFC4045\-encoded string and decodes it onto the value stack.
		
		Returns:
		(undocumented)
		- #### rfc2045Block
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>> rfc2045Block()
		```
		
		Parses an RFC4045\-encoded string potentially containing newlines and decodes it onto the value stack.
		
		Returns:
		(undocumented)
		- #### base64CustomString
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>> base64CustomString()
		```
		
		Parses a akka.parboiled2\.util.Base64\.custom()\-encoded string and decodes it onto the value stack.
		
		Returns:
		(undocumented)
		- #### base64CustomBlock
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>> base64CustomBlock()
		```
		
		Parses a akka.parboiled2\.util.Base64\.custom()\-encoded string potentially containing newlines
		 and decodes it onto the value stack.
		
		Returns:
		(undocumented)
		- #### base64StringOrBlock
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<byte[],​akka.parboiled2.support.hlist.HNil>> base64StringOrBlock​(akka.parboiled2.CharPredicate alphabet,
		                                                                                                                                                                               scala.Function1<char[],​byte[]> decoder)
		```
		
		Parses a BASE64\-encoded string with the given alphabet and decodes it onto the value
		 stack using the given codec.
		
		Parameters:
		`alphabet` \- (undocumented)
		`decoder` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing.html)*