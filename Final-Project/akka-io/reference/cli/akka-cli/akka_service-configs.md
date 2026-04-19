---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:09Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_service-configs.html
title: 'akka service-configs :: Akka Documentation'
---

# akka service-configs :: Akka Documentation

## Content

# akka service\-configs

Manage service configs for a Akka project.

## Synopsis

The `akka service-configs` command manages service configs for the currently configured project.
Service configs contain HOCON configuration that overrides a service’s application.conf.

## Options

```
  -h, --help   help for service-configs
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

- [akka](akka.html) \- Akka control
- [akka service\-configs create](akka_service-configs_create.html) \- Create or update a service config in the current project.
- [akka service\-configs delete](akka_service-configs_delete.html) \- Delete a service config from the current project.
- [akka service\-configs get](akka_service-configs_get.html) \- Get a service config in the current project.
- [akka service\-configs list](akka_service-configs_list.html) \- List the service configs in the current project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_create.html
- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_delete.html
- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_get.html
- https://doc.akka.io/reference/cli/akka-cli/akka_service-configs_list.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_service-configs.html](https://doc.akka.io/reference/cli/akka-cli/akka_service-configs.html)*