genrule(
    name = "C2KtLib",
    srcs = glob(["**"], exclude=["gradleBuild/**"]),
    outs = ["demo/C2Kt.class"],
    local = 1,
    cmd = "mkdir -p $$PWD/bazel-out/darwin-fastbuild/bin/kotlin-lib/demo && cd $$PWD/kotlin-lib && gradle build && cp $$PWD/gradleBuild/classes/kotlin/main/demo/* $$PWD/../bazel-out/darwin-fastbuild/bin/kotlin-lib/demo",
    visibility = ["//visibility:public"]
)


