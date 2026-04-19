---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html
title: MultiNodeSpecCallbacks
---

# MultiNodeSpecCallbacks

## Content

Package [akka.remote.testkit](package-summary.html)
## Interface MultiNodeSpecCallbacks

- All Known Implementing Classes:
`[MultiNodeSpec](MultiNodeSpec.html "class in akka.remote.testkit")`

---

```
public interface MultiNodeSpecCallbacks
```

Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec
 and call these methods or by creating a trait that calls them and then mixing that trait with your test together
 with MultiNodeSpec.
 
 Example trait for MultiNodeSpec with ScalaTest
 

```

 trait STMultiNodeSpec extends MultiNodeSpecCallbacks with AnyWordSpecLike with Matchers with BeforeAndAfterAll {
   override def beforeAll() = multiNodeSpecBeforeAll()
   override def afterAll() = multiNodeSpecAfterAll()
 }
 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[multiNodeSpecAfterAll](#multiNodeSpecAfterAll())()` | Call this after the all test cases have run. |
	| `void` | `[multiNodeSpecBeforeAll](#multiNodeSpecBeforeAll())()` | Call this before the start of the test run. |

- - ### Method Detail
	
	
	
		- #### multiNodeSpecAfterAll
		
		
		
		```
		void multiNodeSpecAfterAll()
		```
		
		Call this after the all test cases have run. NOT after every test case.
		- #### multiNodeSpecBeforeAll
		
		
		
		```
		void multiNodeSpecBeforeAll()
		```
		
		Call this before the start of the test run. NOT before every test case.

## Code Examples

### Example 1: Interface MultiNodeSpecCallbacks

```text
trait STMultiNodeSpec extends MultiNodeSpecCallbacks with AnyWordSpecLike with Matchers with BeforeAndAfterAll {
   override def beforeAll() = multiNodeSpecBeforeAll()
   override def afterAll() = multiNodeSpecAfterAll()
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html)*