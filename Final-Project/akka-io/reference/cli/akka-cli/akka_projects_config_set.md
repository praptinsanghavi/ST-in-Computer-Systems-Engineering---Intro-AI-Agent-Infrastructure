---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:00Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_projects_config_set.html
title: 'akka projects config set :: Akka Documentation'
---

# akka projects config set :: Akka Documentation

## Content

# akka projects config set

Set project resources.

## Synopsis

The `akka project config set resource` command sets the value for a specific project *resource*.
The `akka project config unset resource` command removes configuration for a specific project *resource*.

Depending on the selected service additional options may have to be specified.
These can be provided using command line flags, in particular:

- \-\-broker\-service string

	- The type of the broker service, one of: \[google\-pubsub, kafka]
- \-\-gcp\-key string

	- The GCP key file.
	Either this or \-\-gcp\-key\-file is required if \[google\-pubsub] is the service.
- \-\-gcp\-key\-file string

	- The GCP key file.
	Either this or \-\-gcp\-key is required if \[google\-pubsub] is the service.

## Options

```
  -h, --help   help for set
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

- [akka projects config](akka_projects_config.html) \- Manage project configs.
- [akka projects config set broker](akka_projects_config_set_broker.html) \- Set the broker.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_projects_config.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_config_set_broker.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_projects_config_set.html](https://doc.akka.io/reference/cli/akka-cli/akka_projects_config_set.html)*