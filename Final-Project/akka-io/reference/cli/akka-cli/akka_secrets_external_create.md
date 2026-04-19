---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:47Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create.html
title: 'akka secrets external create :: Akka Documentation'
---

# akka secrets external create :: Akka Documentation

## Content

# akka secrets external create

Create an external secret in the current project.

## Synopsis

The `akka secrets external create` command creates an external secret in the currently configured project.

## Options

```
  -h, --help   help for create
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

- [akka secrets external](akka_secrets_external.html) \- Manage external secrets for an Akka project.
- [akka secrets external create aws](akka_secrets_external_create_aws.html) \- Create an AWS external secret in the current project.
- [akka secrets external create azure](akka_secrets_external_create_azure.html) \- Create an Azure KeyVault external secret in the current project.
- [akka secrets external create gcp](akka_secrets_external_create_gcp.html) \- Create a GCP external secret in the current project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external.html
- https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create_aws.html
- https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create_azure.html
- https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create_gcp.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create.html](https://doc.akka.io/reference/cli/akka-cli/akka_secrets_external_create.html)*