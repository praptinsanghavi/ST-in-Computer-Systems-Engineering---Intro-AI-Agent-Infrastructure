---
description: 'declaration: package: akka.javasdk.annotations, annotation type: JWT,
  annotation type: StaticClaim'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:09Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.StaticClaim.html
title: JWT.StaticClaim
---

# JWT.StaticClaim

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: JWT, annotation type: StaticClaim

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface JWT.StaticClaim

Enclosing class:
`[JWT](JWT.html "annotation interface in akka.javasdk.annotations")`

---

public static @interface JWT.StaticClaim
A static claim is a claim that is required to be present on the token, and have a particular
 value. This can be used to ensure that the token has a particular role, for example.

 If the claim is not present, or does not have the expected value, then the request will be
 rejected with a 403 Forbidden response.

 

If the claim is present, but does not have the expected value, then the request will be
 rejected with a 403 Forbidden response.

 

If the claim is present, and has the expected value, then the request will be allowed to
 proceed.

 

Each static claim can be configured either with a 'value' or a 'pattern' that will be
 matched against the value of the claim, but not both.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[claim](#claim())`

The claim name needs to be a hardcoded literal (e.g.
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[pattern](#pattern())`

This receives a regex expression (Java flavor) used to match on the incoming claim value.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")[]`
`[values](#values())`

The value can be set as: a hardcoded literal (e.g.

- ## Element Details

	- ### claim
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") claim
	The claim name needs to be a hardcoded literal (e.g. "role")
	- ### values
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\[] values
	The value can be set as: a hardcoded literal (e.g. "admin"), an ENV variable (e.g
	 "${ENV\_VAR}") or a combination of both (e.g. "${ENV\_VAR}\-admin"). When declaring multiple
	 values, ALL of those will be required when validating the claim.
	
	Default:
	`{}`
	- ### pattern
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") pattern
	This receives a regex expression (Java flavor) used to match on the incoming claim value.
	 Cannot be used in conjunction with `value` field above. It's one or the other.
	
	 NOTE: when signing, a static claim defined with a pattern will not be included in the
	 token.
	
	 
	
	Usage examples:
	
	 
	
	
		- claim value is not empty: "\\\\S\+"
		- claim value has one of 2 possible values: "^(admin\|manager)$"
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.StaticClaim.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.StaticClaim.html)*