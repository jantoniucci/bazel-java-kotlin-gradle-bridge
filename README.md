# bazel kotlin-gradle bridge
This is a proof of concept integrating a gradle build into Bazel.

The project is a `java-app` depending on `kotlin-lib`, which is built using gradle.

The magic is on `kotlin-lib/BUILD` file :

```sh
genrule(
    name = "C2KtLib",
    srcs = glob(["**"], exclude=["gradleBuild/**"]),
    outs = ["demo/C2Kt.class"],
    local = 1,
    cmd = "mkdir -p $$PWD/bazel-out/darwin-fastbuild/bin/kotlin-lib/demo && cd $$PWD/kotlin-lib && gradle build && cp $$PWD/gradleBuild/classes/kotlin/main/demo/* $$PWD/../bazel-out/darwin-fastbuild/bin/kotlin-lib/demo",
    visibility = ["//visibility:public"]
)
```

## Run it!
```sh
bazel build //java-app:JavaApp --verbose_failures --sandbox_debug
```