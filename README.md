# local-jar-assembly-package-demo

第三方`Jar`非`Maven`管理。在生成可单独运行`Jar`（不依赖其他外部`Jar`）的解决方案示例`Demo`

## 说明

- 打包

    ```bash
    mvn package assembly:single
    ```

- 执行

    ```bash
    java -jar local-jar-assembly-package-demo-0.0.1-SNAPSHOT-release.jar
    ```

详情说明请参照： https://gaoming.blog.csdn.net/article/details/108282136 
