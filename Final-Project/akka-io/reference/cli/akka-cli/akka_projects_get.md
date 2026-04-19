---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:03Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_get.html
title: 'akka projects get :: Akka Documentation'
---

# akka projects get :: Akka Documentation

## Content

# akka projects get

Get project information.

## Synopsis

The `akka projects get name` command will display information about the project with name *name*, if it exists.
Using the *id* of the project is also supported.
If no project name or id is supplied, the current project is displayed.

|  | Use `akka projects list` to confirm the project’s *name* or *id*. |
| --- | --- |

```
akka projects get PROJECT [flags]
```

## Options

```
  -h, --help             help for get
      --owner string     the owner of the project to use, needed if you have two projects with the same name from different owners
      --project string   project to use if not using the default configured project
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

- [akka projects](akka_projects.html) \- Manage your Akka projects.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_get.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_get.html)*