# Reproducer for [kluent-220](https://github.com/MarkusAmshove/Kluent/issues/220)

Both assertions (`.shouldBeEmpty()`, `shouldNotBeEmpty()`) pass when run with JRE 17.

When run with JRE11, `shouldBeEmpty()` fails.
