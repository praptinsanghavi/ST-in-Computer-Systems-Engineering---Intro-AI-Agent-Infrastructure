---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:10Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_get.html
title: 'akka service-configs get :: Akka Documentation'
---

# akka service-configs get :: Akka Documentation

## Content

# akka service\-configs get

Get a service config in the current project.

## Synopsis

The `akka service-configs get config` command will get a service config in the currently configured project.

```
akka service-configs get CONFIG_NAME [flags]
```

## Examples

```
akka service-configs get my-config
```

## Options

```
      --all-regions      run the command on all regions
  -h, --help             help for get
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

- [akka service\-configs](akka_service-configs.html) \- Manage service configs for a Akka project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_get.html](https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_get.html)*