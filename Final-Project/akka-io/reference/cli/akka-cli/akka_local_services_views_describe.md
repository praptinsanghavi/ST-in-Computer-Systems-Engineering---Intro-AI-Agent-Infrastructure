---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:17Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_local_services_views_describe.html
title: 'akka local services views describe :: Akka Documentation'
---

# akka local services views describe :: Akka Documentation

## Content

# akka local services views describe

Describe a view.

## Synopsis

The `akka local service views describe` command shows a detailed description for a view under the selected service.

```
akka local services views describe SERVICE VIEW_ID [flags]
```

## Examples

```
> akka local service views describe customer-registry CustomerByName
```

## Options

```
  -h, --help             help for describe
      --owner string     the owner of the project to use, needed if you have two projects with the same name from different owners
      --project string   project to use if not using the default configured project
      --region string    region to use if project has more than one region
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka local services views](akka_local_services_views.html) \- Manage views.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_local_services_views.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_local_services_views_describe.html](https://doc.akka.io/reference/cli/akka-cli/akka_local_services_views_describe.html)*