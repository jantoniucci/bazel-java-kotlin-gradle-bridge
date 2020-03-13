load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "JavaApp",
    srcs = glob(["**/*.java"]),
    deps = ["//kotlin-lib:C2KtLib"],
    main_class = "demo.App"
)
