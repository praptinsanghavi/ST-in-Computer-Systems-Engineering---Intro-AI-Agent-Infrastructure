---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:42Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_config.html
title: 'akka config :: Akka Documentation'
---

# akka config :: Akka Documentation

## Content

# akka config

Manage configuration and context for the Akka CLI.

## Synopsis

The `akka config` commands display and set configuration contexts and values that apply to subsequent commands.
These are often useful to make your CLI experience more fluid.
For example, by having set a default *project*, you can avoid specifying the project id or name in every command.

Configuration settings are stored in a file on your local system, by default at `.akka/config.yaml` in your home directory.
This location can be adjusted with the `--config` flag.

## Options

```
  -h, --help   help for config
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
- [akka config clear](akka_config_clear.html) \- Clear configuration value for key.
- [akka config clear\-cache](akka_config_clear-cache.html) \- Clear all cached data from the current context.
- [akka config current\-context](akka_config_current-context.html) \- Show the current context.
- [akka config delete\-context](akka_config_delete-context.html) \- Delete the given context.
- [akka config get](akka_config_get.html) \- Get value for key.
- [akka config get\-organization](akka_config_get-organization.html) \- Get the currently set organization.
- [akka config get\-project](akka_config_get-project.html) \- Get the currently set project.
- [akka config list](akka_config_list.html) \- List config values.
- [akka config list\-contexts](akka_config_list-contexts.html) \- List the configured contexts.
- [akka config rename\-context](akka_config_rename-context.html) \- Rename the current context to the given name.
- [akka config set](akka_config_set.html) \- Set key to value in the current context.
- [akka config use\-context](akka_config_use-context.html) \- Switch to a context.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_clear-cache.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_clear.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_current-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_delete-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get-organization.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get-project.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_list-contexts.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_rename-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_set.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_use-context.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_config.html](https://doc.akka.io/reference/cli/akka-cli/akka_config.html)*