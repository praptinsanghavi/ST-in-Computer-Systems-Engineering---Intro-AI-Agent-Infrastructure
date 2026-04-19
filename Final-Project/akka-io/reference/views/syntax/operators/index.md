---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:49Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/index.html
title: 'Operators :: Akka Documentation'
---

# Operators :: Akka Documentation

## Content

# Operators

This page provides an overview of all operators available in the View query language. Operators are special symbols or keywords that perform operations on values and return results.

## Comparison Operators

Comparison operators compare values and return boolean results.

| Operator | Description | Example |
| --- | --- | --- |
| [`=`](comparison.html#equals) | Equals | `name = 'John'` |
| [`!=`](comparison.html#not-equals) | Not equals | `category != 'Electronics'` |
| [`>`](comparison.html#greater-than) | Greater than | `price > 100` |
| [`>=`](comparison.html#greater-equals) | Greater than or equal to | `price >= 100` |
| [`<`](comparison.html#less-than) | Less than | `price < 50` |
| [`⇐`](comparison.html#less-equals) | Less than or equal to | `price ⇐ 50` |
| [`IS NULL`](is-null.html) | Tests if a value is NULL (missing) | `phoneNumber IS NULL` |
| [`IS NOT NULL`](is-null.html) | Tests if a value is not NULL (present) | `email IS NOT NULL` |

## Logical Operators

Logical operators combine boolean expressions.

| Operator | Description | Example |
| --- | --- | --- |
| [`AND`](logical.html#and) | Logical AND \- true if both conditions are true | `category = 'Books' AND price < 20` |
| [`OR`](logical.html#or) | Logical OR \- true if either condition is true | `category = 'Books' OR category = 'Magazines'` |
| [`NOT`](logical.html#not) | Logical NOT \- negates a condition | `NOT price > 100` |

## Set Membership Operators

Set membership operators check if a value is part of a set.

| Operator | Description | Example |
| --- | --- | --- |
| [`IN`](in.html) | Tests if a value matches any value in a list | `category IN ('Books', 'Magazines', 'Comics')` |
| [`= ANY`](any.html) | Tests if a value matches any element in an array | `tag = ANY(tags)` or `:tag = ANY(tags)` |

## Pattern Matching Operators

Pattern matching operators test if a string matches a pattern.

| Operator | Description | Example |
| --- | --- | --- |
| [`LIKE`](like.html) | Pattern matching with wildcards | `name LIKE 'Jo%'` |

## Operator Precedence

Operators are evaluated in the following order of precedence (from highest to lowest):

1. Parentheses `()`
2. Unary operators (`NOT`)
3. Comparison operators (`=`, `!=`, `<`, `>`, etc.)
4. `AND`
5. `OR`

Use parentheses to override the default precedence.

## Related Features

- [WHERE clause](../where.html) \- Using operators in query filters
- [JOIN](../join.html) \- Using operators in join conditions
- [Data Types](../../concepts/data-types.html) \- Type information for operators

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/reference/views/syntax/operators/any.html
- https://doc.akka.io/reference/views/syntax/operators/comparison.html
- https://doc.akka.io/reference/views/syntax/operators/in.html
- https://doc.akka.io/reference/views/syntax/operators/is-null.html
- https://doc.akka.io/reference/views/syntax/operators/like.html
- https://doc.akka.io/reference/views/syntax/operators/logical.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/index.html](https://doc.akka.io/reference/views/syntax/operators/index.html)*