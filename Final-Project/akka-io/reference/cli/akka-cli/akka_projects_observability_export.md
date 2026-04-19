---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:15Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_export.html
title: 'akka projects observability export :: Akka Documentation'
---

# akka projects observability export :: Akka Documentation

## Content

# akka projects observability export

Export an observability descriptor from the currently configured project.

## Synopsis

The `akka project observability export` command exports the observability descriptor.

```
akka projects observability export [flags]
```

## Examples

```
akka project observability export -f _file-name_
```

## Options

```
  -f, --file string      The YAML file to apply. If not supplied, will write to stdout.
      --force-global     force an existing regional resource to be configured as a global resource
      --force-regional   force an existing global resource to be configured as a regional resource
  -h, --help             help for export
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

- [akka projects observability](akka_projects_observability.html) \- Manage the observability settings for your Akka project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_export.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_observability_export.html)*